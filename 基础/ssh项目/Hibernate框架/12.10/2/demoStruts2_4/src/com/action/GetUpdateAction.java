package com.action;

import java.sql.SQLException;

import com.dao.PersonDAO;
import com.vo.Person;

public class GetUpdateAction {
	private int pid;

	private Person p;
	
	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	public String execute() throws SQLException{
		p = new PersonDAO().getPerson(pid);
		return "update";
	}

}
