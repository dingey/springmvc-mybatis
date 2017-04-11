package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

/**
 * @author d
 */
public class AbstractTest extends TestCase {
	protected ClassPathXmlApplicationContext context;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		path = path.replaceFirst("test-classes", "classes") + "config";
		System.setProperty("CONFIG_DIR_PATH", path);
		context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
	}

}
