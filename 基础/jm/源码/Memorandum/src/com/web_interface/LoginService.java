package com.web_interface;

import java.util.ArrayList;
import java.util.List;

import com.xinxi_Action.struts.form.LoginForm;
import com.xinxi_Action.struts.form.ZhuceForm;
import com.web_dao.LoginInterfaceDAO;
import com.web_serializable_bean.Login;

public class LoginService implements LoginServiceInterface {
	//1111
	private LoginInterfaceDAO loginInterfaceDAO;

	public boolean loginCheck(LoginForm loginForm) {
		// Login login=loginInterfaceDAO.loginCheck(login);
		Login login = new Login();
		login.setUserName(loginForm.getUserName());
		login.setPassWord(loginForm.getPassWord());
		return loginInterfaceDAO.loginCheck(login);
	}

	/**
	 * 注册操作
	 */
	public void save(ZhuceForm zhuceForm) {
		Login login = new Login();
		login.setUserName(zhuceForm.getUserName());
		login.setPassWord(zhuceForm.getPassWord());
		loginInterfaceDAO.save(login);
	}

	/**
	 * Service返回当前所有用户
	 */
	@SuppressWarnings("unchecked")
	public List<Login> userSelect() {
		List<? super Login> users = new ArrayList<Login>();
		users.add(new Login(""));
		for (Object o : loginInterfaceDAO.userSelectDao()) {
			users.add(new Login(o.toString()));
		}
		return (List<Login>) users;
	}

	public LoginInterfaceDAO getLoginInterfaceDAO() {
		return loginInterfaceDAO;
	}

	public void setLoginInterfaceDAO(LoginInterfaceDAO loginInterfaceDAO) {
		this.loginInterfaceDAO = loginInterfaceDAO;
	}

}
