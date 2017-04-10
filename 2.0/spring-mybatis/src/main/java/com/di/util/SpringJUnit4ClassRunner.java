package com.di.util;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.internal.runners.model.ReflectiveCallable;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.internal.runners.statements.Fail;
import org.junit.internal.runners.statements.FailOnTimeout;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.springframework.test.annotation.ProfileValueUtils;
import org.springframework.test.annotation.TestAnnotationUtils;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;
import org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks;
import org.springframework.test.context.junit4.statements.RunAfterTestMethodCallbacks;
import org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks;
import org.springframework.test.context.junit4.statements.RunBeforeTestMethodCallbacks;
import org.springframework.test.context.junit4.statements.SpringFailOnTimeout;
import org.springframework.test.context.junit4.statements.SpringRepeat;
import org.springframework.util.ClassUtils;
import org.springframework.util.ReflectionUtils;

/**
 * @author di
 */
@SuppressWarnings({"unchecked","rawtypes","deprecation"})
public class SpringJUnit4ClassRunner extends BlockJUnit4ClassRunner {
	private static final Log logger = LogFactory.getLog(SpringJUnit4ClassRunner.class);
	private static final Method withRulesMethod;
	private final TestContextManager testContextManager;

	private static void ensureSpringRulesAreNotPresent(Class<?> testClass) {
		for (Field field : testClass.getFields()) {
			if (SpringClassRule.class.isAssignableFrom(field.getType())) {
				throw new IllegalStateException(String.format(
						"Detected SpringClassRule field in test class [%s], but SpringClassRule cannot be used with the SpringJUnit4ClassRunner.",
						new Object[] { testClass.getName() }));
			}
			if (SpringMethodRule.class.isAssignableFrom(field.getType()))
				throw new IllegalStateException(String.format(
						"Detected SpringMethodRule field in test class [%s], but SpringMethodRule cannot be used with the SpringJUnit4ClassRunner.",
						new Object[] { testClass.getName() }));
		}
	}

	public SpringJUnit4ClassRunner(Class<?> clazz) throws InitializationError {
		super(clazz);
		if (logger.isDebugEnabled()) {
			logger.debug("SpringJUnit4ClassRunner constructor called with [" + clazz + "]");
		}
		ensureSpringRulesAreNotPresent(clazz);
		this.testContextManager = createTestContextManager(clazz);
	}

	protected TestContextManager createTestContextManager(Class<?> clazz) {
		return new TestContextManager(clazz);
	}

	protected final TestContextManager getTestContextManager() {
		return this.testContextManager;
	}

	public Description getDescription() {
		if (!(ProfileValueUtils.isTestEnabledInThisEnvironment(getTestClass().getJavaClass()))) {
			return Description.createSuiteDescription(getTestClass().getJavaClass());
		}
		return super.getDescription();
	}

