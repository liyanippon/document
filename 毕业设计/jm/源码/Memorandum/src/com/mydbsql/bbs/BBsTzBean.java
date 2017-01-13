package com.mydbsql.bbs;

public class BBsTzBean {

	private int bbs_id;
	private int bbs_number;
	private String bbs_user;
	private String bbs_title;
	private String bbs_content;
	private java.sql.Timestamp bbs_time;

	public BBsTzBean() {
	}

	public BBsTzBean(int bbs_id, int bbs_number, String bbs_user,
			String bbs_title, String bbs_content, java.sql.Timestamp bbs_time) {
		this.bbs_id = bbs_id;
		this.bbs_number = bbs_number;
		this.bbs_user = bbs_user;
		this.bbs_title = bbs_title;
		this.bbs_content = bbs_content;
		this.bbs_time = bbs_time;
	}

	public BBsTzBean(int bbs_id, int bbs_number, String bbs_user,
			String bbs_title, java.sql.Timestamp bbs_time) {
		this.bbs_id = bbs_id;
		this.bbs_number = bbs_number;
		this.bbs_user = bbs_user;
		this.bbs_title = bbs_title;
		this.bbs_time = bbs_time;
	}

	public int getBbs_id() {
		return bbs_id;
	}

	public void setBbs_id(int bbs_id) {
		this.bbs_id = bbs_id;
	}

	public int getBbs_number() {
		return bbs_number;
	}

	public void setBbs_number(int bbs_number) {
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
		this.bbs_title = bbs_title;
	}

	public java.sql.Timestamp getBbs_time() {
		return bbs_time;
	}

	public void setBbs_time(java.sql.Timestamp bbs_time) {
		this.bbs_time = bbs_time;
	}

	public String getBbs_content() {
		return bbs_content;
	}

	public void setBbs_content(String bbs_content) {
		this.bbs_content = bbs_content;
	}

}
