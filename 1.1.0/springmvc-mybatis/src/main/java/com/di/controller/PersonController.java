package com.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.di.model.Person;
import com.di.service.AbstractService;
import com.di.service.PersonService;

@Controller
@RequestMapping(value = "/person")
public class PersonController extends AbstractController<Person> {
	@Autowired
	private PersonService personService;

	@Override
	public AbstractService<Person> getAbstractService() {
		return personService;
	}

	@Override
	public String getNamespace() {
		return "person";
	}

}
