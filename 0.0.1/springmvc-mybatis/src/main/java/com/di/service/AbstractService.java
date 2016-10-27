package com.di.service;

import com.di.mapper.AbstractMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;

public abstract class AbstractService<T, E> {
	public int countByExample(E example) {
		return this.getAbstractMapper().countByExample(example);
	}

	public int deleteByExample(E example) {
		return this.getAbstractMapper().deleteByExample(example);
	}

	public int deleteByPrimaryKey(Integer id) {
		return this.getAbstractMapper().deleteByPrimaryKey(id);
	}

	public int insert(T model) {
		return this.getAbstractMapper().insert(model);
	}

	public int insertSelective(T model) {
		return this.getAbstractMapper().insertSelective(model);
	}

	public List<T> selectByExample(E example) {
		return this.getAbstractMapper().selectByExample(example);
	}

	public PageInfo<T> selectPagerByExample(E example, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<T> pageInfo = new PageInfo<T>(this.getAbstractMapper().selectByExample(example));
		return pageInfo;
	}

	public T selectByPrimaryKey(Integer id) {
		return this.getAbstractMapper().selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(T model, E example) {
		return this.getAbstractMapper().updateByExampleSelective(model, example);
	}

	public int updateByExample(T model, E example) {
		return this.getAbstractMapper().updateByExample(model, example);
	}

	public int updateByPrimaryKeySelective(T model) {
		return this.getAbstractMapper().updateByPrimaryKeySelective(model);
	}

	public int updateByPrimaryKey(T model) {
		return this.getAbstractMapper().updateByPrimaryKey(model);
	}

	public abstract AbstractMapper<T, E> getAbstractMapper();
}