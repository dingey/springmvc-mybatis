package com.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.di.model.Role;
import com.di.model.RoleExample;
import com.di.service.AbstractService;
import com.di.service.RoleService;

@Controller
@RequestMapping(value = "/role")
public class RoleController extends AbstractController<Role,RoleExample> {
	@Autowired
	private RoleService roleService;

	@Override
	public AbstractService<Role,RoleExample> getAbstractService() {
		return roleService;
	}

	@Override
	public String getNamespace() {
		return "role";
	}

	@Override
	public RoleExample getExample() {
		return new RoleExample();
	}

}
