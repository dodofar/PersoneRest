package org.example.personerest.controller;

import org.example.personerest.model.dao.PersonDao;
import org.example.personerest.model.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController
{
	@Autowired
	PersonDao dao;

	@GetMapping("/people")
	public List<Person> getAll()
	{
		return dao.findAll();
	}
}
