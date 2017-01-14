package com.xinxi_Action.struts.form.hou;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class BackgroundForm extends ActionForm {

	private String dizhi;
	private String wzmingcheng;
	private String neirong;
	private String zhuti;
	private String zuozhe;

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.zhuti = "";
		this.neirong = "";
	}

	public String getDizhi() {
		return dizhi;
	}

	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}

	public String getWzmingcheng() {
		return wzmingcheng;
	}

	public void setWzmingcheng(String wzmingcheng) {
		try {
			this.wzmingcheng = new String(wzmingcheng.getBytes("ISO-8859-1"),
					"GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public String getNeirong() {
		return neirong;
	}

	public void setNeirong(String neirong) {
		try {
			this.neirong = new String(neirong.getBytes("ISO-8859-1"), "GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public String getZhuti() {
		return zhuti;
	}

	public void setZhuti(String zhuti) {
		try {
			this.zhuti = new String(zhuti.getBytes("ISO-8859-1"), "GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public String getZuozhe() {
		return zuozhe;
	}

	public void setZuozhe(String zuozhe) {
		try {
			this.zuozhe = new String(zuozhe.getBytes("ISO-8859-1"), "GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
