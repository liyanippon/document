package com.action;

import com.dao.PersonDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String name;
	private String password;
	
	@Override
	public void validate() {
		if(name.equals("")){
			this.addFieldError("name", "请输入姓名");
		}if(password.equals("")){
			this.addFieldError("password","请输入密码");
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
			
			return "ok";
			
		}else{
			
			this.addActionError("姓名或密码有误");
			
			return "error";
		}
	}
}
