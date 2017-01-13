package com.mydbsql.view;

/**
 * œ‡πÿ¡¥Ω”
 * 
 * @author Administrator
 * 
 */
public class LinkBean {

	private int lid;
	private String wzmingcheng;
	private String dizhi;

	public int getLid() {
		return lid;
	}

	public LinkBean() {
	}

	public LinkBean(int lid, String wzmingcheng, String dizhi) {
		this.lid = lid;
		this.wzmingcheng = wzmingcheng;
		this.dizhi = dizhi;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getWzmingcheng() {
		return wzmingcheng;
	}

	public void setWzmingcheng(String wzmingcheng) {
		this.wzmingcheng = wzmingcheng;
	}

	public String getDizhi() {
		return dizhi;
	}

	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}

}
