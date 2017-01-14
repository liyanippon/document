package org.stuenroll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.stuenroll.util.ConnectionFactory;

public class SpecialtyDAO {
	public ArrayList getAll() throws Exception{
		String sql="SELECT * FROM specialty";
		Connection con=ConnectionFactory.getConnection();
		PreparedStatement pst=con.prepareStatement(sql);
		ResultSet set=pst.executeQuery();
		ArrayList list=new ArrayList();
		while(set.next()){
			Object id=set.getObject("id");
			Object name=set.getObject("name");
			Object[] obj={id,name};
			list.add(obj);
		}
		con.close();
		return list;
	}
}
