package com.di.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.di.mapper.AbstractMapper;
import com.di.mapper.UserMapper;
import com.di.model.User;
import com.di.model.UserExample;

/**
 * @author di:
 * @date 创建时间：2016年10月28日 下午5:43:38
 * @version
 */
@Service
public class UserService extends AbstractService<User, UserExample> {
	@Autowired
	private UserMapper userMapper;

	@Override
	public AbstractMapper<User, UserExample> getAbstractMapper() {
		return userMapper;
	}

}
