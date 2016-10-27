package com.di.mapper;

import com.di.model.User;
import com.di.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends AbstractMapper<User, UserExample>{
    
}