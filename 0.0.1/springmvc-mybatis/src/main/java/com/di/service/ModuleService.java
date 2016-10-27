package com.di.service;

import java.util.List;

import com.di.model.Module;

public interface ModuleService extends AbstractService<Module> {
	List<Module> selectModuleByUserId(Integer userId);
}
