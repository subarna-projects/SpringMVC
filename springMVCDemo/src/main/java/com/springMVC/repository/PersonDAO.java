package com.springMVC.repository;

import java.util.List;

import com.springMVC.model.PersonBean;

public interface PersonDAO {

	void savePerson(PersonBean p);
	List<PersonBean> listPerson();

}
