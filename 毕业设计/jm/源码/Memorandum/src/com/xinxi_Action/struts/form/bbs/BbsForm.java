package com.xinxi_Action.struts.form.bbs;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class BbsForm extends ActionForm {

	private String huifu;
	private String bbs_id;
	
	private String passWord;

	/** username property */
	private String userName;

	public void reset(ActionMapping mapping, HttpServletRequest request) {

	}

	public String getHuifu() {
		return huifu;
	}

	public void setHuifu(String huifu) {
		try {
			this.huifu = new String(huifu.getBytes("ISO-8859-1"), "GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public String getBbs_id() {
		return bbs_id;
	}

	public void setBbs_id(String bbs_id) {
		this.bbs_id = bbs_id;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		try {
			this.userName = new String(userName.getBytes("ISO-8859-1"), "GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
