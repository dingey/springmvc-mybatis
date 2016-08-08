package com.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.di.model.Module;
import com.di.service.AbstractService;
import com.di.service.ModuleService;

@Controller
@RequestMapping(value = "/module")
public class ModuleController extends AbstractController<Module> {
	@Autowired
	private ModuleService ModuleService;

	@Override
	public AbstractService<Module> getAbstractService() {
		return ModuleService;
	}

	@Override
	public String getNamespace() {
		return "module";
	}

}
