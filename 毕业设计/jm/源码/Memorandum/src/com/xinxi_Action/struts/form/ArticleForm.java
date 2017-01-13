package com.xinxi_Action.struts.form;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class ArticleForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7897197122170647822L;
	// 版块ID
	private String class_id;
	// 栏目
	private String board_id;
	// ID:
	private String bbs_id;
	// 对应ID:
	private String bbs_id_boardid;
	// 帖子回复个数:
	private String bbs_number;
	// 作者名称:
	private String bbs_user;
	// 帖子标题:
	private String bbs_title;
	// 帖子内容:
	private String bbs_content;
	// 发布时间:
	private String bbs_time;
	// 封帖子
	private String onoff;
	// 栏目名称 (管理发帖子)
	private String board_name;

	public void reset(ActionMapping mapping, HttpServletRequest request) {
	}

	public String getBbs_id() {
		return bbs_id;
	}

	public void setBbs_id(String bbs_id) {
		this.bbs_id = bbs_id;
	}

	public String getBbs_id_boardid() {
		return bbs_id_boardid;
	}

	public void setBbs_id_boardid(String bbs_id_boardid) {
		this.bbs_id_boardid = bbs_id_boardid;
	}

	public String getBbs_number() {
		return bbs_number;
	}

	public void setBbs_number(String bbs_number) {
		this.bbs_number = bbs_number;
	}

	public String getBbs_user() {
		return bbs_user;
	}

	public void setBbs_user(String bbs_user) {
		this.bbs_user = bbs_user;
	}

	public String getBbs_title() {
		return bbs_title;
	}

	public void setBbs_title(String bbs_title) {
		try {
			this.bbs_title = new String(bbs_title.getBytes("ISO-8859-1"), "GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public String getBbs_content() {
		return bbs_content;
	}

	public void setBbs_content(String bbs_content) {
		try {
			this.bbs_content = new String(bbs_content.getBytes("ISO-8859-1"),
					"GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public String getBbs_time() {
		return bbs_time;
	}

	public void setBbs_time(String bbs_time) {
		this.bbs_time = bbs_time;
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

	public String getOnoff() {
		return onoff;
	}

	public void setOnoff(String onoff) {
		this.onoff = onoff;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
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

}
