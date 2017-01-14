package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.inter.DAO;



public class Test {
	public static void main(String[] args){
	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	DAO dao = (DAO)ac.getBean("dao");
	dao.update();
 }
}