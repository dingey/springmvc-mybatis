package com.fm.mapper;

import com.fm.model.User;

public interface UserMapper extends AbstractMapper<User> {
	User selectUserByUsername(String userName);
}