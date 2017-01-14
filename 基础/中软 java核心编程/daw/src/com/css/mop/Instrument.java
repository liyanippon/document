package com.css.mop;

public abstract class Instrument {
	private String insName;
	private String type;
	public String getInsName() {
		return insName;
	}
	public void setInsName(String insName) {
		this.insName = insName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	void  play(){
		
	};
	String getInfo() {
		return insName+type;
	}
}
