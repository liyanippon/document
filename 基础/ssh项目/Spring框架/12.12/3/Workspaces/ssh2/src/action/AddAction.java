

package action;

import com.opensymphony.xwork2.ModelDriven;

import po.Person;

import dao.inter.PersonDAO;

public class AddAction implements ModelDriven{
	private Person p = new Person();

	private PersonDAO dao;
	
	public PersonDAO getDao() {
		return dao;
	}

	public void setDao(PersonDAO dao) {
		this.dao = dao;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	public Object getModel() {
		
		return p;
	}
	public String execute(){
		dao.add(p);
		return "ok";
	}
	

}
