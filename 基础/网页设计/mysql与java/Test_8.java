package test;

import java.sql.Date;
import java.util.ArrayList;

import pojo.Emp;
import dao.EmpDAO;

public class Test_8 {
	public static void main(String[] args) {
		EmpDAO empDAO=new EmpDAO();
		
		ArrayList<Emp> list=new ArrayList<Emp>();
		
		Emp emp=new Emp();
		emp.setEname("东方不败");
		emp.setSex("男");
		emp.setSalary(8000);
		emp.setComm(null);
		emp.setHiredate(Date.valueOf("2014-7-22"));
		emp.setDeptno(1);
		
		list.add(emp);
		
		emp=new Emp();
		emp.setEname("林平之");
		emp.setSex("男");
		emp.setSalary(6000);
		emp.setComm(null);
		emp.setHiredate(Date.valueOf("2014-7-22"));
		emp.setDeptno(2);
		
		list.add(emp);
		
		emp=new Emp();
		emp.setEname("岳不群");
		emp.setSex("男");
		emp.setSalary(5000);
		emp.setComm(null);
		emp.setHiredate(Date.valueOf("2014-7-22"));
		emp.setDeptno(2);
		
		list.add(emp);
		
		try {
			empDAO.insert(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
