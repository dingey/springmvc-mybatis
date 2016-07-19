package com.fm.interceptor;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author di
 * @Remark 方法拦截器
 */
public class MethodBeforeInterceptor implements MethodBeforeAdvice {

	public void before(Method method, Object[] arg1, Object arg2) throws Throwable {
		if (method.isAnnotationPresent(Module.class)) {
		}
	}

}
