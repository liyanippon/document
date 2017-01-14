
package salary.user;

import salary.database.DBConnect;
import salary.util.*;
import java.sql.*;
import java.util.*;

public class User {

	public String UserName, Password, Power, newuser, newpassword, newpower;

	public User()
	{
	};
  
	public String getUserName() 
	{
		return UserName;
	}

	public void setUserName(String s) 
	{
		this.UserName = s;
	}

	public String getPassword() 
	{
		return Password;
	}

	public void setPassword(String s)
	{
		this.Password = s;
	}
	public  String getPower() 
	{
		return Power;
	}

	public void setPower(String p)
	{
		this.Power = p;
	}

	/*
	 * Find User by UserName
	 */
	public static User FindByName(String _UserName) 
	{
		DBConnect dbc = null;
		User user = new User();
		try {
			dbc = new DBConnect();
			dbc.prepareStatement("SELECT * FROM users WHERE id = ?");
			dbc.setString(1, _UserName);
			ResultSet rs = dbc.executeQuery();
			if (rs.next()) 
			{
				user.setUserName(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setPower(rs.getString("power"));
			}
			else 
			{
				user = null;
			}
		} 
		catch (Exception e) 
		{
			System.err.println(e);
		}
		finally 
		{
			try 
			{
				dbc.close();
			}
			catch (Exception e) 
			{
				e.printStackTrace();
				user = null;
			}
		}
		return user;

	}


	/*
	 * Check Login
	 */
	public static boolean ChkLogin(String _UserName, String _Password,String _Power)
			throws Exception 
	{
		DBConnect dbc = null;
		boolean IsExist = false;
		try 
		{
			String EncPassword;
			dbc = new DBConnect();
			dbc.prepareStatement("SELECT * FROM users WHERE id = ? and password= ? and power= ? ");
			dbc.setString(1, _UserName);
			dbc.setString(2, _Password);
			dbc.setString(3, _Power);
			ResultSet rs = dbc.executeQuery();
			if (rs.next()) 
			{
				IsExist = true;
			}
			else 
			{
				
					IsExist = false;
			}
		} 
		catch (Exception e)
		{
			System.err.println(e);
		}
		finally 
		{
			try 
			{
				dbc.close();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return IsExist;
	}
	
	/*
	 * Modify Password
	 */

	public static String ModifyPassword(String _UserName, String _NewPassword) 
	{
		DBConnect dbc = null;
		try 
		{
			dbc = new DBConnect();
			dbc.prepareStatement("UPDATE users SET password=? WHERE id=?");
			dbc.setString(1, _NewPassword);
			dbc.setString(2, _UserName);
			dbc.executeUpdate();
			dbc.close();
			return "1";

		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return e.toString();
		}
	}
	
	//添加用户
	public static String Add(String _newuser,String _newpassword,String _newpower)
	{
		DBConnect dbc = null;
		try {
			dbc = new DBConnect();
			dbc.prepareStatement("insert into users(id,password,power) values (?,?,?)");
			
			dbc.setString(1, _newuser);
			dbc.setString(2, _newpassword);
			dbc.setString(3, _newpower);
			dbc.executeUpdate();
			dbc.close();
			return "1";

		} catch (Exception e) {
			System.err.println(e);
			return e.toString();
		}

	}
	
	
	/* 验证用户 */
	public static boolean IsExist(String _newuser) throws Exception {
		DBConnect dbc = null;
		boolean IsExist = false;
		try {
			dbc = new DBConnect();
			dbc.prepareStatement("SELECT * FROM users WHERE id=?");
			dbc.setString(1, _newuser);
			ResultSet rs = dbc.executeQuery();
			if (!rs.next()) {
				IsExist = false;
			} else {
				IsExist = true;
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				dbc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return IsExist;
	}

	//查询所有用户
	public static Vector ListAll() {
		DBConnect dbc = null;
		Vector AssessVector = new Vector();

		String strSQL = "SELECT * FROM users ORDER BY id";

		try {
			dbc = new DBConnect();
			dbc.prepareStatement(strSQL);
			ResultSet rs = dbc.executeQuery();
			while (rs.next()) {
				User assess = new User();
				assess.setUserName(rs.getString("id"));
				assess.setPassword(rs.getString("password"));
				assess.setPower(rs.getString("power"));
				AssessVector.add(assess);
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				dbc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return AssessVector;

	}
	
	
	//删除用户
	public static String Delete(String _UserName) {
		try {
			DBConnect dbc = new DBConnect();
			dbc.prepareStatement("DELETE FROM users WHERE id=?");
			dbc.setString(1, DataConvert.ViewStr(_UserName));
			dbc.executeUpdate();
			dbc.close();
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
			return e.toString();
		}
	}
	
	
	
	//修改用户
	public static String Modify(String _UserName, String _Password,String _Power,String _old) {
		DBConnect dbc = null;
		try {
			dbc = new DBConnect();
			dbc
					.prepareStatement("UPDATE users SET id=?,password=?,power=? WHERE id=?");
			dbc.setString(1, _UserName);
			dbc.setString(2, _Password);
			dbc.setString(3, _Power);
			dbc.setString(4, _old);
			dbc.executeUpdate();
			dbc.close();
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
			return e.toString();
		}
	}

	
	public static User FindByNO(String _UserName) {
		DBConnect dbc = null;
		User assess = new User();
		try {
			dbc = new DBConnect();
			dbc.prepareStatement("SELECT * FROM users WHERE id=?");
			dbc.setString(1, _UserName);
			ResultSet rs = dbc.executeQuery();
			if (rs.next()) {
				assess.setUserName(rs.getString("id"));
				assess.setPassword(rs.getString("password"));
				assess.setPower(rs.getString("power"));

			} else {
				assess = null;
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				dbc.close();
			} catch (Exception e) {
				e.printStackTrace();
				assess = null;
			}
		}
		return assess;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}