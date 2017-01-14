package dao.impl;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import po.Person;
import util.HibernateSessionFactory;
import dao.inter.PersonDAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;







public class PersonDAOImpl implements PersonDAO{

	private Connection conn;
	public PersonDAOImpl(){
		try {
			DriverManager.registerDriver(new Driver());
			
			String url = "jdbc:mysql://localhost:3306/mydb1";
			
			conn = DriverManager.getConnection(url,"root","123456");
			System.out.println(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private HibernateTemplate ht;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	public void add(Person p) {
		ht.save(p);
		
	}

	public Person check(String name,String password) throws SQLException{
		
		Person p = null;
		PreparedStatement pstmt = conn.prepareStatement("select * from person where name=? and password=?");

		pstmt.setString(1,name);
		pstmt.setString(2,password);
		
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			p = new Person();
			p.setPid(rs.getInt(1));
			p.setName(name);
			p.setPassword(password);
		}
		return p;
		
	}

	public void del(Integer pid) throws SQLException {
		//public void del(Person p) {

		
		Person p=this.getPerson(pid);
			ht.delete(p);
		
			/*Session session=HibernateSessionFactory.getSession();
			Transaction tr=session.beginTransaction();
			Person p=this.getPerson(pid);
			session.delete(p);
			tr.commit();*/
	}
	
public Person getPerson(Integer pid) throws SQLException{
		
		Session session=HibernateSessionFactory.getSession();
		return (Person)session.get(Person.class,pid);
	}

	public List<Person> getAll() {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Query query=session.createQuery("from Person");
		return query.list();
	}

}
