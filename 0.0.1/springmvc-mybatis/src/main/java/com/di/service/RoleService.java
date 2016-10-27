package com.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.mapper.AbstractMapper;
import com.di.mapper.RoleMapper;
import com.di.model.Role;
import com.di.model.RoleExample;

@Service
public class RoleService extends AbstractService<Role, RoleExample> {
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public AbstractMapper<Role, RoleExample> getAbstractMapper() {
		return roleMapper;
	}
}
