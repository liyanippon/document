package test;

import dao.EmpDAO;

public class Test_3 {
	public static void main(String[] args) {
		EmpDAO empDAO=new EmpDAO();
		try {
			empDAO.updateEname(26, "金花婆婆");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
