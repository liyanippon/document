package com.dlsm.struts.register.action;

import java.util.ArrayList;
import java.util.List;

import com.dao.PersonDAO;
import com.dlsm.struts.register.model.PersonBean.PersonBean;
import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport{
private static final long serialVersionUID = 1L;
	
	private PersonBean personBean;
	PersonDAO p = new PersonDAO();
	@Override
	public void validate(){
	     
	    if ( personBean.getFirstName().length()==0||null == personBean.getFirstName() ){ 
	    	
	    	addFieldError("personBean.firstName", "User name is required.");
	    	
	    }
	     
	             
	    if ( null == personBean.getEmail()||personBean.getEmail().length()==0){ 
	 
	        this.addFieldError( "personBean.email", "Email is required." );
	         
	    }
	     
	    if ( personBean.getAge() < 18){ 
	 
	    	 this.addFieldError("personBean.age", "Age is required and must be 18 or older");
	    }
	     
	     
	}

	@Override
	public String execute() throws Exception {
		PersonBean p = new PersonBean();
		new PersonDAO().insert(p);	
		//List<PersonBean> list=new ArrayList<PersonBean>();
		
		

		return SUCCESS;
		
	}
	
	public PersonBean getPersonBean() {
		
		return personBean;
		
	}
	
	public void setPersonBean(PersonBean person) {
		
		personBean = person;
		
	}
	

}
