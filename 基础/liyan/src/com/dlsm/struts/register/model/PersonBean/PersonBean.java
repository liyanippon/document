package com.dlsm.struts.register.model.PersonBean;

public class PersonBean {
	
	private String firstName;
    private String lastName;
    private String email;
    private Integer age;

	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	/*public String toString()
    {
        return "First Name: " + getFirstName() + " Last Name:  " + getLastName() + 
        " Email:      " + getEmail() + " Age:      " + getAge() ;
    }*/
}
