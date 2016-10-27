package com.di.mapper;

import java.util.List;

import com.di.model.Module;
import com.di.model.ModuleExample;

public interface ModuleMapper extends AbstractMapper<Module, ModuleExample> {
	public List<Module> selectModuleByUserId(Integer userId);
}