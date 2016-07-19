package com.fm.service;

import com.fm.model.User;

public interface UserService extends AbstractService<User>{

	User selectUserByUsername(String userName);

}
