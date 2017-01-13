package com.xinxi_Action.struts.action.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDb {

	Connection con = null;

	public MysqlDb() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			con = DriverManager
					.getConnection(
							"jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8",
							"root", "pipas");
		} catch (Exception e) {
		}
	}

	public ResultSet ExcecuteQuery(String sql) {
		Statement st = null;
		try {
			st = con.createStatement();
			return st.executeQuery(sql);
		} catch (Exception e) {
		}
		try {
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int ExcecuteUpdate(String sql) {
		Statement st = null;
		try {
			st = con.createStatement();
			return st.executeUpdate(sql);
		} catch (Exception e) {
		}
		try {
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

}