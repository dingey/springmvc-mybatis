package com.di.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.mapper.AbstractMapper;
import com.di.mapper.ModuleMapper;
import com.di.model.Module;
import com.di.service.ModuleService;

@Service("moduleService")
public class ModuleServiceImpl extends AbstractServiceImpl<Module> implements ModuleService {
	@Autowired
	private ModuleMapper moduleMapper;

	@Override
	public AbstractMapper<Module> getMapper() {
		return moduleMapper;
	}

	public List<Module> selectModuleByUserId(Integer userId) {
		return moduleMapper.selectModuleByUserId(userId);
	}

}
