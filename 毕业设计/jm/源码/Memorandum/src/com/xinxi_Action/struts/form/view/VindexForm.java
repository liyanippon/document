package com.xinxi_Action.struts.form.view;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class VindexForm extends ActionForm{
	
	private String zhuti;
	
	
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
	}



	public String getZhuti() {
		return zhuti;
	}



	public void setZhuti(String zhuti) {
		try {
			this.zhuti = new String(zhuti.getBytes("ISO-8859-1"),
					"GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
