package com.bmw.sale.action;

import java.util.List;

import com.bmw.sale.business.PeixunImpl;
import com.bmw.sale.business.SellImpl;
import com.bmw.sale.value.Car;
import com.bmw.sale.value.Employee;
import com.bmw.sale.value.Peixun;
import com.bmw.sale.value.Sell;
import com.opensymphony.xwork2.ActionSupport;

public class PeixunListAction  extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Peixun peixuninfo=new Peixun();
	//private Car carinfo=new Car();不明白含义
	
	private Employee employeeinfo=new Employee();
	public Employee getEmployeeinfo() {
		return employeeinfo;
	}


	public void setEmployeeinfo(Employee employeeinfo) {
		this.employeeinfo = employeeinfo;
	}


	private List<Peixun> peixun;
	private PeixunImpl<Peixun> peixunImpl;
		
	public Peixun getPeixuninfo() {
		return peixuninfo;
	}


	public void setPeixuninfo(Peixun peixuninfo) {
		this.peixuninfo = peixuninfo;
	}


	public List<Peixun> getPeixun() {
		return peixun;
	}


	public void setPeixun(List<Peixun> peixun) {
		this.peixun = peixun;
	}


	public PeixunImpl<Peixun> getPeixunImpl() {
		return peixunImpl;
	}


	public void setPeixunImpl(PeixunImpl<Peixun> peixunImpl) {
		this.peixunImpl = peixunImpl;
	}


	public String list() throws Exception{
		peixun=peixunImpl.listPeixun(Peixun.class);
		return SUCCESS;
		
	}

}
