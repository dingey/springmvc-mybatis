package com.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.mapper.AbstractMapper;
import com.di.mapper.UserMapper;
import com.di.model.User;
import com.di.model.UserExample;

@Service
public class UserService extends AbstractService<User, UserExample> {
	@Autowired
	private UserMapper userMapper;

	public User selectUserByUsername(String userName) {
		UserExample ue = new UserExample();
		ue.createCriteria().andUserNameEqualTo(userName);
		List<User> us = userMapper.selectByExample(ue);
		return us.size() > 0 ? us.get(0) : null;
	}

	@Override
	public AbstractMapper<User, UserExample> getAbstractMapper() {
		return userMapper;
	}

}