	public void run(RunNotifier notifier) {
		if (!(ProfileValueUtils.isTestEnabledInThisEnvironment(getTestClass().getJavaClass()))) {
			notifier.fireTestIgnored(getDescription());
			return;
		}
		String configDirPath = System.getProperty("CONFIG_DIR_PATH");
		if (configDirPath == null || configDirPath.isEmpty()) {
			String path = "";
			try {
				path = Thread.currentThread().getContextClassLoader().getResource("").toURI().getPath();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			path = path.replaceFirst("test-classes", "classes") + "config";
			File f = new File(path);
			if (!f.exists() || !f.isDirectory()) {
				throw new RuntimeException("系统环境变量CONFIG_DIR_PATH未配置,尝试从项目下加载配置文件失败！"+path);
			}
			System.setProperty("CONFIG_DIR_PATH", path);
		}
		super.run(notifier);
	}

	protected Statement withBeforeClasses(Statement statement) {
		Statement junitBeforeClasses = super.withBeforeClasses(statement);
		return new RunBeforeTestClassCallbacks(junitBeforeClasses, getTestContextManager());
	}

	protected Statement withAfterClasses(Statement statement) {
		Statement junitAfterClasses = super.withAfterClasses(statement);
		return new RunAfterTestClassCallbacks(junitAfterClasses, getTestContextManager());
	}

	protected Object createTest() throws Exception {
		Object testInstance = super.createTest();
		getTestContextManager().prepareTestInstance(testInstance);
		return testInstance;
	}

	protected void runChild(FrameworkMethod frameworkMethod, RunNotifier notifier) {
		Description description = describeChild(frameworkMethod);
		if (isTestMethodIgnored(frameworkMethod)) {
			notifier.fireTestIgnored(description);
		} else {
			Statement statement;
			try {
				statement = methodBlock(frameworkMethod);
			} catch (Throwable ex) {
				statement = new Fail(ex);
			}
			runLeaf(statement, description, notifier);
		}
	}

	protected Statement methodBlock(FrameworkMethod frameworkMethod) {
		Object testInstance;
		try {
			testInstance = new ReflectiveCallable() {
				protected Object runReflectiveCall() throws Throwable {
					return SpringJUnit4ClassRunner.this.createTest();
				}
			}.run();
		} catch (Throwable ex) {
			return new Fail(ex);
		}
		Statement statement = methodInvoker(frameworkMethod, testInstance);
		statement = possiblyExpectingExceptions(frameworkMethod, testInstance, statement);
		statement = withBefores(frameworkMethod, testInstance, statement);
		statement = withAfters(frameworkMethod, testInstance, statement);
		statement = withRulesReflectively(frameworkMethod, testInstance, statement);
		statement = withPotentialRepeat(frameworkMethod, testInstance, statement);
		statement = withPotentialTimeout(frameworkMethod, testInstance, statement);
		return statement;
	}

	private Statement withRulesReflectively(FrameworkMethod frameworkMethod, Object testInstance, Statement statement) {
		return ((Statement) ReflectionUtils.invokeMethod(withRulesMethod, this,
				new Object[] { frameworkMethod, testInstance, statement }));
	}

	protected boolean isTestMethodIgnored(FrameworkMethod frameworkMethod) {
		Method method = frameworkMethod.getMethod();
		return ((method.isAnnotationPresent(Ignore.class))
				|| (!(ProfileValueUtils.isTestEnabledInThisEnvironment(method, getTestClass().getJavaClass()))));
	}

	protected Statement possiblyExpectingExceptions(FrameworkMethod frameworkMethod, Object testInstance,
			Statement next) {
		Class expectedException = getExpectedException(frameworkMethod);
		return ((expectedException != null) ? new ExpectException(next, expectedException) : next);
	}

	protected Class<? extends Throwable> getExpectedException(FrameworkMethod frameworkMethod) {
		Test test = (Test) frameworkMethod.getAnnotation(Test.class);
		return (((test != null) && (test.expected() != Test.None.class)) ? test.expected() : null);
	}

	protected Statement withPotentialTimeout(FrameworkMethod frameworkMethod, Object testInstance, Statement next) {
		Statement statement = null;
		long springTimeout = getSpringTimeout(frameworkMethod);
		long junitTimeout = getJUnitTimeout(frameworkMethod);
		if ((springTimeout > 0L) && (junitTimeout > 0L)) {
			String msg = String.format(
					"Test method [%s] has been configured with Spring's @Timed(millis=%s) and JUnit's @Test(timeout=%s) annotations, but only one declaration of a 'timeout' is permitted per test method.",
					new Object[] { frameworkMethod.getMethod(), Long.valueOf(springTimeout),
							Long.valueOf(junitTimeout) });
			logger.error(msg);
			throw new IllegalStateException(msg);
		}
		if (springTimeout > 0L) {
			statement = new SpringFailOnTimeout(next, springTimeout);
		} else if (junitTimeout > 0L) {
			statement = new FailOnTimeout(next, junitTimeout);
		} else {
			statement = next;
		}

		return statement;
	}

	protected long getJUnitTimeout(FrameworkMethod frameworkMethod) {
		Test test = (Test) frameworkMethod.getAnnotation(Test.class);
		return (((test != null) && (test.timeout() > 0L)) ? test.timeout() : 0L);
	}

	protected long getSpringTimeout(FrameworkMethod frameworkMethod) {
		return TestAnnotationUtils.getTimeout(frameworkMethod.getMethod());
	}

	protected Statement withBefores(FrameworkMethod frameworkMethod, Object testInstance, Statement statement) {
		Statement junitBefores = super.withBefores(frameworkMethod, testInstance, statement);
		return new RunBeforeTestMethodCallbacks(junitBefores, testInstance, frameworkMethod.getMethod(),
				getTestContextManager());
	}

	protected Statement withAfters(FrameworkMethod frameworkMethod, Object testInstance, Statement statement) {
		Statement junitAfters = super.withAfters(frameworkMethod, testInstance, statement);
		return new RunAfterTestMethodCallbacks(junitAfters, testInstance, frameworkMethod.getMethod(),
				getTestContextManager());
	}

	protected Statement withPotentialRepeat(FrameworkMethod frameworkMethod, Object testInstance, Statement next) {
		return new SpringRepeat(next, frameworkMethod.getMethod());
	}

	static {
		boolean junit4dot9Present = ClassUtils.isPresent("org.junit.runners.model.MultipleFailureException",
				SpringJUnit4ClassRunner.class.getClassLoader());
		if (!(junit4dot9Present)) {
			throw new IllegalStateException(
					String.format("Failed to find class [%s]: SpringJUnit4ClassRunner requires JUnit 4.9 or higher.",
							new Object[] { "org.junit.runners.model.MultipleFailureException" }));
		}

		withRulesMethod = ReflectionUtils.findMethod(SpringJUnit4ClassRunner.class, "withRules",
				new Class[] { FrameworkMethod.class, Object.class, Statement.class });

		if (withRulesMethod == null) {
			throw new IllegalStateException(
					"Failed to find withRules() method: SpringJUnit4ClassRunner requires JUnit 4.9 or higher.");
		}

		ReflectionUtils.makeAccessible(withRulesMethod);
	}
}