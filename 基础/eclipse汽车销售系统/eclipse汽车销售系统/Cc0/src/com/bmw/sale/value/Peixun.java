package com.bmw.sale.value;

public class Peixun implements java.io.Serializable{
	
	private Integer peixunid;
	private String  peixunname;
	private String  peixundate;
	private String  peixunkemu;
	private String  zhungtai;
	
	public Peixun() {
		
	}
	public Peixun(Integer peixunid, String peixunname, String peixundate, String peixunkemu, String zhungtai) {
		super();
		this.peixunid = peixunid;
		this.peixunname = peixunname;
		this.peixundate = peixundate;
		this.peixunkemu = peixunkemu;
		this.zhungtai = zhungtai;
	}
	public Integer getPeixunid() {
		return peixunid;
	}
	public void setPeixunid(Integer peixunid) {
		this.peixunid = peixunid;
	}
	public String getPeixunname() {
		return peixunname;
	}
	public void setPeixunname(String peixunname) {
		this.peixunname = peixunname;
	}
	public String getPeixundate() {
		return peixundate;
	}
	public void setPeixundate(String peixundate) {
		this.peixundate = peixundate;
	}
	public String getPeixunkemu() {
		return peixunkemu;
	}
	public void setPeixunkemu(String peixunkemu) {
		this.peixunkemu = peixunkemu;
	}
	public String getZhungtai() {
		return zhungtai;
	}
	public void setZhungtai(String zhungtai) {
		this.zhungtai = zhungtai;
	}
	
	
}
