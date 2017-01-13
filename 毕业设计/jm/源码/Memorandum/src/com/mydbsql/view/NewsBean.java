package com.mydbsql.view;

/**
 * 近期要闻
 * 
 * @author Administrator
 * 
 */
public class NewsBean {

	private int nid;
	private String zhuti;
	private String zuozhe;
	private String neirong;
	private java.sql.Timestamp shijian;

	public NewsBean() {
	}

	public NewsBean(String zhuti, java.sql.Timestamp shijian) {
		this.zhuti = zhuti;
		this.shijian = shijian;
	}

	public NewsBean(int nid, String zhuti, java.sql.Timestamp shijian) {
		this.nid = nid;
		this.zhuti = zhuti;
		this.shijian = shijian;
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getZhuti() {
		return zhuti;
	}

	public void setZhuti(String zhuti) {
		this.zhuti = zhuti;
	}

	public String getZuozhe() {
		return zuozhe;
	}

	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
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
