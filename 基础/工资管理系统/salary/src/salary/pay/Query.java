package salary.pay;
import salary.database.DBConnect;
import salary.employee.Employee;
import salary.util.*;

import java.sql.*;
import java.util.*;

public class Query {

	public String EmployeeID, UserName, Sex, Branch,  Marriage,
	 Education, AdministrationLevel, Duty, Position, Incumbency,IncumbencyType;
	
	public Double BasicSum,FloatPay,PaySum,Deduction,Actual,Basic,Post,Year,Life,House,
	Traffic,Accumulate,OverTime,Bonus,Performance,SickLeave,PersonalLeave,Absence,Others,Tax;
	
	public java.sql.Date  PayTime;
	
	public Query() {
	};

	public String getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(String s) {
		this.EmployeeID = s;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String s) {
		this.UserName = s;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String s) {
		this.Sex = s;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String s) {
		this.Branch = s;
	}

	public String getMarriage() {
		return Marriage;
	}

	public void setMarriage(String s) {
		this.Marriage = s;
	}

	public String getEducation() {
		return Education;
	}

	public void setEducation(String s) {
		this.Education = s;
	}

	public String getAdministrationLevel() {
		return AdministrationLevel;
	}

	public void setAdministrationLevel(String s) {
		this.AdministrationLevel = s;
	}

	public String getDuty() {
		return Duty;
	}

	public void setDuty(String s) {
		this.Duty = s;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String s) {
		this.Position = s;
	}

	public String getIncumbency() {
		return Incumbency;
	}

	public void setIncumbency(String s) {
		this.Incumbency = s;
	}

	public String getIncumbencyType() {
		return IncumbencyType;
	}

