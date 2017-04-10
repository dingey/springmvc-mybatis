package com.di.service.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.di.mapper.UserMapper;
import com.di.model.User;

/**
 * @author di
 */
@Service
public class UserCacheService {
	@Autowired
	private UserMapper userMapper;

	@Cacheable(key = "userCache", value = "#id")
	public User get(long id) {
		return userMapper.get(id);
	}
}