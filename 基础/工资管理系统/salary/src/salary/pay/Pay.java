package salary.pay;

import salary.basic.Basic;
import salary.database.DBConnect;
import salary.util.*;

import java.sql.*;
import java.util.*;

public class Pay {
	
	public String EmployeeID, Handle,UserName;
	public Double OverTime,Bonus,Performance,SickLeave,PersonalLeave,Absence,Others,Tax,PaySum,Deduction,BasicSum;
	public java.sql.Date PayTime;
	public Pay() {
	};

	public String getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(String s) {
		this.EmployeeID = s;
	}

	public String getPayTime() {
		if (this.PayTime != null)
			return DataConvert.sqlDateToStr(PayTime);
		else
			return "";
	}

	public void setPayTime(String strBir) {
		if (strBir != null)
			this.PayTime = DataConvert.StrTosqlDate(strBir);
		else
			this.PayTime = null;
	}

	public Double getOverTime() {
		return OverTime;
	}
	
	public void setOverTime(Double s) {
		this.OverTime = s;
	}

	public Double getBonus() {
		return Bonus;
	}

	public void setBonus(Double s) {
		this.Bonus = s;
	}

	public Double getPerformance() {
		return Performance;
	}

	public void setPerformance(Double s) {
		this.Performance = s;
	}

	public Double getSickLeave() {
		return SickLeave;
	}

	public void setSickLeave(Double s) {
		this.SickLeave = s;
	}

	public Double getPersonalLeave() {
		return PersonalLeave;
	}

	public void setPersonalLeave(Double s) {
		this.PersonalLeave = s;
	}
	
	public void setAbsence(Double i) {
		this.Absence = i;
	}

	public Double getAbsence() {
		return Absence;
	}
	
	public Double getOthers() {
		return Others;
	}

	public void setOthers(Double s) {
		this.Others = s;
	}
	
	public String getHandle() {
		return Handle;
	}

	public void setHandle(String s) {
		this.Handle = s;
	}
	
	public Double getTax() {
		return Tax;
	}

	public void setTax(Double s) {
		this.Tax = s;
	}
	
	public Double getPaySum() {
		return Tax;
	}

	public void setPaySum(Double s) {
		this.Tax = s;
	}
	
	public Double getDeduction() {
		return Tax;
	}

