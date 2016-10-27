package com.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.di.model.Person;
import com.di.model.PersonExample;
import com.di.service.AbstractService;
import com.di.service.PersonService;

@Controller
@RequestMapping(value = "/person")
public class PersonController extends AbstractController<Person, PersonExample> {
	@Autowired
	private PersonService personService;

	@Override
	public String getNamespace() {
		return "person";
	}

	@Override
	public PersonExample getExample() {
		return new PersonExample();
	}

	@Override
	public AbstractService<Person, PersonExample> getAbstractService() {
		return personService;
	}

}
