package com.dao.dao.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.dao.dao.inter.PersonDAO;
import com.dlsm.struts.register.model.PersonBean.PersonBean;

public class PersonDAOImpl implements PersonDAO{
	private HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public void add(PersonBean person) {
		// TODO Auto-generated method stub
		//System.out.print(person.getId());
	
		ht.save(person);
		
	}
	
	
}
