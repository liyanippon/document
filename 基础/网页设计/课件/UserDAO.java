package org.stuenroll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.stuenroll.util.ConnectionFactory;

public class UserDAO {
	public boolean login(String username,String password) throws Exception{
		String sql="SELECT COUNT(*) AS ct FROM user WHERE username=? AND password=?";
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setObject(1, username);
		pst.setObject(2, password);
		ResultSet set=pst.executeQuery();
		set.next();	//让游标指向第一条记录
		int ct=set.getInt("ct");
		con.close();
		return ct==1?true:false;
		
	}
}
