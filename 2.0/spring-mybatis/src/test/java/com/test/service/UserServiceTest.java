package com.test.service;

import org.junit.Test;
import com.di.service.UserService;
import com.test.AbstractTest;

/**
 * @author di
 */
public class UserServiceTest extends AbstractTest {

	private UserService userService;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		userService = (UserService) context.getBean("userService");
	}

	@Test
	public void test() {
		userService.get(1);
	}
}
