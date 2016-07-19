package com.fm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fm.model.Person;
import com.fm.service.AbstractService;
import com.fm.service.PersonService;

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
