package com.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.mapper.AbstractMapper;
import com.di.mapper.ModuleMapper;
import com.di.model.Module;
import com.di.model.ModuleExample;

@Service
public class ModuleService extends AbstractService<Module, ModuleExample> {
	@Autowired
	private ModuleMapper moduleMapper;

	@Override
	public AbstractMapper<Module, ModuleExample> getAbstractMapper() {
		return moduleMapper;
	}
}
