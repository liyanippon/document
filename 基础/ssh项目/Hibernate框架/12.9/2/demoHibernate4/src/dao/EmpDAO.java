package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import po.Company;
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
	public void update(Employee e){
		Session session = new EmpDAO().getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		
		Company com = (Company)session.get(Company.class, 2);
		com.setName("SONY");
		e.setCom(com);
		
		session.update(e);
		
		tr.commit();
	}
	public void add(Employee e){
		Session session = new EmpDAO().getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		Company com = (Company)session.get(Company.class, 2);
		
		e.setCom(com);
		
		session.save(e);
		
		tr.commit();
	}
	
	public static void main(String args[]){
		//List<Employee> list = new EmpDAO().getAll();
		//for(Employee emp:list){
		//	System.out.println(emp.getId()+","+emp.getName()+","+emp.getCom().getName());
		//}
		
		Employee e = new Employee();
		e.setId(4);
		e.setName("admin");
		
		
		
		new EmpDAO().add(e);
	}

}
