package com.fm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fm.mapper.AbstractMapper;
import com.fm.mapper.RoleMapper;
import com.fm.model.Role;
import com.fm.service.RoleService;

@Service("roleService")
public class RoleServiceImpl extends AbstractServiceImpl<Role> implements RoleService {
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public AbstractMapper<Role> getMapper() {
		return roleMapper;
	}

}
