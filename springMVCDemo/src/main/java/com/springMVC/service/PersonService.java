package com.springMVC.service;

import java.util.List;

import com.springMVC.model.PersonBean;

public interface PersonService {
	public void savePerson(PersonBean p);
	public List<PersonBean> listPerson();;

}
