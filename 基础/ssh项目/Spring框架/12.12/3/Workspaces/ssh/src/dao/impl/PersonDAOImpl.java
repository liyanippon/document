package dao.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.inter.PersonDAO;
import dao.po.Person;

public class PersonDAOImpl implements PersonDAO{

	private HibernateTemplate ht;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	public void add(Person p) {
		ht.save(p);
		
	}

}
