package test;

import dao.EmpDAO;

public class Test_6 {
	public static void main(String[] args) {
		EmpDAO empDAO=new EmpDAO();
		int[] temp={22,23,25};
		try {
			empDAO.depeteByEmpno(temp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
