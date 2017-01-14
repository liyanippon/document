
package salary.basic;

import salary.database.DBConnect;
import salary.employee.Employee;
import salary.util.*;
import java.sql.*;
import java.util.*;

public class Basic {

	public String EmployeeID, Handle,UserName;
	public Double Basic, Post, Year, Life, House, Traffic, Accumulate,BasicSum;

	public Basic() {
	};

	public String getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(String s) {
		this.EmployeeID = s;
	}

	public Double getBasic() {
		return Basic;
	}

	public void setBasic(Double s) {
		this.Basic = s;
	}

	public Double getPost() {
		return Post;
	}

	public void setPost(Double s) {
		this.Post = s;
	}

	public Double getYear() {
		return Year;
	}

	public void setYear(Double s) {
		this.Year = s;
	}

	public Double getLife() {
		return Life;
	}

	public void setLife(Double s) {
		this.Life = s;
	}

	public Double getHouse() {
		return House;
	}

	public void setHouse(Double s) {
		this.House = s;
	}
	
	public void setTraffic(Double i) {
		this.Traffic = i;
	}

	public Double getTraffic() {
		return Traffic;
	}
	
	public Double getAccumulate() {
		return Accumulate;
	}

	public void setAccumulate(Double s) {
		this.Accumulate = s;
	}
	
	public String getHandle() {
		return Handle;
	}

	public void setHandle(String s) {
		this.Handle = s;
	}
	
	public String getUserName() {
		return UserName;
	}

	public void setUserName(String s) {
		this.UserName = s;
	}
	
	public Double getBasicSum() {
		return BasicSum;
	}

	public void setBasicSum(Double s) {
		this.BasicSum = s;
	}
	
	
	
	
	/*
	 * Find Train by NO
	 */
	public static Basic FindByNO(String _employeeid) {
		DBConnect dbc = null;
		Basic basic = new Basic();
		try {
			dbc = new DBConnect();
			dbc.prepareStatement("SELECT basic.EmployeeID,UserName,Basic,Post,Year,Life,House,Traffic,Accumulate,BasicSum,Handle FROM basic,employee WHERE basic.EmployeeID=?");
			dbc.setString(1, _employeeid);
			ResultSet rs = dbc.executeQuery();
			if (rs.next()) {
				basic.setEmployeeID(rs.getString("EmployeeID"));
				basic.setUserName(rs.getString("UserName"));
				basic.setBasic(rs.getDouble("Basic"));
				basic.setPost(rs.getDouble("Post"));
				basic.setYear(rs.getDouble("Year"));
				basic.setLife(rs.getDouble("Life"));
				basic.setHouse(rs.getDouble("House"));
				basic.setTraffic(rs.getDouble("Traffic"));
				basic.setAccumulate(rs.getDouble("Accumulate"));
				basic.setBasicSum(rs.getDouble("BasicSum"));
				basic.setHandle(rs.getString("Handle"));
			} else {
				basic = null;
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				dbc.close();
			} catch (Exception e) {
				e.printStackTrace();
				basic = null;
			}
		}
		return basic;

	}

	/*
	 * Add Basic
	 */
	public static String Add(String _EmployeeID, Double _Basic,
			Double _Post, Double _Year, Double _Life,
			Double _House,Double _Traffic,Double _Accumulate,String _Handle) {
		DBConnect dbc = null;
		try {
			dbc = new DBConnect();
			dbc
					.prepareStatement("INSERT INTO basic (EmployeeID,Basic,Post,Year,"
							+ "Life,House,Traffic,Accumulate,Handle) VALUES (?,?,?,?,?,?,?,?,?)");
			dbc.setString(1, _EmployeeID);
			dbc.setDouble(2, _Basic);
			dbc.setDouble(3, _Post);
			dbc.setDouble(4, _Year);
			dbc.setDouble(5, _Life);
			dbc.setDouble(6, _House);
			dbc.setDouble(7, _Traffic);
			dbc.setDouble(8, _Accumulate);
			dbc.setString(9, _Handle);
			dbc.executeUpdate();
			dbc.close();
			return "1";

		} catch (Exception e) {
			System.err.println(e);
			return e.toString();
		}

	}

	/*
	 * Modify Basic
	 */

	public static String Modify(String _EmployeeID,Double _Basic, Double _Post,
			Double _Year, Double _Life, Double _House,
			Double _Traffic,Double _Accumulate,String _Handle) {
		DBConnect dbc = null;
		try {
			dbc = new DBConnect();
			dbc
					.prepareStatement("UPDATE basic SET Basic=?,Post=?,Year=?,Life=?,House=?,"
							+ "Traffic=?,Accumulate=?,Handle=? WHERE EmployeeID=?");
			dbc.setDouble(1, _Basic);
			dbc.setDouble(2, _Post);
			dbc.setDouble(3, _Year);
			dbc.setDouble(4, _Life);
			dbc.setDouble(5, _House);
			dbc.setDouble(6, _Traffic);
			dbc.setDouble(7, _Accumulate);
			dbc.setString(8, _Handle);
			dbc.setString(9, _EmployeeID);
			dbc.executeUpdate();
			dbc.close();
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
			return e.toString();
		}
	}


	/*
	 * search Basic by EmployeeID
	 */
	public static Vector SearchByID(String _EmployeeID) {
		DBConnect dbc = null;
		Vector BasicVector = new Vector();
		try {
			dbc = new DBConnect();
			dbc
					.prepareStatement("SELECT * FROM basic WHERE EmployeeID=?");
			dbc.setString(1, _EmployeeID);
			ResultSet rs = dbc.executeQuery();
			while (rs.next()) {
				Basic basic = new Basic();
				basic.setEmployeeID(rs.getString("EmployeeID"));
				basic.setBasic(rs.getDouble("Basic"));
				basic.setPost(rs.getDouble("Post"));
				basic.setYear(rs.getDouble("Year"));
				basic.setLife(rs.getDouble("Life"));
				basic.setHouse(rs.getDouble("House"));
				basic.setTraffic(rs.getDouble("Traffic"));
				basic.setAccumulate(rs.getDouble("Accumulate"));
				basic.setHandle(rs.getString("Handle"));
				BasicVector.add(basic);
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
		return BasicVector;

	}

	/*
	 * List All Basic
	 */
	public static Vector ListAll() {
		DBConnect dbc = null;
		Vector BasicVector = new Vector();

		String strSQL = "SELECT basic.EmployeeID,UserName,Basic,Post,Year,Life,House,Traffic,Accumulate,Handle FROM employee,basic where employee.EmployeeID=basic.EmployeeID ";

		try {
			dbc = new DBConnect();
			dbc.prepareStatement(strSQL);
			ResultSet rs = dbc.executeQuery();
			while (rs.next()) {
				Basic basic = new Basic();
				basic.setEmployeeID(rs.getString("EmployeeID"));
				basic.setUserName(rs.getString("UserName"));
				basic.setBasic(rs.getDouble("Basic"));
				basic.setPost(rs.getDouble("Post"));
				basic.setYear(rs.getDouble("Year"));
				basic.setLife(rs.getDouble("Life"));
				basic.setHouse(rs.getDouble("House"));
				basic.setTraffic(rs.getDouble("Traffic"));
				basic.setAccumulate(rs.getDouble("Accumulate"));
				basic.setHandle(rs.getString("Handle"));
				BasicVector.add(basic);
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
		return BasicVector;

	}
	


}