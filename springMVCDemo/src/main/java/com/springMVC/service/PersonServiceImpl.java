package com.springMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springMVC.model.PersonBean;
import com.springMVC.repository.PersonDAO;
@Service //marks this class as a bean,so no need to declare in app context

public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonDAO pdao;
	@Override
	@Transactional
	public void savePerson(PersonBean p) {
		pdao.savePerson(p);
		
	}
	@Override
	@Transactional
	public List<PersonBean> listPerson() {
		// TODO Auto-generated method stub
		return pdao.listPerson();
	}

}
