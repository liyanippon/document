package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;



public class Test_1 {
	public static void main(String[] args) {
		try {
			//1.加载驱动
			DriverManager.registerDriver(new Driver());
			//Class.forName("com.mysql.jdbc.Driver");
			//2.建立连接
			String user="root";
			String password="123";
			String url="jdbc:mysql://localhost:3306/company";
			Connection con=DriverManager.getConnection(url,user,password);
			//3.建立执行对象
			Statement st=con.createStatement();
			//4.执行SQL语句
			ResultSet set=st.executeQuery("SELECT * FROM emp");
			//5.读取结果集对象
			while(set.next()){
				int empno=set.getInt("empno");
				String ename=set.getString("ename");
				float salary=set.getFloat("salary");
				Date hiredate=set.getDate("hiredate");
				System.out.println(empno+"\t"+ename+"\t"+salary+"\t"+hiredate.toLocaleString());
			}
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
