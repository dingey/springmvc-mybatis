package com.fm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fm.mapper.AbstractMapper;
import com.fm.mapper.UserMapper;
import com.fm.model.User;
import com.fm.service.UserService;

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
