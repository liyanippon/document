package action;

import com.opensymphony.xwork2.ModelDriven;

import po.Person;

import dao.inter.PersonDAO;

public class delAction implements ModelDriven{
	
	private Person p= new Person();
	
	private PersonDAO dao;
	
	private Integer pid;
	
	

	public PersonDAO getDao() {
		return dao;
	}

	public void setDao(PersonDAO dao) {
		this.dao = dao;
	}

	public String del() {
		
	
		System.out.println(pid);	
		
	   //dao.del(pid);
		return "del";
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Object getModel() {
		// TODO Auto-generated method stub
		return p;
	}
}
