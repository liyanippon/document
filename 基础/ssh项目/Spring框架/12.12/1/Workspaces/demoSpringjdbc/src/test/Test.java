package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.inter.InAccountService;
import vo.Account;
import vo.Inaccount;

import dao.inter.AccountDAO;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		/*AccountDAO dao=(AccountDAO)ac.getBean("accountdao");
		Account a=dao.getById("1234567890");
		System.out.println(a.getBalace());*/
		InAccountService service=(InAccountService)ac.getBean("service");
		Inaccount inAccount=new Inaccount();
		inAccount.setAccountid("123456789");
		inAccount.setInbalance(500);
		service.test(inAccount);
		
	}

}
