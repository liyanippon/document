package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Test_2 {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new Driver());
			String user="root";
			String password="123";
			String url="jdbc:mysql://localhost:3306/company";
			Connection con=DriverManager.getConnection(url,user,password);
			con.setAutoCommit(false);	//把自动提交事物改成手动提交事物
			Statement st=con.createStatement();
			
			String sql="INSERT INTO emp(ename,sex,salary,comm,hiredate,deptno) "+
			"VALUES('鸠摩智','男',3500,NULL,'2014-1-1',2)";
			st.execute(sql);
			
			sql="INSERT INTO emp(ename,sex,salary,comm,hiredate,deptno) "+
			"VALUES('天山童老','女',3500,NULL,'2014-1-1',1)";
			st.execute(sql);
			
			con.commit();	//提交事务
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
