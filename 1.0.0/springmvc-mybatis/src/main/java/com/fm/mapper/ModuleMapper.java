package com.fm.mapper;

import java.util.List;

import com.fm.model.Module;

public interface ModuleMapper extends AbstractMapper<Module> {
	List<Module> selectModuleByUserId(Integer userId);
}