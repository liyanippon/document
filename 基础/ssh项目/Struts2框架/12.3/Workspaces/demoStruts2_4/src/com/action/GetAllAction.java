package com.action;

import java.sql.SQLException;
import java.util.List;

import com.dao.PersonDAO;
import com.vo.Person;

public class GetAllAction {
	private List<Person> list;//把属性值传递给响应画面

	public List<Person> getList() {
		return list;
	}

	public void setList(List<Person> list) {
		this.list = list;
	}
	public String getAll() throws SQLException{
		list = new PersonDAO().getAll();
		return "showAll";
	}

}
