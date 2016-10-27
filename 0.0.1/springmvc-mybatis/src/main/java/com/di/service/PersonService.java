package com.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.mapper.AbstractMapper;
import com.di.mapper.PersonMapper;
import com.di.model.Person;
import com.di.model.PersonExample;

@Service
public class PersonService extends AbstractService<Person, PersonExample> {
	@Autowired
	private PersonMapper personMapper;

	@Override
	public AbstractMapper<Person, PersonExample> getAbstractMapper() {
		return personMapper;
	}

}
