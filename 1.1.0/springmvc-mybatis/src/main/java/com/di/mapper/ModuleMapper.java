package com.di.mapper;

import java.util.List;

import com.di.model.Module;

public interface ModuleMapper extends AbstractMapper<Module> {
	List<Module> selectModuleByUserId(Integer userId);
}