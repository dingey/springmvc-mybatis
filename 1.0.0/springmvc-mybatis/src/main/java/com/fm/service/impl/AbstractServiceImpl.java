package com.fm.service.impl;

import java.util.List;
import com.fm.mapper.AbstractMapper;
import com.fm.service.AbstractService;
import com.github.pagehelper.PageHelper;

/**
 * @author di
 *
 * @param <T>
 */
public abstract class AbstractServiceImpl<T> implements AbstractService<T> {

	public int delete(Integer id) {
		return getMapper().deleteByPrimaryKey(id);
	}

	public int insert(T t) {
		return getMapper().insertSelective(t);
	}

	public T select(Integer id) {
		return (T) getMapper().selectByPrimaryKey(id);
	}

	public int update(T t) {
		return getMapper().updateByPrimaryKeySelective(t);
	}

	public List<T> selectAll() {
		return getMapper().selectAll();
	}

	public List<T> selectAll(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return getMapper().selectAll();
	}

	public abstract AbstractMapper<T> getMapper();
}
