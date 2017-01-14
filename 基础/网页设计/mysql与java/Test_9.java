package test;

import java.util.ArrayList;

import dao.EmpDAO;

public class Test_9 {
	public static void main(String[] args) {
		EmpDAO empDAO=new EmpDAO();
		try {
			ArrayList<Object[]> list=empDAO.search_1("保安部");
			for(int i=0;i<list.size();i++){
				Object[] one=list.get(i);
				System.out.println(one[0]+"\t"+one[1]+"\t"+one[2]+"\t"+one[3]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
