package dao.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import po.Person;
import dao.inter.PersonDAO;

public class PersonDAOImpl implements PersonDAO{

	private HibernateTemplate ht;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public void add(Person p) {
		ht.save(p);
		
	}

}
