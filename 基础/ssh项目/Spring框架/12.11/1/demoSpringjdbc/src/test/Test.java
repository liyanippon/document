package test;

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
		Account account = new Account();
		account.setAccountid("123456789");
		
		dao.delete("123456789");
	}

}
