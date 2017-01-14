package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import po.Person;

public class PersonDAO {
	public static SessionFactory getSessionFactory(){
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		return conf.buildSessionFactory();
	}

	public void add(Person p){
		Session session = PersonDAO.getSessionFactory().openSession();
		Transaction tr = 	session.beginTransaction();//开启事务
		
		session.save(p);//insert
		
		tr.commit();
		
	}
	public void update(Person p){
		Session session = PersonDAO.getSessionFactory().openSession();
		Transaction tr = 	session.beginTransaction();//开启事务
		
		session.update(p);//update
		
		tr.commit();
	}
	
	public void delete(Person p){
		Session session = PersonDAO.getSessionFactory().openSession();
		Transaction tr = 	session.beginTransaction();//开启事务
		
		session.delete(p);//delete
		
		tr.commit();
	}
	//get   load 查询只能根据主键做查询
	public Person get(Person p){
		Session session = PersonDAO.getSessionFactory().openSession();
		Person p1 = (Person)session.get(Person.class, p.getPid());
		return p1;
	}
	public Person load(Person p){
		Session session = PersonDAO.getSessionFactory().openSession();
		Person p1 = (Person)session.load(Person.class, p.getPid());
		return p1;
	}
	
	public List<Person> getAll(){
		Session session = PersonDAO.getSessionFactory().openSession();
		
		//select * from person;//select e from Person e;
		
		Query query = session.createQuery("from Person");//HQL
		return query.list();
	}
	
	public List<Person> test1(){
		Session session = PersonDAO.getSessionFactory().openSession();
		
		//select * from person;//select e from Person e;
		
		Query query = session.createQuery("select new Person(p.name,p.password) from Person p");//HQL
		return query.list();
	}
	
	public List<Person> test2(String name){
		Session session = PersonDAO.getSessionFactory().openSession();
		
		Query query = session.createQuery("from Person p where p.name=?");//HQL
		query.setParameter(0,name);
		return query.list();
	}
	
	public List<Person> test3(int pageSize,int count){
		Session session = PersonDAO.getSessionFactory().openSession();
		
		Query query = session.createQuery("from Person");//HQL
		query.setFirstResult((pageSize-1)*count);
		query.setMaxResults(count);
		return query.list();
	}
	
	public static void main(String args[]){
		List<Person> list = new PersonDAO().test3(2,4);
		for(Person p:list){
			System.out.println(p.getPid()+","+p.getName()+","+p.getPassword()+","+p.getAddress());
		}
	}
}