	public void setDeduction(Double s) {
		this.Tax = s;
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
	
	
	
	
	
	// 验证是否已发放本月工资
	public static boolean IsExist(String _EmployeeID,String _PayTime) throws Exception {
		DBConnect dbc = null;
		boolean IsExist = false;
		try {
			dbc = new DBConnect();
			dbc.prepareStatement("SELECT * FROM pay WHERE EmployeeID=? and PayTime=?");
			dbc.setString(1, _EmployeeID);
			dbc.setString(2, _PayTime);
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
	
	//发放工资
	public static String Add(String _EmployeeID, String _PayTime,Double _OverTime,Double _Bonus,Double _Performance,Double _SickLeave,Double _PersonalLeave,Double _Absence,Double _Others, String _Handle,Double _PaySum) 
	{
		DBConnect dbc = null;
		try {
			dbc = new DBConnect();
			dbc.prepareStatement("INSERT INTO pay(EmployeeID,PayTime,OverTime,Bonus,"
							+ "Performance,SickLeave,PersonalLeave,Absence,Others,Handle,PaySum) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
			dbc.setString(1, _EmployeeID);
			dbc.setString(2, _PayTime);
			dbc.setDouble(3, _OverTime);
			dbc.setDouble(4, _Bonus);
			dbc.setDouble(5, _Performance);
			dbc.setDouble(6, _SickLeave);
			dbc.setDouble(7, _PersonalLeave);
			dbc.setDouble(8, _Absence);
			dbc.setDouble(9, _Others);
			dbc.setString(10, _Handle);
			dbc.setDouble(11, _PaySum);
			dbc.executeUpdate();
			dbc.close();
			return "1";

		} catch (Exception e) {
			System.err.println(e);
			return e.toString();
		}

	}
	
	
	
	/*
	 * List All Pay
	 */
	public static Vector ListAll() {
		DBConnect dbc = null;
		Vector BasicVector = new Vector();

		String strSQL = "SELECT pay.EmployeeID,UserName,PayTime,OverTime,Bonus,Performance,SickLeave,PersonalLeave,Absence,Others,Handle FROM employee,pay where employee.EmployeeID=pay.EmployeeID order by PayTime ASC";

		try {
			dbc = new DBConnect();
			dbc.prepareStatement(strSQL);
			ResultSet rs = dbc.executeQuery();
			while (rs.next()) {
				Pay pay = new Pay();
				pay.setEmployeeID(rs.getString("EmployeeID"));
				pay.setUserName(rs.getString("UserName"));
				pay.setPayTime(rs.getString("PayTime"));
				pay.setOverTime(rs.getDouble("OverTime"));
				pay.setBonus(rs.getDouble("Bonus"));
				pay.setPerformance(rs.getDouble("Performance"));
				pay.setSickLeave(rs.getDouble("SickLeave"));
				pay.setPersonalLeave(rs.getDouble("PersonalLeave"));
				pay.setAbsence(rs.getDouble("Absence"));
				pay.setOthers(rs.getDouble("Others"));
				pay.setHandle(rs.getString("Handle"));
				BasicVector.add(pay);
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
	
	
	//Find By ID
	public static Pay FindByNO(String _employeeid) {
		DBConnect dbc = null;
		Pay pay = new Pay();
		try {
			dbc = new DBConnect();
			dbc.prepareStatement("SELECT pay.EmployeeID,employee.UserName,BasicSum,PayTime,OverTime,Bonus,Performance,SickLeave,PersonalLeave,Absence,Others,pay.Handle FROM basic,pay,employee WHERE pay.EmployeeID=? and pay.EmployeeID=employee.EmployeeID and pay.EmployeeID=basic.EmployeeID");
			dbc.setString(1, _employeeid);
			ResultSet rs = dbc.executeQuery();
			if (rs.next()) {
				pay.setEmployeeID(rs.getString("EmployeeID"));
				pay.setUserName(rs.getString("UserName"));
				pay.setBasicSum(rs.getDouble("BasicSum"));
				pay.setPayTime(rs.getString("PayTime"));
				pay.setOverTime(rs.getDouble("OverTime"));
				pay.setBonus(rs.getDouble("Bonus"));
				pay.setPerformance(rs.getDouble("Performance"));
				pay.setSickLeave(rs.getDouble("SickLeave"));
				pay.setPersonalLeave(rs.getDouble("PersonalLeave"));
				pay.setAbsence(rs.getDouble("Absence"));
				pay.setOthers(rs.getDouble("Others"));
				pay.setHandle(rs.getString("Handle"));
			} else {
				pay = null;
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				dbc.close();
			} catch (Exception e) {
				e.printStackTrace();
				pay = null;
			}
		}
		return pay;

	}
	
	/*
	 * Modify Pay
	 */

	public static String Modify(String _EmployeeID,String _PayTime, Double _OverTime,
			Double _Bonus, Double _Performance, Double _SickLeave,
			Double _PersonalLeave,Double _Absence,Double _Others,String _Handle) {
		DBConnect dbc = null;
		try {
			dbc = new DBConnect();
			dbc
					.prepareStatement("UPDATE pay SET OverTime=?,Bonus=?,Performance=?,SickLeave=?,"
							+ "PersonalLeave=?,Absence=?,Others=?,Handle=? WHERE EmployeeID=? and PayTime=?");
			
			dbc.setDouble(1, _OverTime);
			dbc.setDouble(2, _Bonus);
			dbc.setDouble(3, _Performance);
			dbc.setDouble(4, _SickLeave);
			dbc.setDouble(5, _PersonalLeave);
			dbc.setDouble(6, _Absence);
			dbc.setDouble(7, _Others);
			dbc.setString(8, _Handle);
			dbc.setString(9, _EmployeeID);
			dbc.setString(10, _PayTime);
			dbc.executeUpdate();
			dbc.close();
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
			return e.toString();
		}
	}
	
	/*
	 * Delete Pay
	 */
	public static String Delete(String _EmployeeID,String _PayTime) {
		try {
			DBConnect dbc = new DBConnect();
			dbc.prepareStatement("DELETE FROM pay WHERE EmployeeID=? and PayTime=?");
			dbc.setString(1,_EmployeeID);
			dbc.setString(2,_PayTime);
			dbc.executeUpdate();
			dbc.close();
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
			return e.toString();
		}
	}


	
	
	
	

}
