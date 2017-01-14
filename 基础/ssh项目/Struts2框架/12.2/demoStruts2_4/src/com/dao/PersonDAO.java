package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class PersonDAO {

	private Connection conn;
	public PersonDAO(){
		try {
			DriverManager.registerDriver(new Driver());
			
			String url = "jdbc:mysql://localhost:3306/mydb1";
			
			conn = DriverManager.getConnection(url,"root","123");
			System.out.println(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean check(String name,String ps) throws SQLException{
		PreparedStatement pstmt = conn.prepareStatement("select * from person where name=? and password=?");

		pstmt.setString(1,name);
		pstmt.setString(2,ps);
		
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			return true;
		}else{
			return false;
		}
	}
	
	public void insert(String name,String ps) throws SQLException{
		PreparedStatement pstmt = conn.prepareStatement("insert into person values(?,?)");
		pstmt.setString(1,name);
		pstmt.setString(2, ps);
		
		pstmt.executeUpdate();

	}
	
	public static void main(String args[]) throws SQLException{
		System.out.println(new PersonDAO().check("admin","1234567"));
	}
}
