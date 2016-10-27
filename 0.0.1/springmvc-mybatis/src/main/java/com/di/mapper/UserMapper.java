package com.di.mapper;

import com.di.model.User;

public interface UserMapper extends AbstractMapper<User> {
	User selectUserByUsername(String userName);
}