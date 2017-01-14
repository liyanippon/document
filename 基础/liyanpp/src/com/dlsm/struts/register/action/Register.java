package com.dlsm.struts.register.action;

import com.dao.dao.inter.PersonDAO;
import com.dlsm.struts.register.model.PersonBean.PersonBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Register extends ActionSupport implements ModelDriven{
private static final long serialVersionUID = 1L;
	
	private PersonBean person;
	private PersonDAO dao; 
	
	public PersonBean getPerson() {
		return person;
	}

	public void setPerson(PersonBean person) {
		this.person = person;
	}

	public PersonDAO getDao() {
		return dao;
	}

	public void setDao(PersonDAO dao) {
		this.dao = dao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public void validate(){
	     
	    if ( person.getFirstName().length()==0||null == person.getFirstName() ){ 
	    	
	    	addFieldError("person.firstName", "User name is required.");
	    	
	    }
	     
	             
	    if ( null == person.getEmail()||person.getEmail().length()==0){ 
	 
	        this.addFieldError( "person.email", "Email is required." );
	         
	    }
	     
	    if ( person.getAge() < 18){ 
	 
	    	 this.addFieldError("person.age", "Age is required and must be 18 or older");
	    }
	     
	     
	}

	@Override
	public String execute() {

		//personBean.setAge(personBean.getAge());
		//personBean.setEmail(personBean.getEmail());
		//personBean.setFirstName(personBean.getFirstName());
		//personBean.setLastName(personBean.getLastName());
		//personBean.setId(personBean.getId());
	
		 dao.add(person);
		
		//new PersonDAO().insert(personBean);	
		
		
		 return SUCCESS;
		
	}
	
	public PersonBean getPersonBean() {
		
		return person;
		
	}
	
	public void setPersonBean(PersonBean person) {
		
		person = person;
		
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		
		return person;
	}
	

}
