package com.xinxi_Action.struts.form;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class LtglForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5347667037665921034L;
	/**
	 * 
	 */
	private String board_id;
	private String board_name;
	private String board_master;
	private String board_pcard;
	private String class_id;
	private String class_name;
	private String class_intro;
	private String bankuai;

	public void reset(ActionMapping mapping, HttpServletRequest request) {
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		try {
			this.class_name = new String(class_name.getBytes("ISO-8859-1"),
					"GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public String getClass_intro() {
		return class_intro;
	}

	public void setClass_intro(String class_intro) {
		try {
			this.class_intro = new String(class_intro.getBytes("ISO-8859-1"),
					"GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public String getClass_id() {
		return class_id;
	}

	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}

	public String getBoard_id() {
		return board_id;
	}

	public void setBoard_id(String board_id) {
		this.board_id = board_id;
	}

	public String getBoard_name() {
		return board_name;
	}

	public void setBoard_name(String board_name) {
		try {
			this.board_name = new String(board_name.getBytes("ISO-8859-1"),
					"GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public String getBoard_master() {
		return board_master;
	}

	public void setBoard_master(String board_master) {
		try {
			this.board_master = new String(board_master.getBytes("ISO-8859-1"),
					"GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public String getBoard_pcard() {
		return board_pcard;
	}

	public void setBoard_pcard(String board_pcard) {
		try {
			this.board_pcard = new String(board_pcard.getBytes("ISO-8859-1"),
					"GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getBankuai() {
		return bankuai;
	}

	public void setBankuai(String bankuai) {
		try {
			this.bankuai = new String(bankuai.getBytes("ISO-8859-1"), "GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
