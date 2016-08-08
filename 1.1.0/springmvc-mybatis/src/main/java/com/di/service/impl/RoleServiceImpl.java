package com.di.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.mapper.AbstractMapper;
import com.di.mapper.RoleMapper;
import com.di.model.Role;
import com.di.service.RoleService;

@Service("roleService")
public class RoleServiceImpl extends AbstractServiceImpl<Role> implements RoleService {
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public AbstractMapper<Role> getMapper() {
		return roleMapper;
	}

}
