package action;

import dao.inter.PersonDAO;

public class AddAction {

	private PersonDAO dao;

	public PersonDAO getDao() {
		return dao;
	}

	public void setDao(PersonDAO dao) {
		this.dao = dao;
	}
	public void addPerson(){
		dao.add();
	}
	
}
