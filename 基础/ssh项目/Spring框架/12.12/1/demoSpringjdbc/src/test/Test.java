package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.inter.InAccountService;
import vo.Inaccount;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//AccountDAO dao = (AccountDAO)ac.getBean("accountdao");
		//Account a = dao.getById("11111111");
		//System.out.println(a.getBalace());
		
		InAccountService service = (InAccountService)ac.getBean("service");
		
		Inaccount inAccount = new Inaccount();
		inAccount.setAccountid("123456789");
		inAccount.setInbalance(100);
		service.test(inAccount);
		
	}

}
