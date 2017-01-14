package com.xinxi_Action.struts.form;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class ArticleselectForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7168474296849956904L;

	private String userlist;

	private String zhuti;

	private String olympicgameinternational;

	public void reset(ActionMapping mapping, HttpServletRequest request) {
	}

	public String getUserlist() {
		return userlist;
	}

	public void setUserlist(String userlist) {
		this.userlist = userlist;
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

	public String getOlympicgameinternational() {
		return olympicgameinternational;
	}

	public void setOlympicgameinternational(String olympicgameinternational) {
		this.olympicgameinternational = olympicgameinternational;
	}


}
