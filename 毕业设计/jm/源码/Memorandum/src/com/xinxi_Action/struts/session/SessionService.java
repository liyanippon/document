package com.xinxi_Action.struts.session;

import javax.servlet.http.HttpSession;

public class SessionService {
	// ����������ת�м�����֤���ж��û��Ƿ�ɹ���½���߹ر���ҳ����url�����з���
	public boolean SessionService(HttpSession session, String login) {
		if (session.isNew() || login == null || login.equals("")) {
			return false;
		}
		return true;
	}

	// �ڵ�½login.do�м�����֤���ж��û��Ƿ�ɹ���½���߹ر���ҳ����url�����з���
	public boolean SessionServiceLogin(HttpSession session, String login) {
		if (session.isNew() || login == null || login.equals("")) {
			return true;
		}
		return false;
	}

	// ��ҳ���ж���ҳ��ҳ�͵�һҳ
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

	// ��ҳ���ж���ҳ��ҳ,�����ж�(next,previous):(true,false)
	// ��next,string_previousת����Integer���� pageCountz���һҳ
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
