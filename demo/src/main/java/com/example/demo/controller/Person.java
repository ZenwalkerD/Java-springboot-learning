package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.PersonRepo;
import com.example.demo.model.PersonEntity;

@Controller
public class Person {

	@Autowired
	PersonRepo repo;

	@GetMapping(path = "/")
	public String home() {

		return "home";
	}

	@GetMapping(path = "add")
	public String add(PersonEntity p) {

		repo.save(p);
		return "home";

	}

	@RequestMapping("getList")
	public ModelAndView getList() {
		ModelAndView m = new ModelAndView();
		m.addObject("list", repo.findAll());
		repo.findAll().forEach(x -> System.out.println(x.getName()));

		m.setViewName("List");
		return m;

	}

	@GetMapping(path = "update")
	public ModelAndView update(PersonEntity person) {
		ModelAndView m = new ModelAndView();
		PersonEntity e = null;
		for (PersonEntity item : repo.findAll()) {
			if (item.getName().equalsIgnoreCase(person.getName())) {
				e = item;
				break;
			}
		}

		if (e != null) {
			e.setAge(person.getAge());
			repo.save(e);
			m.addObject("result", repo.findById(e.getId()).get());
			m.setViewName("update");
		} else {
			m.setStatus(HttpStatus.NOT_FOUND);
		}

		return m;
	}
}
