package action;

import java.util.List;

import dao.impl.PersonDAOImpl;

import po.Person;

public class AllAction {
	
	private List<Person> list;
	public List<Person> getList() {
		return list;
	}
	public void setList(List<Person> list) {
		this.list = list;
	}
	public String all() throws Exception {
		list =new PersonDAOImpl().getAll();
		return "success";
	}
}
