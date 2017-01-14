package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import po.Employee;

public class EmpDAO {
	public static SessionFactory getSessionFactory(){
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		return conf.buildSessionFactory();
	}
	public List<Employee> getAll(){
		Session session = new EmpDAO().getSessionFactory().openSession();
		return session.createQuery("from Employee").list();
		
	}
	
	public static void main(String args[]){
		List<Employee> list = new EmpDAO().getAll();
		for(Employee emp:list){
			System.out.println(emp.getId()+","+emp.getName()+","+emp.getCom().getName());
		}
	}

}
