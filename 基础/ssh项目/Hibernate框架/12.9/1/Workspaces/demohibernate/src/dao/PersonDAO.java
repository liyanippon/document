package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import po.Person;

public class PersonDAO {
	public static SessionFactory getSessionFaction(){
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=conf.buildSessionFactory();
		return sessionFactory;
		
	}
	
	public void add(Person p){
		Session session=PersonDAO.getSessionFaction().openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(p);
		tr.commit();
	}
	
	public void update(Person p){
		Session session=PersonDAO.getSessionFaction().openSession();
		Transaction tr=session.beginTransaction();
		session.update(p);
		tr.commit();
	}
		
	public void delete(Person p){
		Session session=PersonDAO.getSessionFaction().openSession();
		Transaction tr=session.beginTransaction();
		session.delete(p);
		tr.commit();
		
	}
	
	//ｲ鰉ｯ
	public Person get(Person p){
		Session session=PersonDAO.getSessionFaction().openSession();
		Person p1=(Person)session.get(Person.class,p.getPid());
		return p1;
		
	} 
	
	public Person load(Person p){
		Session session=PersonDAO.getSessionFaction().openSession();
		Person p1=(Person)session.load(Person.class, p.getPid());
		return p1;
	}
	
	public List<Person> getAll(){
		Session session=PersonDAO.getSessionFaction().openSession();
		Query query=session.createQuery("from Person");
		return query.list();
		
	}
	
	public List<Person> test1(){
		Session session=PersonDAO.getSessionFaction().openSession();
		Query query=session.createQuery("select new Person(p.name,p.password) from Person p");
		return query.list();
		
	}
	
	public List<Person> test2(String name){
		Session session=PersonDAO.getSessionFaction().openSession();
		Query query=session.createQuery("from Person p where p.name=?");
		query.setParameter(0, name);
		return query.list();
		
	}
	
	public List<Person> test3(int pageSize,int count){
		Session session=PersonDAO.getSessionFaction().openSession();
		Query query=session.createQuery("from Person");
		query.setFirstResult((pageSize-1)*count);
		query.setMaxResults(count);
		return query.list();
		
	}
	
	public static void main(String args[]){
		/*Person p=new Person(8,"huangjiaxing","asd","huanghe");
		new PersonDAO().add(p);//添加，修改*/
		/*Person p=new Person(2);
		new PersonDAO().delete(p);//删除*/
		/*Person p=new Person(1);
		p=new PersonDAO().get(p);
		System.out.println(p.getPid()+"\t"+p.getName()+"\t"+p.getPassword()+"\t"+p.getAddress());
		//get()*/
		/*Person p=new Person(4);
		p=new PersonDAO().load(p);
		System.out.println(p.getPid()+"\t"+p.getName()+"\t"+p.getPassword()+"\t"+p.getAddress());
		//load()*/
		/*List<Person> list = new PersonDAO().getAll();
		for(Person p:list){
			System.out.println(p.getPid()+","+p.getName()+","+p.getPassword()+","+p.getAddress());
		}//getAll()*/	
		/*List<Person> list=new PersonDAO().test1();
		for(Person p:list){
			System.out.println(p.getName()+","+p.getPassword());
		}//test1()*/
		/*List<Person> list=new PersonDAO().test2("manager");
		for(Person p:list){
			System.out.println(p.getPid()+","+p.getName()+","+p.getPassword()+","+p.getAddress());
		}//getAll()//test(2)*/	
		List<Person> list = new PersonDAO().test3(1,4);
		for(Person p:list){
			System.out.println(p.getPid()+","+p.getName()+","+p.getPassword()+","+p.getAddress());
		}
		} 
}
