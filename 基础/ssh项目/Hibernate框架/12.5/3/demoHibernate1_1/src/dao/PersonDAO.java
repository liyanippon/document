package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import po.Person;

public class PersonDAO {

	public static SessionFactory getSessionFactory(){
		Configuration conf = new Configuration();//读配置文件的对象
		conf.configure("hibernate.cfg.xml");//读配置文件，解析配置文件内容
		
		SessionFactory sessionFactory = conf.buildSessionFactory();//获取session（Connection）工厂
		return sessionFactory;
	}
	public void add(Person p){
		
		
		Session session = PersonDAO.getSessionFactory().openSession();//获取一个session（Conn）对象
		
		Transaction tr = session.beginTransaction();//开始一个事务
		
		session.save(p);//向数据库插入一条记录
		
		tr.commit();//提交事务
		
		
		session.close();
		
	}
	public static void main(String[] args) {
		Person p = new Person(2,"manager","123456","dalian");
		new PersonDAO().add(p);

	}

}
