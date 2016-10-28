package com.di.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.mapper.AbstractMapper;
import com.di.mapper.RoleMapper;
import com.di.model.Role;
import com.di.model.RoleExample;

/**
 * @author di:
 * @date 创建时间：2016年10月28日 下午5:42:42
 * @version
 */
@Service
public class RoleService extends AbstractService<Role, RoleExample> {
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public AbstractMapper<Role, RoleExample> getAbstractMapper() {
		return roleMapper;
	}

}
