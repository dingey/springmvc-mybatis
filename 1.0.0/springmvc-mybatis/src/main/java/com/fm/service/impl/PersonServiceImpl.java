package com.fm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fm.mapper.AbstractMapper;
import com.fm.mapper.PersonMapper;
import com.fm.model.Person;
import com.fm.service.PersonService;

@Service("personService")
public class PersonServiceImpl extends AbstractServiceImpl<Person> implements PersonService {
	@Autowired
	private PersonMapper personMapper;

	@Override
	public AbstractMapper<Person> getMapper() {
		return personMapper;
	}

}
