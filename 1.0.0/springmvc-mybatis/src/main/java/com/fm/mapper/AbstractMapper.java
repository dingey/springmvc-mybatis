package com.fm.mapper;

import java.util.List;

/**
 * @author di
 *
 * @param <T>
 */
public interface AbstractMapper<T> {
	int deleteByPrimaryKey(Integer id);

	int insert(T t);

	int insertSelective(T t);

	T selectByPrimaryKey(Integer id);

	List<T> selectAll();

	int updateByPrimaryKeySelective(T t);

	int updateByPrimaryKey(T t);
}
