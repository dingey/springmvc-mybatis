package com.test.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.di.model.User;
import com.di.service.UserService;
import com.test.AnnotationTest;

/**
 * @author di
 */
public class UserAnnotationTest extends AnnotationTest{
	@Autowired
	private UserService userService;

	@Test
	public void test() {
		User user = userService.get(1);
		System.out.println(user.getUserName());
	}
}
