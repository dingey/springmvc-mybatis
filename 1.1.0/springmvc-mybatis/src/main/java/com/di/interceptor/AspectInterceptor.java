package com.di.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectInterceptor {
	// 这个可用来替代以后重复出现的. 直接在后面的Before("myMethod()")就行了.
	@Pointcut("execution(public * com.fm.service..*.*(..))")
	public void myMethod() {
	};

	// 下面用到的是织入点语法, 看文档里面有. 就是指定在该方法前执行
	// @Before("execution(public void
	// com.dao.impl.UserDAOImp.save(com.model.User))")
	// 记住下面这种通用的, *表示所有
	@Before("execution(public * com.fm.service..*.*(..))")
	public void beforeMethod() {
		System.out.println("save start......");
	}

	// 正常执行完后
	@AfterReturning("execution(public * com.fm.service.impl.*.*(..))")
	public void afterReturnning() {
		System.out.println("after save......");
	}

	// 抛出异常时才调用
	@AfterThrowing("myMethod()")
	public void afterThrowing() {
		System.out.println("after throwing......");
	}

	// 环绕, 这个特殊点.
	@Around("myMethod()")
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		// 加逻辑的时候, 不要依赖执行的的先后顺序
		System.out.println("method around start!");
		pjp.proceed();
		System.out.println("method around end!");
	}
}
