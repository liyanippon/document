package com.action;

import java.sql.SQLException;

import com.dao.PersonDAO;
import com.vo.Person;

public class UpdateAction {
	private Person p;	
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public String update() throws SQLException{
		System.out.println(p.getName());
		new PersonDAO().update(p.getPid(),p.getName(),p.getPassword(),p.getAddress());
		return "showAll";
	}

}
