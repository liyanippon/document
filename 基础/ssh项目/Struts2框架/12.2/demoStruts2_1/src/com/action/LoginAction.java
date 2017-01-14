package com.action;

import java.sql.SQLException;

import com.dao.PersonDAO;

public class LoginAction {

	private String name;
	private String ps;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
	
	public String execute() throws Exception{
		boolean b = new PersonDAO().check(name, ps);
		if(b){
			return "ok";
		}else{
			return "error";
		}
	}
}
