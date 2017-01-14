package com.action;

import java.sql.SQLException;

import com.dao.PersonDAO;
import com.vo.Person;

public class RegisterAction {
	private String pid;
	private String name;
	private String ps;
	private String address;
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
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String add() throws SQLException{
		Person p = new Person(Integer.parseInt(pid),name,ps,address);
		new PersonDAO().insert(p);
		return "login";
	}

}
