package com.di.service;

import com.di.model.User;

public interface UserService extends AbstractService<User>{

	User selectUserByUsername(String userName);

}
