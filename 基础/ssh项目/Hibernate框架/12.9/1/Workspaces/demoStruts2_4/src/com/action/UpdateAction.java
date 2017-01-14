package com.action;

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
public String update() throws Exception{
	new PersonDAO().update(p.getPid(),p.getName(),p.getPassword(),p.getAddress());
	return "showAll";
}
}
