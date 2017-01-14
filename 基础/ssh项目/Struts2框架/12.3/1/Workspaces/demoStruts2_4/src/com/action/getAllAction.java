package com.action;




import java.util.List;

import com.dao.PersonDAO;
import com.vo.Person;

public class getAllAction {
	private List<Person> list;

	public List<Person> getList() {
		return list;
	}

	public void setList(List<Person> list) {
		this.list = list;
	}
	public String getAll() throws Exception{
		list=new PersonDAO().getAll();
		return "showAll";
	}
}
