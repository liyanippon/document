package com.action;

import java.sql.SQLException;

import com.dao.PersonDAO;
import com.vo.Person;

public class DeleteAction {
	private int pid;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String delete() throws Exception{
		new PersonDAO().del(pid);
		return "showAll";
	}
}
