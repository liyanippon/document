
package salary.employee;

import salary.database.DBConnect;
import salary.util.*;

import java.sql.*;
import java.util.*;

public class Employee {

	public String EmployeeID, UserName, Sex, Branch, NativePlace, Marriage,
			IdentityID, Politics, Folk, Education, Department, University,
			AccumulateID, AdministrationLevel, Duty, Position, ForeignLanguage,
			FLLevel, ComputerLevel, Phone, MobilePhone, Address, Incumbency,
			IncumbencyType, Resume;

	public java.sql.Date Birthday, GraduateDate;

	public Employee() {
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

	public String getNativePlace() {
		return NativePlace;
	}

	public void setNativePlace(String s) {
		this.NativePlace = s;
	}

	public String getMarriage() {
		return Marriage;
	}

	public void setMarriage(String s) {
		this.Marriage = s;
	}

	public String getIdentityID() {
		return IdentityID;
	}

	public void setIdentityID(String s) {
		this.IdentityID = s;
	}

	public String getPolitics() {
		return Politics;
	}

	public void setPolitics(String s) {
		this.Politics = s;
	}

	public String getFolk() {
		return Folk;
	}

	public void setFolk(String s) {
		this.Folk = s;
	}

	public String getEducation() {
		return Education;
	}

	public void setEducation(String s) {
		this.Education = s;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String s) {
		this.Department = s;
	}

	public String getUniversity() {
		return University;
	}

	public void setUniversity(String s) {
		this.University = s;
	}

	public String getAccumulateID() {
		return AccumulateID;
	}

	public void setAccumulateID(String s) {
		this.AccumulateID = s;
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

	public String getForeignLanguage() {
		return ForeignLanguage;
	}

	public void setForeignLanguage(String s) {
		this.ForeignLanguage = s;
	}

	public String getFLLevel() {
		return FLLevel;
	}

	public void setFLLevel(String s) {
		this.FLLevel = s;
	}

	public String getComputerLevel() {
		return ComputerLevel;
	}

	public void setComputerLevel(String s) {
		this.ComputerLevel = s;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String s) {
		this.Phone = s;
	}

	public String getMobilePhone() {
		return MobilePhone;
	}

	public void setMobilePhone(String s) {
		this.MobilePhone = s;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String s) {
		this.Address = s;
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

	public String getResume() {
		return Resume;
	}

	public void setResume(String s) {
		this.Resume = s;
	}

	public String getBirthday() {
		if (this.Birthday != null)
			return DataConvert.sqlDateToStrr(Birthday);
		else
			return "";
	}

	public void setBirthday(String strBir) {
		if (strBir != null)
			this.Birthday = DataConvert.StrTosqlDate(strBir);
		else
			this.Birthday = null;
	}

	public String getGraduateDate() {
		if (this.GraduateDate != null)
			return DataConvert.sqlDateToStrr(GraduateDate);
		else
			return "";
	}

	public void setGraduateDate(String strBir) {
		if (strBir != null)
			this.GraduateDate = DataConvert.StrTosqlDate(strBir);
		else
			this.GraduateDate = null;
	}

	/*
	 * Find Employee by ID
	 */
	public static Employee FindByID(String _EmployeeID) {
		DBConnect dbc = null;
		Employee employee = new Employee();
		try {
			dbc = new DBConnect();
			dbc.prepareStatement("SELECT * FROM employee WHERE EmployeeID = ?");
			dbc.setString(1, _EmployeeID);
			ResultSet rs = dbc.executeQuery();
			if (rs.next()) {
				employee.setEmployeeID(rs.getString("EmployeeID"));
				employee.setUserName(rs.getString("UserName"));
				employee.setSex(rs.getString("Sex"));
				employee.setBranch(rs.getString("Branch"));
				employee.setBirthday(rs.getString("Birthday"));
				employee.setNativePlace(rs.getString("NativePlace"));
				employee.setMarriage(rs.getString("Marriage"));
				employee.setIdentityID(rs.getString("IdentityID"));
				employee.setPolitics(rs.getString("Politics"));
				employee.setFolk(rs.getString("Folk"));
				employee.setEducation(rs.getString("Education"));
				employee.setDepartment(rs.getString("Department"));
				employee.setGraduateDate(rs.getString("GraduateDate"));
				employee.setUniversity(rs.getString("University"));
				employee.setAccumulateID(rs.getString("AccumulateID"));
				employee.setAdministrationLevel(rs
						.getString("AdministrationLevel"));
				employee.setDuty(rs.getString("Duty"));
				employee.setPosition(rs.getString("Position"));
				employee.setForeignLanguage(rs.getString("ForeignLanguage"));
				employee.setFLLevel(rs.getString("FLLevel"));
				employee.setComputerLevel(rs.getString("ComputerLevel"));
				employee.setPhone(rs.getString("Phone"));
				employee.setMobilePhone(rs.getString("MobilePhone"));
				employee.setAddress(rs.getString("Address"));
				employee.setIncumbency(rs.getString("Incumbency"));
				employee.setIncumbencyType(rs.getString("IncumbencyType"));
				employee.setResume(rs.getString("Resume"));
			} else {
				employee = null;
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			try {
				dbc.close();
			} catch (Exception e) {
				e.printStackTrace();
				employee = null;
			}
		}
		return employee;

	}

	/*
	 * Add Employee
	 */
	public static String Add(String _EmployeeID, String _UserName, String _Sex,
			String _Branch, String _NativePlace, String _Marriage,
			String _IdentityID, String _Politics, String _Folk,
			String _Education, String _Department, String _University,
			String _AccumulateID, String _AdministrationLevel, String _Duty,
			String _Position, String _ForeignLanguage, String _FLLevel,
			String _ComputerLevel, String _Phone, String _MobilePhone,
			String _Address, String _Incumbency, String _IncumbencyType,
			String _Resume, String _Birthday, String _GraduateDate) {
		DBConnect dbc = null;
		try {
			dbc = new DBConnect();

			dbc
					.prepareStatement("INSERT INTO employee (EmployeeID,UserName,Sex,Branch,NativePlace,"
							+ "Marriage,IdentityID,Politics,Folk,Education,Department,University,AccumulateID,"
							+ "AdministrationLevel,Duty,Position,ForeignLanguage,FLLevel,ComputerLevel,Phone,"
							+ "MobilePhone,Address,Incumbency,IncumbencyType,Resume,Birthday,GraduateDate) VALUES "
							+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

			dbc.setString(1, _EmployeeID);
			dbc.setString(2, _UserName);
			dbc.setString(3, _Sex);
			dbc.setString(4, _Branch);
			dbc.setString(5, _NativePlace);
			dbc.setString(6, _Marriage);
			dbc.setString(7, _IdentityID);
			dbc.setString(8, _Politics);
			dbc.setString(9, _Folk);
			dbc.setString(10, _Education);
			dbc.setString(11, _Department);
			dbc.setString(12, _University);
			dbc.setString(13, _AccumulateID);
			dbc.setString(14, _AdministrationLevel);
			dbc.setString(15, _Duty);
			dbc.setString(16, _Position);
			dbc.setString(17, _ForeignLanguage);
			dbc.setString(18, _FLLevel);
			dbc.setString(19, _ComputerLevel);
			dbc.setString(20, _Phone);
			dbc.setString(21, _MobilePhone);
			dbc.setString(22, _Address);
			dbc.setString(23, _Incumbency);
			dbc.setString(24, _IncumbencyType);
			dbc.setString(25, _Resume);
			dbc.setDate(26, DataConvert.StrTosqlDate(_Birthday));
			dbc.setDate(27, DataConvert.StrTosqlDate(_GraduateDate));
			System.out.println(DataConvert.StrTosqlDate(_Birthday));
			System.out.println(DataConvert.StrTosqlDate(_GraduateDate));
			dbc.executeUpdate();
			dbc.close();
			return "1";

		} catch (Exception e) {
			System.err.println(e);
			return e.toString();
		}

	}

	/*
	 * Modify Employee
	 */

	public static String Modify(String _EmployeeID, String _UserName,
			String _Sex, String _Branch, String _NativePlace, String _Marriage,
			String _IdentityID, String _Politics, String _Folk,
			String _Education, String _Department, String _University,
			String _AccumulateID, String _AdministrationLevel, String _Duty,
			String _Position, String _ForeignLanguage, String _FLLevel,
			String _ComputerLevel, String _Phone, String _MobilePhone,
			String _Address, String _Incumbency, String _IncumbencyType,
			String _Resume, String _Birthday, String _GraduateDate) {
		DBConnect dbc = null;
		try {
			dbc = new DBConnect();
			dbc
					.prepareStatement("UPDATE Employee SET UserName=?,Sex=?,Branch=?,NativePlace=?,"
							+ "Marriage=?,IdentityID=?,Politics=?,Folk=?,Education=?,Department=?,University=?,AccumulateID=?,"
							+ "AdministrationLevel=?,Duty=?,Position=?,ForeignLanguage=?,FLLevel=?,ComputerLevel=?,Phone=?,"
							+ "MobilePhone=?,Address=?,Incumbency=?,IncumbencyType=?,Resume=?,Birthday=?, GraduateDate=?"
							+ " WHERE EmployeeID=?");
			dbc.setString(1, _UserName);
			dbc.setString(2, _Sex);
			dbc.setString(3, _Branch);
			dbc.setString(4, _NativePlace);
			dbc.setString(5, _Marriage);
			dbc.setString(6, _IdentityID);
			dbc.setString(7, _Politics);
			dbc.setString(8, _Folk);
			dbc.setString(9, _Education);
			dbc.setString(10, _Department);
			dbc.setString(11, _University);
			dbc.setString(12, _AccumulateID);
			dbc.setString(13, _AdministrationLevel);
			dbc.setString(14, _Duty);
			dbc.setString(15, _Position);
			dbc.setString(16, _ForeignLanguage);
			dbc.setString(17, _FLLevel);
			dbc.setString(18, _ComputerLevel);
			dbc.setString(19, _Phone);
			dbc.setString(20, _MobilePhone);
			dbc.setString(21, _Address);
			dbc.setString(22, _Incumbency);
			dbc.setString(23, _IncumbencyType);
			dbc.setString(24, _Resume);
			dbc.setDate(25, DataConvert.StrTosqlDate(_Birthday));
			dbc.setDate(26, DataConvert.StrTosqlDate(_GraduateDate));
			dbc.setString(27, _EmployeeID);
			dbc.executeUpdate();
			dbc.close();
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
			return e.toString();
		}
	}

	/*
	 * Delete Employee
	 */
	public static String Delete(String _EmployeeID) {
		try {
			DBConnect dbc = new DBConnect();
			dbc.prepareStatement("DELETE FROM employee WHERE EmployeeID=?");
			dbc.setString(1, _EmployeeID);
			dbc.executeUpdate();
			dbc.close();
			return "1";
		} catch (Exception e) {
			e.printStackTrace();
			return e.toString();
		}
	}

	/*
	 * the Employee exists?
	 */
	public static boolean IsExist(String _EmployeeID) throws Exception {
		DBConnect dbc = null;
		boolean IsExist = false;
		try {
			dbc = new DBConnect();
			dbc.prepareStatement("SELECT * FROM employee WHERE EmployeeID=?");
			dbc.setString(1, _EmployeeID);
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

	/*
	 * List All Employee
	 */
	public static Vector ListAll() {
		DBConnect dbc = null;
		Vector EmployeeVector = new Vector();

		String strSQL = "SELECT * FROM employee ORDER BY EmployeeID ASC";

		try {
			dbc = new DBConnect();
			dbc.prepareStatement(strSQL);
			ResultSet rs = dbc.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setEmployeeID(rs.getString("EmployeeID"));
				employee.setUserName(rs.getString("UserName"));
				employee.setSex(rs.getString("Sex"));
				employee.setBranch(rs.getString("Branch"));
				employee.setBirthday(rs.getString("Birthday"));
				employee.setNativePlace(rs.getString("NativePlace"));
				employee.setMarriage(rs.getString("Marriage"));
				employee.setIdentityID(rs.getString("IdentityID"));
				employee.setPolitics(rs.getString("Politics"));
				employee.setFolk(rs.getString("Folk"));
				employee.setEducation(rs.getString("Education"));
				employee.setDepartment(rs.getString("Department"));
				employee.setGraduateDate(rs.getString("GraduateDate"));
				employee.setUniversity(rs.getString("University"));
				employee.setAccumulateID(rs.getString("AccumulateID"));
				employee.setAdministrationLevel(rs
						.getString("AdministrationLevel"));
				employee.setDuty(rs.getString("Duty"));
				employee.setPosition(rs.getString("Position"));
				employee.setForeignLanguage(rs.getString("ForeignLanguage"));
				employee.setFLLevel(rs.getString("FLLevel"));
				employee.setComputerLevel(rs.getString("ComputerLevel"));
				employee.setPhone(rs.getString("Phone"));
				employee.setMobilePhone(rs.getString("MobilePhone"));
				employee.setAddress(rs.getString("Address"));
				employee.setIncumbency(rs.getString("Incumbency"));
				employee.setIncumbencyType(rs.getString("IncumbencyType"));
				employee.setResume(rs.getString("Resume"));
				EmployeeVector.add(employee);
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
		return EmployeeVector;

	}

	
	/*
	 * search Employee
	 */
	public static Vector Search(String _EmployeeID, String _UserName, String _Sex,
			String _Branch, String _NativePlace, String _Marriage,
			String _Politics, String _Folk, String _Education,
			String _AdministrationLevel, String _Duty, String _Position,
			String _Incumbency, String _IncumbencyType) {
		DBConnect dbc = null;
		Vector EmployeeVector = new Vector();

		String strSQL = "SELECT * FROM employee WHERE";

		if ((_EmployeeID.equals("")) & (_UserName.equals("")) & (_Sex.equals(""))
				& (_Branch.equals("")) & (_NativePlace.equals("")) & (_Marriage.equals("")) & (_Politics.equals(""))
				& (_Folk.equals("")) & (_Education.equals("")) & (_AdministrationLevel.equals("")) & (_Duty.equals(""))
				& (_Position.equals("")) & (_Incumbency.equals("")) & (_IncumbencyType.equals(""))) {
			strSQL = "SELECT * FROM employee ";
		} else {
			if (!_EmployeeID.equals(""))
				strSQL = strSQL + " EmployeeID LIKE '%" + _EmployeeID + "%' AND";
			if (!_UserName.equals(""))
				strSQL = strSQL + " UserName='" + _UserName + "' AND";
			if (!_Sex.equals(""))
				strSQL = strSQL + " Sex='" + _Sex + "' AND";
			if (!_Branch.equals(""))
				strSQL = strSQL + " Branch='" + _Branch + "' AND";
			if (!_NativePlace.equals(""))
				strSQL = strSQL + " NativePlace LIKE '%" + _NativePlace + "%' AND";
			if (!_Marriage.equals(""))
				strSQL = strSQL + " Marriage='" + _Marriage + "' AND";
			if (!_Politics.equals(""))
				strSQL = strSQL + " Politics='" + _Politics + "' AND";
			if (!_Folk.equals(""))
				strSQL = strSQL + " Folk LIKE '%" + _Folk + "%' AND";
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
				Employee employee = new Employee();
				employee.setEmployeeID(rs.getString("EmployeeID"));
				employee.setUserName(rs.getString("UserName"));
				employee.setSex(rs.getString("Sex"));
				employee.setBranch(rs.getString("Branch"));
				employee.setBirthday(rs.getString("Birthday"));
				employee.setNativePlace(rs.getString("NativePlace"));
				employee.setMarriage(rs.getString("Marriage"));
				employee.setIdentityID(rs.getString("IdentityID"));
				employee.setPolitics(rs.getString("Politics"));
				employee.setFolk(rs.getString("Folk"));
				employee.setEducation(rs.getString("Education"));
				employee.setDepartment(rs.getString("Department"));
				employee.setGraduateDate(rs.getString("GraduateDate"));
				employee.setUniversity(rs.getString("University"));
				employee.setAccumulateID(rs.getString("AccumulateID"));
				employee.setAdministrationLevel(rs
						.getString("AdministrationLevel"));
				employee.setDuty(rs.getString("Duty"));
				employee.setPosition(rs.getString("Position"));
				employee.setForeignLanguage(rs.getString("ForeignLanguage"));
				employee.setFLLevel(rs.getString("FLLevel"));
				employee.setComputerLevel(rs.getString("ComputerLevel"));
				employee.setPhone(rs.getString("Phone"));
				employee.setMobilePhone(rs.getString("MobilePhone"));
				employee.setAddress(rs.getString("Address"));
				employee.setIncumbency(rs.getString("Incumbency"));
				employee.setIncumbencyType(rs.getString("IncumbencyType"));
				employee.setResume(rs.getString("Resume"));
				EmployeeVector.add(employee);
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
		return EmployeeVector;

	}

	

	
	
	/*
	 * List All Employee
	 */
	public static Vector ListForBasic() {
		DBConnect dbc = null;
		Vector EmployeeVector = new Vector();

		String strSQL = "select EmployeeID,UserName from employee where EmployeeID not in (select EmployeeID from basic)";

		try {
			dbc = new DBConnect();
			dbc.prepareStatement(strSQL);
			ResultSet rs = dbc.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setEmployeeID(rs.getString("EmployeeID"));
				employee.setUserName(rs.getString("UserName"));
				
				EmployeeVector.add(employee);


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
		return EmployeeVector;

	}
	
	
	
	public static Vector ListForPay() {
		DBConnect dbc = null;
		Vector EmployeeVector = new Vector();

		String strSQL = "select EmployeeID,UserName from employee where EmployeeID  in (select EmployeeID from basic)";

		try {
			dbc = new DBConnect();
			dbc.prepareStatement(strSQL);
			ResultSet rs = dbc.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setEmployeeID(rs.getString("EmployeeID"));
				employee.setUserName(rs.getString("UserName"));
				
				EmployeeVector.add(employee);


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
		return EmployeeVector;

	}
	
	
	
	
	
	
}