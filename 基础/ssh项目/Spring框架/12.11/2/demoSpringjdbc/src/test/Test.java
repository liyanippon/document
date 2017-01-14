package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vo.Account;
import dao.inter.AccountDAO;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountDAO dao = (AccountDAO)ac.getBean("accountdao");
		Account a = dao.getById("11111111");
		System.out.println(a.getBalace());
	}

}
