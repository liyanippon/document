package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import po.Person;

public class PersonDAO {

	public static SessionFactory getSessionFactory(){
		Configuration conf = new Configuration();//�������ļ��Ķ���
		conf.configure("hibernate.cfg.xml");//�������ļ������������ļ�����
		
		SessionFactory sessionFactory = conf.buildSessionFactory();//��ȡsession��Connection������
		return sessionFactory;
	}
	public void add(Person p){
		
		
		Session session = PersonDAO.getSessionFactory().openSession();//��ȡһ��session��Conn������
		
		Transaction tr = session.beginTransaction();//��ʼһ������
		
		session.save(p);//�����ݿ����һ����¼
		
		tr.commit();//�ύ����
		
		
		session.close();
		
	}
	public static void main(String[] args) {
		Person p = new Person(2,"manager","123456","dalian");
		new PersonDAO().add(p);

	}

}
