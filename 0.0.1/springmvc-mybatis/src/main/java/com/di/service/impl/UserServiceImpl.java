package com.di.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.mapper.AbstractMapper;
import com.di.mapper.UserMapper;
import com.di.model.User;
import com.di.service.UserService;

@Service("userService")
public class UserServiceImpl extends AbstractServiceImpl<User> implements UserService {
	@Autowired
	private UserMapper userMapper;

	public User selectUserByUsername(String userName) {
		return userMapper.selectUserByUsername(userName);
	}

	@Override
	public AbstractMapper<User> getMapper() {
		return userMapper;
	}

}
