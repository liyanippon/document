package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ConnectionFactory {
	static{
		try {
			DriverManager.registerDriver(new Driver());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws Exception{
		String user="root";
		String password="123";
		String url="jdbc:mysql://localhost:3306/company";
		Connection con=DriverManager.getConnection(url,user,password);
		return con;
	}
}
