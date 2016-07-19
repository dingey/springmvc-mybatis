package com.fm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fm.model.Role;
import com.fm.service.AbstractService;
import com.fm.service.RoleService;

@Controller
@RequestMapping(value = "/role")
public class RoleController extends AbstractController<Role> {
	@Autowired
	private RoleService roleService;

	@Override
	public AbstractService<Role> getAbstractService() {
		return roleService;
	}

	@Override
	public String getNamespace() {
		return "role";
	}

}
