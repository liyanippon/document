package com.web_dao;

import java.util.List;

import com.web_serializable_bean.Login;

public interface LoginInterfaceDAO {
	public boolean loginCheck(Login login);
	
	/**
	 * ע�����
	 */
	void save(Login login);

    List<Login> userSelectDao();
}
