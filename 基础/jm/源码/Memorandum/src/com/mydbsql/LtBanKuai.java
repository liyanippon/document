package com.mydbsql;

public class LtBanKuai {

	private int class_id;
	private String class_name;
	private String class_intro;

	public LtBanKuai() {
	}

	public LtBanKuai(int class_id, String class_name, String class_intro) {
		this.class_id = class_id;
		this.class_name = class_name;
		this.class_intro = class_intro;

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

}
