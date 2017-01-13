package com.web_serializable_bean;

public abstract class LoginAbstract implements java.io.Serializable {

	private Integer user_Id;

	private String userName;

	private String passWord;

	public LoginAbstract() {
	}

	public LoginAbstract(String userName) {
		this.userName = userName;
	}

	public LoginAbstract(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}

	public LoginAbstract(Integer user_Id, String userName, String passWord) {
		this.user_Id = user_Id;
		this.userName = userName;
		this.passWord = passWord;
	}

	public Integer getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(Integer user_Id) {
		this.user_Id = user_Id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
