package com.web_interface;

import java.util.List;

import com.web_serializable_bean.Login;
import com.xinxi_Action.struts.form.LoginForm;
import com.xinxi_Action.struts.form.ZhuceForm;

public interface LoginServiceInterface {
	public boolean loginCheck(LoginForm loginForm);
	
	/**
	 * ע�����
	 */
	void save(ZhuceForm zhuceForm);
	
	/**
	 * interface���ص�ǰ�����û�
	 */
	List<Login> userSelect();
}





