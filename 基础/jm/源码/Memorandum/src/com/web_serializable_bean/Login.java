package com.web_serializable_bean;

import java.util.Set;

public class Login extends LoginAbstract implements java.io.Serializable {

	public Login() {
	}

	public Login(String userName) {
		super(userName);
	}

	public Login(String userName, String passWord) {
		super(userName, passWord);
	}

	public Login(Integer user_Id, String userName, String passWord) {
		super(user_Id, userName, passWord);
	}
}
