package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import pojo.Emp;

import test.ConnectionFactory;

public class EmpDAO {
	public void updateEname(int empno, String ename) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		con.setAutoCommit(false);
		String sql = "UPDATE emp SET ename=? WHERE empno=?";
		PreparedStatement pst = con.prepareStatement(sql);
		// 对占位符赋值
		pst.setString(1, ename);
		pst.setInt(2, empno);
		pst.execute();
		con.commit();
		con.close();
	}

	public void updateSalary(int year, float money) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		con.setAutoCommit(false);
		String sql = "UPDATE emp SET salary=salary+? WHERE DATEDIFF(NOW(),hiredate)/365>=?";
		PreparedStatement pst = con.prepareStatement(sql);
		// 对占位符赋值
		pst.setFloat(1, money);
		pst.setInt(2, year);
		pst.execute();
		con.commit();
		con.close();
	}
	
	public void deleteByEmpno(int empno) throws Exception{
		Connection con=ConnectionFactory.getConnection();
		con.setAutoCommit(false);
		String sql="DELETE FROM emp WHERE empno=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, empno);
		pst.execute();
		con.commit();
		con.close();
	}
	
	public void depeteByEmpno(int[] empno) throws Exception{
		Connection con=ConnectionFactory.getConnection();
		con.setAutoCommit(false);
		String sql="DELETE FROM emp WHERE empno IN(";
		for(int i=0;i<empno.length;i++){
			sql+="?";
			if(i!=empno.length-1){
				sql+=",";
			}
		}
		sql+=")";
		PreparedStatement pst=con.prepareStatement(sql);
		for(int i=0;i<empno.length;i++){
			pst.setInt(i+1, empno[i]);
		}
		pst.execute();
		con.commit();
		con.close();
	}
	
	public void insert(Emp emp) throws Exception{
		Connection con=ConnectionFactory.getConnection();
		con.setAutoCommit(false);
		String sql="INSERT INTO emp(ename,sex,salary,comm,hiredate,deptno) VALUES(?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setObject(1, emp.getEname());
		pst.setObject(2, emp.getSex());
		pst.setObject(3,emp.getSalary());
		pst.setObject(4, emp.getComm());
		pst.setObject(5, emp.getHiredate());
		pst.setObject(6, emp.getDeptno());
		pst.execute();
		con.commit();
		con.close();
	}
	
	public void insert(ArrayList<Emp> list) throws Exception{
		Connection con=ConnectionFactory.getConnection();
		con.setAutoCommit(false);
		String sql="INSERT INTO emp(ename,sex,salary,comm,hiredate,deptno) VALUES(?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		for(int i=0;i<list.size();i++){
			Emp emp=list.get(i);
			pst.setObject(1, emp.getEname());
			pst.setObject(2, emp.getSex());
			pst.setObject(3,emp.getSalary());
			pst.setObject(4, emp.getComm());
			pst.setObject(5, emp.getHiredate());
			pst.setObject(6, emp.getDeptno());
			pst.execute();
		}
		con.commit();
		con.close();
	}
	
	public ArrayList<Object[]> search_1(String dname) throws Exception{
		Connection con=ConnectionFactory.getConnection();
		String sql="SELECT ";
		sql+="	e.empno, ";
		sql+="	e.ename, ";
		sql+="	e.salary, ";
		sql+="	d.dname ";
		sql+="FROM ";
		sql+="	emp e ";
		sql+="JOIN ( ";
		sql+="	SELECT ";
		sql+="		deptno, ";
		sql+="		AVG(salary) AS 'g' ";
		sql+="	FROM ";
		sql+="		emp ";
		sql+="	GROUP BY ";
		sql+="		deptno ";
		sql+=") t ON e.deptno = t.deptno ";
		sql+="JOIN dept d ON e.deptno = d.deptno ";
		sql+="WHERE ";
		sql+="	e.salary < t.g ";
		sql+="AND d.dname=? ";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setObject(1, dname);
		ResultSet set=pst.executeQuery();
		ArrayList<Object[]> list=new ArrayList<Object[]>();	//保存查询结果
		while(set.next()){
			int empno=set.getInt("empno");
			String ename=set.getString("ename");
			float salary=set.getFloat("salary");
			String dm=set.getString("dname");
			Object[] obj={empno,ename,salary,dm};
			list.add(obj);
		}

		return list;
	}
}