	public void setIncumbencyType(String s) {
		this.IncumbencyType = s;
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
	
	public Double getFloatPay() {
		return FloatPay;
	}

	public void setFloatPay(Double s) {
		this.FloatPay = s;
	}
	
	public Double getPaySum() {
		return PaySum;
	}

	public void setPaySum(Double s) {
		this.PaySum = s;
	}
	
	public Double getDeduction() {
		return Deduction;
	}

	public void setDeduction(Double s) {
		this.Deduction = s;
	}
	
	public Double getActual() {
		return Actual;
	}

	public void setActual(Double s) {
		this.Actual = s;
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
	
	public Double getBasicSum() {
		return BasicSum;
	}

	public void setBasicSum(Double s) {
		this.BasicSum = s;
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
	public Double getTax() {
		return Tax;
	}

	public void setTax(Double s) {
		this.Tax = s;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * search Pay
	 */
	public static Vector Search(String _EmployeeID, String _UserName, String _Sex,
			String _Branch, String _PayTime, String _Marriage,
			String _Education,String _AdministrationLevel, String _Duty, String _Position,
			String _Incumbency, String _IncumbencyType) {
		DBConnect dbc = null;
		Vector QueryVector = new Vector();

		String strSQL = "select pay.EmployeeID,UserName,PayTime,BasicSum,OverTime+Bonus+Performance as FloatPay,PaySum,Deduction,PaySum-Deduction as Actual from employee,basic,pay"+
                        " where employee.EmployeeID=basic.EmployeeID and employee.EmployeeID=pay.EmployeeID and";

		if ((_EmployeeID.equals("")) & (_UserName.equals("")) & (_Sex.equals(""))
				& (_Branch.equals(""))& (_PayTime.equals(""))  & (_Marriage.equals("")) & (_Education.equals("")) 
				& (_AdministrationLevel.equals("")) & (_Duty.equals(""))
				& (_Position.equals("")) & (_Incumbency.equals("")) & (_IncumbencyType.equals(""))) {
			strSQL = "select pay.EmployeeID,UserName,PayTime,BasicSum,OverTime+Bonus+Performance as FloatPay,PaySum,Deduction,PaySum-Deduction as Actual from employee,basic,pay"+
            " where employee.EmployeeID=basic.EmployeeID and employee.EmployeeID=pay.EmployeeID ";
		} else {
			if (!_EmployeeID.equals(""))
				strSQL = strSQL + " pay.EmployeeID LIKE '%" + _EmployeeID + "%' AND";
			if (!_UserName.equals(""))
				strSQL = strSQL + " UserName='" + _UserName + "' AND";
			if (!_Sex.equals(""))
				strSQL = strSQL + " Sex='" + _Sex + "' AND";
			if (!_Branch.equals(""))
				strSQL = strSQL + " Branch='" + _Branch + "' AND";
			if (!_PayTime.equals(""))
				strSQL = strSQL + " PayTime='" + _PayTime + "-1' AND";
			if (!_Marriage.equals(""))
				strSQL = strSQL + " Marriage='" + _Marriage + "' AND";
			if (!_Education.equals(""))
				strSQL = strSQL + " Education='" + _Education + "' AND";
			if (!_AdministrationLevel.equals(""))
				strSQL = strSQL + " AdministrationLevel='" + _AdministrationLevel + "' AND";
			if (!_Duty.equals(""))
				strSQL = strSQL + " Duty='" + _Duty + "' AND";
			if (!_Position.equals(""))
				strSQL = strSQL + " Position='" + _Position + "' AND";
			if (!_Incumbency.equals(""))
				strSQL = strSQL + " Incumbency='" + _Incumbency + "' AND";
			if (!_IncumbencyType.equals(""))
				strSQL = strSQL + " IncumbencyType='" + _IncumbencyType + "' AND";

			strSQL = strSQL + " 1=1 ";
		}

		strSQL = strSQL + "ORDER BY EmployeeID ASC";

		System.out.println(strSQL);

		try {
			dbc = new DBConnect();
			dbc.prepareStatement(strSQL);
			ResultSet rs = dbc.executeQuery();
			while (rs.next()) {
				Query query = new Query();
				query.setEmployeeID(rs.getString("EmployeeID"));
				query.setUserName(rs.getString("UserName"));
				query.setPayTime(rs.getString("PayTime"));
				query.setBasicSum(rs.getDouble("BasicSum"));
				query.setFloatPay(rs.getDouble("FloatPay"));
				query.setPaySum(rs.getDouble("PaySum"));
				query.setDeduction(rs.getDouble("Deduction"));
				query.setActual(rs.getDouble("Actual"));
				
				QueryVector.add(query);
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
		return QueryVector;

	}
	
	
	
	//Query Personal
	public static Query FindByID(String _EmployeeID,String _PayTime) {
		DBConnect dbc = null;
		Query query = new Query();
		 _PayTime = _PayTime+"-1";
		try {
			dbc = new DBConnect();
			dbc.prepareStatement("select pay.EmployeeID,UserName,Branch,Duty,PayTime,Basic,Post,Year,Life,House,Traffic,Accumulate,BasicSum,"+
       "OverTime,Bonus,Performance,OverTime+Bonus+Performance as FloatPay,SickLeave,PersonalLeave,Absence,Others,"+
       "Tax,Deduction,PaySum,PaySum-Deduction as Actual "+
       " from employee,basic,pay"+
       " where employee.EmployeeID=basic.EmployeeID and employee.EmployeeID=pay.EmployeeID and pay.EmployeeID=? and PayTime=? ");

			dbc.setString(1, _EmployeeID);
			dbc.setString(2, _PayTime);
			ResultSet rs = dbc.executeQuery();
			if (rs.next()) {
				query.setEmployeeID(rs.getString("EmployeeID"));
				query.setUserName(rs.getString("UserName"));
				query.setBranch(rs.getString("Branch"));
				query.setDuty(rs.getString("Duty"));
				query.setPayTime(rs.getString("PayTime"));
				query.setBasic(rs.getDouble("Basic"));
				query.setPost(rs.getDouble("Post"));
				query.setYear(rs.getDouble("Year"));
				query.setLife(rs.getDouble("Life"));
				query.setHouse(rs.getDouble("House"));
				query.setTraffic(rs.getDouble("Traffic"));
				query.setAccumulate(rs.getDouble("Accumulate"));
				query.setBasicSum(rs.getDouble("BasicSum"));
				query.setOverTime(rs.getDouble("OverTime"));
				query.setBonus(rs.getDouble("Bonus"));
				query.setPerformance(rs.getDouble("Performance"));
				query.setFloatPay(rs.getDouble("FloatPay"));
				query.setSickLeave(rs.getDouble("SickLeave"));
				query.setPersonalLeave(rs.getDouble("PersonalLeave"));
				query.setAbsence(rs.getDouble("Absence"));
				query.setOthers(rs.getDouble("Others"));
				query.setTax(rs.getDouble("Tax"));
				query.setDeduction(rs.getDouble("Deduction"));
				query.setPaySum(rs.getDouble("PaySum"));
				query.setActual(rs.getDouble("Actual"));
				
				
			} else {
				query = null;
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				dbc.close();
			} catch (Exception e) {
				e.printStackTrace();
				query = null;
			}
		}
		return query;

	}
	
	
	
	/*
	 * search Pay
	 */
	public static Vector ViewPay(String _EmployeeID) {
		DBConnect dbc = null;
		Vector QueryVector = new Vector();

		String strSQL = "select pay.EmployeeID,UserName,PayTime,BasicSum,OverTime+Bonus+Performance as FloatPay,PaySum,Deduction,PaySum-Deduction as Actual from employee,basic,pay"+
                        " where employee.EmployeeID=basic.EmployeeID and employee.EmployeeID=pay.EmployeeID and pay.EmployeeID=? order by PayTime DESC";

		try {
			dbc = new DBConnect();
			dbc.prepareStatement(strSQL);
			dbc.setString(1, _EmployeeID);
			ResultSet rs = dbc.executeQuery();
			while (rs.next()) {
				Query query = new Query();
				query.setEmployeeID(rs.getString("EmployeeID"));
				query.setUserName(rs.getString("UserName"));
				query.setPayTime(rs.getString("PayTime"));
				query.setBasicSum(rs.getDouble("BasicSum"));
				query.setFloatPay(rs.getDouble("FloatPay"));
				query.setPaySum(rs.getDouble("PaySum"));
				query.setDeduction(rs.getDouble("Deduction"));
				query.setActual(rs.getDouble("Actual"));
				
				QueryVector.add(query);
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
		return QueryVector;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
