package com.di.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.bo.UserBo;
import com.di.mapper.AbstractMapper;
import com.di.mapper.UserMapper;
import com.di.model.User;
import com.di.model.UserExample;
import com.di.param.UserParam;
import com.github.pagehelper.PageInfo;

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

	public PageInfo<User> findPagerByUserParam(UserParam param) {
		UserExample u = new UserExample();
		UserExample.Criteria c = u.createCriteria();
		if (param.getUserId() != null) {
			c.andUserIdEqualTo(param.getUserId());
		}
		if (param.getUserName() != null) {
			c.andUserNameLike("%" + param.getUserName() + "%");
		}
		PageInfo<User> pageInfo = selectPagerByExample(u, param.getPage(), param.getRows());
		return pageInfo;
	}
}
