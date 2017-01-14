package com.action;

import java.util.Map;

import com.dao.PersonDAO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.vo.Person;

public class LoginAction extends ActionSupport{

	private String name;
	private String ps;
	
	@Override
	public void validate() {//��input������֣����д�����
		if(name.equals("")){
			this.addFieldError("name1", "�������û���");
		}if(ps.equals("")){
			this.addFieldError("ps","����������");
		}
	}
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
		Person p = new PersonDAO().check(name, ps);
		if(p!=null){
			Map<String,Object> session = ActionContext.getContext().getSession();
			session.put("p",p);
			
			return "ok";
			
		}else{
			
			this.addActionError("�û������������");
			
			return "error";
		}
	}
}
