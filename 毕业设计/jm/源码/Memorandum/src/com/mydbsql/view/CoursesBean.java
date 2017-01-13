package com.mydbsql.view;

/**
 * ÔºÏµ¿Î³Ì
 * 
 * @author Administrator
 * 
 */
public class CoursesBean {

	private int cid;
	private String zhuti;
	private String zuozhe;
	private String neirong;
	private java.sql.Timestamp shijian;

	public CoursesBean() {
	}
	
	public CoursesBean(int cid,String zhuti,java.sql.Timestamp shijian){
		this.cid= cid;
		this.zhuti = zhuti;
		this.shijian = shijian;
	}
	
	public CoursesBean(int cid,String zhuti,String zuozhe,String neirong,java.sql.Timestamp shijian){
		this.cid= cid;
		this.zhuti = zhuti;
		this.zuozhe = zuozhe;
		this.neirong = neirong;
		this.shijian = shijian;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
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
