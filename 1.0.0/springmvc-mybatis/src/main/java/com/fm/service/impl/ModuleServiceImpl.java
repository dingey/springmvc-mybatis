package com.fm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fm.mapper.AbstractMapper;
import com.fm.mapper.ModuleMapper;
import com.fm.model.Module;
import com.fm.service.ModuleService;

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
