package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateSessionFactory;

import com.vo.Person;

public class PersonDAO {

	
	public PersonDAO(){
		
	}
	
	public Person check(String name,String ps) throws SQLException{
		/*Person p = null;
		PreparedStatement pstmt = conn.prepareStatement("select * from person where name=? and password=?");

		pstmt.setString(1,name);
		pstmt.setString(2,ps);
		
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			p = new Person();
			p.setPid(rs.getInt(1));
			p.setName(name);
			p.setPassword(ps);
			p.setAddress(rs.getString(4));
		}
		return p;*/
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Person where name=? and password=?");
		
		query.setParameter(0,name);
		query.setParameter(1,ps);
		
		List<Person> list = query.list();
		return list.get(0);
	}
	
	public void insert(Person p) throws SQLException{
		/*PreparedStatement pstmt = conn.prepareStatement("insert into person values(?,?)");
		pstmt.setString(1,name);
		pstmt.setString(2, ps);
		
		pstmt.executeUpdate();*/
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tr = session.beginTransaction();
		
		session.save(p);
		
		tr.commit();
	}
	
	public List<Person> getAll() throws SQLException{
		/*List<Person> list = new ArrayList<Person>();
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
		return list;*/
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from Person");
		
		return query.list();
	}
	public void del(int pid) throws SQLException{
		/*PreparedStatement pstmt = conn.prepareStatement("delete from person where pid = ?");
		pstmt.setInt(1, pid);
		pstmt.executeUpdate();*/
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tr = session.beginTransaction();
		Person p = this.getPerson(pid);
		p.setPid(pid);
		session.delete(p);
		
		tr.commit();
		
	}
	public Person getPerson(int pid) throws SQLException{
		
		/*Person p = null;
		PreparedStatement pstmt = conn.prepareStatement("select * from person where pid = ?");
		pstmt.setInt(1,pid);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			p = new Person();
			
			p.setPid(pid);
			p.setName(rs.getString(2));
			p.setPassword(rs.getString(3));
			p.setAddress(rs.getString(4));
			
			
		}
		return p;*/
		Session session = HibernateSessionFactory.getSession();
		return (Person)session.get(Person.class, pid);
		
	}
	public void update(int pid,String name,String ps,String address) throws SQLException{
		/*PreparedStatement pstmt = conn.prepareStatement("update person set name = ? ,password=?,address=? where pid = ?");
		
		pstmt.setString(1,name);
		pstmt.setString(2,ps);
		pstmt.setString(3, address);
		pstmt.setInt(4,pid);
		
		pstmt.executeUpdate();*/
		Session session = HibernateSessionFactory.getSession();
		Transaction tr = session.beginTransaction();
		Person p = this.getPerson(pid);
		p.setAddress(address);
		p.setName(name);
		p.setPassword(ps);
		session.update(p);
		
		tr.commit();
		
	}

}
