package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.inter.PersonDAO;
import dao.po.Person;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDAO dao = (PersonDAO)ac.getBean("dao");
		
		Person p = new Person();
		p.setPid(1);
		p.setName("admin");
		p.setPassword("123");
		p.setAddress("shenyang");
		
		dao.add(p);

	}

}
