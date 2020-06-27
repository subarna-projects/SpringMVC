package com.springMVC.repository;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springMVC.model.PersonBean;
@Repository
public class PersonDAOImpl implements PersonDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void savePerson(PersonBean p) {
		
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(p);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List <PersonBean> listPerson()
	{
		Session currentSession= sessionFactory.getCurrentSession();
		CriteriaBuilder cb= currentSession.getCriteriaBuilder();
		CriteriaQuery <PersonBean>cq=cb.createQuery(PersonBean.class);
		Root<PersonBean>root=cq.from(PersonBean.class);
		cq.select(root);
		Query query=currentSession.createQuery(cq);
		return query.getResultList();
		
	}

}
