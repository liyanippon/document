package com.mydbsql;

public class BbsArticleBean {
	// ID:
	private int bbs_id;
	// 对应ID:
	private int bbs_id_boardid;
	// 帖子回复个数:
	private int bbs_number;
	// 作者名称:
	private String bbs_user;
	// 帖子标题:
	private String bbs_title;
	// 帖子内容:
	private String bbs_content;
	// 发布时间:
	private java.sql.Timestamp bbs_time;
	// 打开或关闭帖子
	private int onoff;

	/**
	 * 返回集合帖子
	 * 
	 * @param bbs_id
	 * @param bbs_user
	 * @param bbs_title
	 * @param bbs_time
	 */
	public BbsArticleBean(int bbs_id, int bbs_number, String bbs_user,
			String bbs_title, java.sql.Timestamp bbs_time, int onoff) {
		this.bbs_id = bbs_id;
		this.bbs_number = bbs_number;
		this.bbs_user = bbs_user;
		this.bbs_title = bbs_title;
		this.bbs_time = bbs_time;
		this.onoff = onoff;
	}

	public BbsArticleBean(int bbs_id, int bbs_number, String bbs_title,
			java.sql.Timestamp bbs_time) {
		this.bbs_id = bbs_id;
		this.bbs_number = bbs_number;
		this.bbs_title = bbs_title;
		this.bbs_time = bbs_time;
	}

	/**
	 * 帖子主题进入
	 * 
	 * @param bbs_id
	 * @param bbs_user
	 * @param bbs_title
	 * @param bbs_content
	 * @param bbs_time
	 */
	public BbsArticleBean(int bbs_id, String bbs_user, String bbs_title,
			String bbs_content, java.sql.Timestamp bbs_time) {
		this.bbs_id = bbs_id;
		this.bbs_user = bbs_user;
		this.bbs_title = bbs_title;
		this.bbs_content = bbs_content;
		this.bbs_time = bbs_time;
	}

	public BbsArticleBean() {

	}

	public int getBbs_id() {
		return bbs_id;
	}

	public void setBbs_id(int bbs_id) {
		this.bbs_id = bbs_id;
	}

	public int getBbs_id_boardid() {
		return bbs_id_boardid;
	}

	public void setBbs_id_boardid(int bbs_id_boardid) {
		this.bbs_id_boardid = bbs_id_boardid;
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

	public String getBbs_content() {
		return bbs_content;
	}

	public void setBbs_content(String bbs_content) {
		this.bbs_content = bbs_content;
	}

	public java.sql.Timestamp getBbs_time() {
		return bbs_time;
	}

	public void setBbs_time(java.sql.Timestamp bbs_time) {
		this.bbs_time = bbs_time;
	}

	public int getOnoff() {
		return onoff;
	}

	public void setOnoff(int onoff) {
		this.onoff = onoff;
	}

}
