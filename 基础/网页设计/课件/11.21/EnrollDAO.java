package org.stuenroll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.stuenroll.util.AES;
import org.stuenroll.util.ConnectionFactory;

public class EnrollDAO {
	public ArrayList search(String name, String pid, String specialty_id,
			String school_id, String class_id, String state_id, Integer start,
			Integer num) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ");
		sql.append("	ss. `name` AS n1, ");
		sql.append("	s.`name` AS n2, ");
		sql.append("	c.`name` AS n3, ");
		sql.append("	e.`name` AS n4, ");
		sql.append("	e.pid, ");
		sql.append("	e.tel, ");
		sql.append("	sp.`name` AS n5, ");
		sql.append("	e.id ");
		sql.append("FROM ");
		sql.append("	enroll e ");
		sql.append("JOIN student_state ss ON e.state_id = ss.id ");
		sql.append("LEFT JOIN school s ON e.school_id = s.id ");
		sql.append("LEFT JOIN class c ON c.id = e.class_id ");
		sql.append("LEFT JOIN specialty sp ON sp.id = e.specialty_id ");
		sql.append("WHERE 1=1 ");
		ArrayList param = new ArrayList();
		if (name != null && name.length() > 0) {
			sql.append("AND e.name=? ");
			param.add(name);
		}
		if (pid != null && pid.length() > 0) {
			sql.append("AND e.pid=? ");
			param.add(pid);
		}
		if (specialty_id != null && specialty_id.length() > 0) {
			sql.append("AND e.specialty_id=? ");
			param.add(specialty_id);
		}
		if (school_id != null && school_id.length() > 0) {
			sql.append("AND e.school_id=? ");
			param.add(school_id);
		}
		if (class_id != null && class_id.length() > 0) {
			sql.append("AND e.class_id=? ");
			param.add(class_id);
		}
		if (state_id != null && state_id.length() > 0) {
			sql.append("AND e.state_id=? ");
			param.add(state_id);
		}
		sql.append("LIMIT ?,?");
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pst = con.prepareStatement(sql.toString());
		for (int i = 0; i < param.size(); i++) {
			pst.setObject(i + 1, param.get(i));
		}
		pst.setObject(param.size() + 1, start);
		pst.setObject(param.size() + 2, num);
		ResultSet set = pst.executeQuery();
		ArrayList list = new ArrayList();
		while (set.next()) {
			String tel=(String)set.getObject("tel");
			tel=AES.decrypt(tel, AES.key);
			
			Object[] obj = { set.getObject("n1"), set.getObject("n2"),
					set.getObject("n3"), set.getObject("n4"),
					set.getObject("pid"), tel,
					set.getObject("n5"),set.getObject("id") };
			list.add(obj);
		}
		con.close();
		return list;
	}
}
