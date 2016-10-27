package com.di.mapper;

import com.di.model.Person;
import com.di.model.PersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonMapper extends AbstractMapper<Person, PersonExample> {

	int countByExample(PersonExample example);

	int deleteByExample(PersonExample example);

	int deleteByPrimaryKey(Integer personId);

	int insert(Person record);

	int insertSelective(Person record);

	List<Person> selectByExample(PersonExample example);

	Person selectByPrimaryKey(Integer personId);

	int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

	int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

	int updateByPrimaryKeySelective(Person record);

	int updateByPrimaryKey(Person record);

}