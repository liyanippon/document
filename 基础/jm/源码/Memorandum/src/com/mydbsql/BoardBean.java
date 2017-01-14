package com.mydbsql;

public class BoardBean {

	// 排序ID
	private int board_id;

	// 对应版块ID
	private int board_classID;

	// 栏目名字
	private String board_name;

	// 栏目管理者
	private String board_master;

	// 栏目说明
	private String board_pcard;

	public BoardBean() {
	}

	public BoardBean(int board_id, String board_name) {
		this.board_id = board_id;
		this.board_name = board_name;
	}

	public BoardBean(int board_id, String board_name, String board_master,
			String board_pcard) {
		this.board_id = board_id;
		this.board_name = board_name;
		this.board_master = board_master;
		this.board_pcard = board_pcard;

	}

	public int getBoard_id() {
		return board_id;
	}

	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}

	public int getBoard_classID() {
		return board_classID;
	}

	public void setBoard_classID(int board_classID) {
		this.board_classID = board_classID;
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

}
