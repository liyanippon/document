package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.dlsm.struts.register.model.PersonBean.PersonBean;

public class PersonDAOo {
	
		public static SessionFactory getSessionFactory(){
			
			Configuration conf = new Configuration();
			
			conf.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory = conf.buildSessionFactory();
			
			return sessionFactory;
		
	}
	public void insert(PersonBean person ){

		Session session = PersonDAOo.getSessionFactory().openSession();		
		Transaction tr = session.beginTransaction();
		session.save(person);
		tr.commit();
		session.close();
		
	}
	
	public static void main(String args[]){
		PersonBean person=new PersonBean();
		person.setFirstName("koj");
		person.setLastName("iipp");
		person.setEmail("upup");
		person.setAge(88);
		new PersonDAOo().insert(person);
	}
}
