package com.mydbsql.bbs;

public class RevertBean {

	private String user;
	private String neirong;
	private java.sql.Timestamp shijian;
	
	public RevertBean(){}
	
	public RevertBean(String user,String neirong ,java.sql.Timestamp shijian){
		this.user = user;
		this.neirong = neirong;
		this.shijian = shijian;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getNeirong() {
		return neirong;
	}

	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}

	public java.sql.Timestamp getShijian() {
		return shijian;
	}

	public void setShijian(java.sql.Timestamp shijian) {
		this.shijian = shijian;
	}

}
