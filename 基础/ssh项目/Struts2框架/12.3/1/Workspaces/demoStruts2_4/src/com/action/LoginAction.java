package com.action;

import com.dao.PersonDAO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements Action{

	private String name;
	private String password;
	
	@Override
	public void validate() {
		if(name.equals("")){
			this.addFieldError("name", "姓名不能为空");
		}if(password.equals("")){
			this.addFieldError("password","密码不能为空");
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws Exception{
		boolean b = new PersonDAO().check(name, password);
		if(b){
			
			return "success" ;
			
		}else{
			
			this.addActionError("姓名和密码有误");
			
			return Action.ERROR;
		}
	}
}
