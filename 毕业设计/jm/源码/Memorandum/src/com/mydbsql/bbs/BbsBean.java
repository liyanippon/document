package com.mydbsql.bbs;

public class BbsBean {

	private int board_id;
	private String board_name;
	private String board_master;
	private String board_pcard;
	private int count;

	private int class_id;
	private String class_name;
	private String class_intro;
	private int board_classID;

	/**
	 * °æ¿é
	 * @param board_id
	 * @param board_name
	 * @param board_master
	 * @param board_pcard
	 */
	public BbsBean(int board_id, String board_name, String board_master,
			String board_pcard ,int count) {
		this.board_id = board_id;
		this.board_name = board_name;
		this.board_master = board_master;
		this.board_pcard = board_pcard;
		this.count = count;
	}
	public BbsBean(int board_id, String board_name, String board_master,
			String board_pcard ) {
		this.board_id = board_id;
		this.board_name = board_name;
		this.board_master = board_master;
		this.board_pcard = board_pcard;
	}

	public BbsBean() {
	}

	public BbsBean(int class_id, String class_name, String class_intro,
			int board_classID) {
		this.class_id = class_id;
		this.class_name = class_name;
		this.class_intro = class_intro;
		this.board_classID = board_classID;

	}

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getClass_intro() {
		return class_intro;
	}

	public void setClass_intro(String class_intro) {
		this.class_intro = class_intro;
	}

	public int getBoard_classID() {
		return board_classID;
	}

	public void setBoard_classID(int board_classID) {
		this.board_classID = board_classID;
	}

	public int getBoard_id() {
		return board_id;
	}

	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}

	public String getBoard_name() {
		return board_name;
	}

	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}

	public String getBoard_master() {
		return board_master;
	}

	public void setBoard_master(String board_master) {
		this.board_master = board_master;
	}

	public String getBoard_pcard() {
		return board_pcard;
	}

	public void setBoard_pcard(String board_pcard) {
		this.board_pcard = board_pcard;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
