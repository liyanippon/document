package action;

import java.util.List;
import java.util.Map;

import org.springframework.orm.hibernate3.HibernateTemplate;

import po.Person;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.impl.PersonDAOImpl;
import dao.inter.PersonDAO;

public class LoginAction extends ActionSupport{

	private String name;
	private String password;
	private int pid;
	private String address;
	
	private PersonDAO dao;
	
	public PersonDAO getDao() {
		return dao;
	}
	public void setDao(PersonDAO dao) {
		this.dao = dao;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() throws Exception{
		
		Person p = new PersonDAOImpl().check(name, password);
		
		
		if(p!=null){
			Map<String,Object> session=ActionContext.getContext().getSession();
			session.put("p", p);
			return "ok";
			
		}
		else{
			
			this.addActionError("姓名或密码有�?");
			
			return "error";
		}
		
	}
	
}
