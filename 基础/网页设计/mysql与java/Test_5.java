package test;

import dao.EmpDAO;

public class Test_5 {
	public static void main(String[] args) {
		EmpDAO empDAO=new EmpDAO();
		try {
			empDAO.deleteByEmpno(26);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
