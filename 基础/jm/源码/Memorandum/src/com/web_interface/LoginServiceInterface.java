package com.web_interface;

import java.util.List;

import com.web_serializable_bean.Login;
import com.xinxi_Action.struts.form.LoginForm;
import com.xinxi_Action.struts.form.ZhuceForm;

public interface LoginServiceInterface {
	public boolean loginCheck(LoginForm loginForm);
	
	/**
	 * 注册操作
	 */
	void save(ZhuceForm zhuceForm);
	
	/**
	 * interface返回当前所有用户
	 */
	List<Login> userSelect();
}





