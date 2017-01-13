package com.web_dao;

import java.util.List;

import com.web_serializable_bean.Login;

public interface LoginInterfaceDAO {
	public boolean loginCheck(Login login);
	
	/**
	 * ×¢²á²Ù×÷
	 */
	void save(Login login);

    List<Login> userSelectDao();
}
