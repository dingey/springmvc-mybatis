package com.di.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.di.mapper.AbstractMapper;
import com.di.mapper.PersonMapper;
import com.di.model.Person;
import com.di.service.PersonService;

@Service("personService")
public class PersonServiceImpl extends AbstractServiceImpl<Person> implements PersonService {
	@Autowired
	private PersonMapper personMapper;

	@Override
	public AbstractMapper<Person> getMapper() {
		return personMapper;
	}

}
