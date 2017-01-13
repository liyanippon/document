package com.mydbsql.view;

/**
 * ÍøÕ¾¹«¸æ
 * 
 * @author Administrator
 * 
 */
public class PlacardBean {

	private int id;
	private String neirong;
	private java.sql.Timestamp shijian;

	public PlacardBean() {
	}

	public PlacardBean(String neirong, java.sql.Timestamp shijian) {
		this.neirong = neirong;
		this.shijian = shijian;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
