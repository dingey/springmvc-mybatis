package com.fm.service;

import java.util.List;

/**
 * @author di
 *
 * @param <T>
 */
public interface AbstractService<T> {
	int delete(Integer id);

	int insert(T t);

	T select(Integer id);

	int update(T t);

	List<T> selectAll();

	List<T> selectAll(int pageNum, int pageSize);
}
