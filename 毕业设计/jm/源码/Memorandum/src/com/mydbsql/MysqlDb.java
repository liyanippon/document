package com.mydbsql;

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
							"jdbc:mysql://localhost:3306/db_note?useUnicode=true&amp;characterEncoding=gb2312",
							"root", "root");
		} catch (Exception e) {
		}
	}

	/**
	 * select
	 * @param sql
	 * @return
	 */
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

	/**
	 * insert update delete
	 * @param sql
	 * @return
	 */
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