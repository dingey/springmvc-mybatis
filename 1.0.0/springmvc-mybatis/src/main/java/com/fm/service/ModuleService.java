package com.fm.service;

import java.util.List;

import com.fm.model.Module;

public interface ModuleService extends AbstractService<Module> {
	List<Module> selectModuleByUserId(Integer userId);
}
