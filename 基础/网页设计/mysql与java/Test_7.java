package test;

import java.sql.Date;

import pojo.Emp;
import dao.EmpDAO;

public class Test_7 {
	public static void main(String[] args) {
		EmpDAO empDAO=new EmpDAO();
		Emp emp=new Emp();
		emp.setEname("东方不败");
		emp.setSex("男");
		emp.setSalary(8000);
		emp.setComm(null);
		emp.setHiredate(Date.valueOf("2014-7-22"));
		emp.setDeptno(1);
		try {
			empDAO.insert(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
