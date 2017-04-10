package com.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.di.mapper.AbstractMapper;
import com.di.model.AbstractModel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author di
 */
public abstract class AbstractService<D extends AbstractMapper<T>, T extends AbstractModel> {
	@Autowired
	protected D mapper;

	public T get(long id) {
		return mapper.get(id);
	}

	public List<T> findList(T entity) {
		return mapper.findList(entity);
	}

	public PageInfo<T> findPage(T entity,int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<T> datas = findList(entity);
		return new PageInfo<>(datas);
	}

	public int save(T entity) {
		if (entity.getId() == 0) {
			return mapper.insert(entity);
		} else {
			return mapper.update(entity);
		}
	}

	public int delete(T entity) {
		return mapper.delete(entity);
	}
}
