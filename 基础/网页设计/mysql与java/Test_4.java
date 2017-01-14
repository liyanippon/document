package test;

import dao.EmpDAO;

public class Test_4 {
	public static void main(String[] args) {
		EmpDAO empDAO=new EmpDAO();
		try {
			empDAO.updateSalary(10, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
