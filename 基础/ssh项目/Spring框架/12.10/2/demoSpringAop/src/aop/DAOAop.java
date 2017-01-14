package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class DAOAop {
	@Pointcut("execution(* dao.inter.*.add(..))")
	private void p1(){}
	@Pointcut("execution(* dao.inter.*.add(..))")
	private void p2(){}
	
	@Before("p1()")
	public void begin(){
		System.out.println("begin");
	}
	@After("p2()")
	public void commit(){
		System.out.println("commit");
	}

}
