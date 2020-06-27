package com.springMVC.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.springMVC.model.PersonBean;
import com.springMVC.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	PersonService pserv;
	@PostMapping("/savePerson")
	public String savePerson(@ModelAttribute("person") PersonBean person)
	{
	pserv.savePerson(person);
	return "redirect:/person/listPerson";
	
	}
	
	@GetMapping("/listPerson")
	public ModelAndView listPerson() 
	{
	
	@SuppressWarnings("rawtypes")
	List pbean=pserv.listPerson();	
	 ModelAndView mv=new ModelAndView();
	 mv.setViewName("personList");
	 mv.addObject("P", pbean);
	 return mv;
	
	}
}
