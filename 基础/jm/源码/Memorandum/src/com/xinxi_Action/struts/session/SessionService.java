package com.xinxi_Action.struts.session;

import javax.servlet.http.HttpSession;

public class SessionService {
	// 在其他的跳转中加入验证，判断用户是否成功登陆或者关闭网页后复制url来进行访问
	public boolean SessionService(HttpSession session, String login) {
		if (session.isNew() || login == null || login.equals("")) {
			return false;
		}
		return true;
	}

	// 在登陆login.do中加入验证，判断用户是否成功登陆或者关闭网页后复制url来进行访问
	public boolean SessionServiceLogin(HttpSession session, String login) {
		if (session.isNew() || login == null || login.equals("")) {
			return true;
		}
		return false;
	}

	// 分页中判断上页下页和第一页
	public boolean Requrest_Next_PREVIOUS(String string_next,
			String string_previous, String pageCount) {
		if (string_next == null || string_next.equals("")) {
			if ((string_previous == null || string_previous.equals("") || string_previous == "1")) {
				if (pageCount == null || pageCount.equals("")) {
					return false;
				}
			}
		}
		return true;
	}

	// 分页中判断上页下页,继续判断(next,previous):(true,false)
	// 将next,string_previous转换成Integer类型 pageCountz最后一页
	public Integer RequrestNext_Previous_Integer(String string_next,
			String string_previous, String pageCount) {
		// Integer next_previous = 0;
		// Integer boolean_next = 0;
		if (!(string_next == null || string_next == null)) {
			// boolean_next = Integer.parseInt(pageCount);
			// next_previous = Integer.parseInt(string_next);
			// if (next_previous > boolean_next) {
			// next_previous = boolean_next;
			// return next_previous;
			// }
			return Integer.parseInt(string_next);
		} else if (!(string_previous == null || string_previous == null)) {
			return Integer.parseInt(string_previous);
		}
		return Integer.parseInt(pageCount);

	}
}
