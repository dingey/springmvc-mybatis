package com.di.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.bo.UserBo;
import com.di.mapper.AbstractMapper;
import com.di.mapper.UserMapper;
import com.di.model.User;
import com.di.model.UserExample;
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

	public PageInfo<User> findPagerByBusinessObject(UserBo bo) {
		UserExample u = new UserExample();
		UserExample.Criteria c = u.createCriteria();
		if (bo.getUserId() != null) {
			c.andUserIdEqualTo(bo.getUserId());
		}
		if (bo.getUserName() != null) {
			c.andUserNameLike("%" + bo.getUserName() + "%");
		}
		PageInfo<User> pageInfo = selectPagerByExample(u, bo.getPage(), bo.getRows());
		return pageInfo;
	}
}
