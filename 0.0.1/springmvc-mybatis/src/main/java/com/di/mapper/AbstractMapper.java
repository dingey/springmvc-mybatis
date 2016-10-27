package com.di.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AbstractMapper<T, E> {
	int countByExample(E arg0);

	int deleteByExample(E arg0);

	int deleteByPrimaryKey(Integer arg0);

	int insert(T arg0);

	int insertSelective(T arg0);

	List<T> selectByExample(E arg0);

	T selectByPrimaryKey(Integer arg0);

	int updateByExampleSelective(@Param("record") T arg0, @Param("example") E arg1);

	int updateByExample(@Param("record") T arg0, @Param("example") E arg1);

	int updateByPrimaryKeySelective(T arg0);

	int updateByPrimaryKey(T arg0);
}