package com.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.di.mapper.AbstractMapper;
import com.di.mapper.PermissionMapper;
import com.di.model.Permission;
import com.di.model.PermissionExample;

/**
 * @author di:
 * @date 创建时间：2016年10月28日 下午5:41:01
 * @version
 */
@Service
public class PermissionService extends AbstractService<Permission, PermissionExample> {
	@Autowired
	private PermissionMapper permissionMapper;

	@Override
	public AbstractMapper<Permission, PermissionExample> getAbstractMapper() {
		return permissionMapper;
	}

}
