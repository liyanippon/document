package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;
import com.vo.Person;

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
	
	public Person check(String name,String password) throws SQLException{
		Person p=null;
		PreparedStatement pstmt = conn.prepareStatement("select name,password from person where name=? and password=?");

		pstmt.setString(1,name);
		pstmt.setString(2,password);
		
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			p=new Person();
			p.setName(name);
			p.setPassword(password);
			
		}
			return p;
		}
	
	
	public void insert(int pid,String name,String password,String address) throws SQLException{
		PreparedStatement pstmt = conn.prepareStatement("insert into person values(?,?,?,?)");
		pstmt.setInt(1, pid);
		pstmt.setString(2,name);
		pstmt.setString(3, password);
		pstmt.setString(4, address);
		
		pstmt.executeUpdate();

	}
	
	public List<Person> getAll() throws SQLException{
		List<Person> list = new ArrayList<Person>();
		PreparedStatement pstmt = conn.prepareStatement("select * from person");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			Person p = new Person();
			p.setPid(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setPassword(rs.getString(3));
			p.setAddress(rs.getString(4));
			
			list.add(p);
		}
		return list;
		
		
	}
	
	public void del(int pid) throws SQLException{
		PreparedStatement pstmt=conn.prepareStatement("delete from person where pid=?");
		pstmt.setInt(1, pid);
		pstmt.executeUpdate();
	}
	
	public Person getPerson(int pid) throws SQLException{
		Person p=null;
		PreparedStatement pstmt=conn.prepareStatement("select * from person where pid=?");
		pstmt.setInt(1, pid);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			p=new Person();
			p.setPid(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setPassword(rs.getString(3));
			p.setAddress(rs.getString(4));
		}
		return p;
	}
	
	public void update(int pid,String name,String password,String address) throws Exception{
		PreparedStatement pstmt=conn.prepareStatement("update person set name=? ,password=?,address=? where pid=?");
		pstmt.setString(1, name);
		pstmt.setString(2, password);
		pstmt.setString(3, address);
		pstmt.setInt(4, pid);
		pstmt.executeUpdate();
	}
	
	
	public static void main(String args[]) throws SQLException{
		List<Person> list = new PersonDAO().getAll();
		for(Person p:list){
			System.out.println(p.getPid()+" "+p.getName()+" "+p.getPassword()+" "+p.getAddress());
		}
	}
}
