package com.di.mapper;

import java.util.List;

import com.di.model.AbstractModel;

/**
 * @author di
 */
public interface AbstractMapper<T extends AbstractModel> {

	int insert(T t);

	int update(T t);

	int delete(T t);

	T get(long id);

	List<T> findList(T t);
}
