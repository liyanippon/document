package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import po.Person;
import dao.inter.PersonDAO;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PersonDAO dao = (PersonDAO)ac.getBean("dao");
		Person p = new Person();
		p.setPassword("5");
		p.setPid(5);
		p.setName("5");
		p.setAddress("5");
		dao.add(p);

	}

}
