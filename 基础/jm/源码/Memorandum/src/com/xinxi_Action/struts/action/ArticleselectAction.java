package com.xinxi_Action.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.web_interface.LoginServiceInterface;
import com.web_interface.fenye.FenyeSelectInterface;

import java.util.*;

import com.xinxi_Action.struts.form.ArticleselectForm;
import com.xinxi_Action.struts.session.*;
import com.web_serializable_bean.Login;

import static com.web_interface.fenye.FenyeSelect.newsdoMethod;

/**
 * �ռ�����
 * 
 * 
 */
public class ArticleselectAction extends DispatchAction {

	private static final Log log = LogFactory.getLog(ArticleselectAction.class);

	public ActionForward userselect(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// ����session�ж��û��Ƿ�ɹ���½���߹ر���ҳ����url�����з���
		// ����ҳ����ת �ɹ�=OK
		
		HttpSession session = request.getSession();
		SessionService sessionservice = new SessionService();
		boolean booleanUser = sessionservice.SessionService(session, StaticName.USERLOGIN = (String) session.getAttribute("login"));
		ArticleselectForm articleselectForm = (ArticleselectForm) form;
		articleselectForm.setOlympicgameinternational("1");
		
		if (booleanUser) {
			log.fatal("ArticleselectAction��֤OK");
			LoginServiceInterface fileService = getUserSelect();
			List<Login> users = fileService.userSelect();
			request.setAttribute("userselects", users);
			request.setAttribute("articleList", "");
			return mapping.findForward("users");
		} else {
			log.debug("ArticleselectAction��֤ʧ��");
			return mapping.findForward("fenyecuowu");
		}
	}

	public ActionForward articleselectusers(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		ArticleselectForm articleselectForm = (ArticleselectForm) form;
		articleselectForm.setUserlist("");
		// ����session�ж��û��Ƿ�ɹ���½���߹ر���ҳ����url�����з���
		// ����ҳ����ת �ɹ�=OK
		HttpSession session = request.getSession();
		SessionService sessionservice = new SessionService();
		boolean booleanUser = sessionservice.SessionService(session,
				StaticName.USERLOGIN = (String) session.getAttribute("login"));
		if (booleanUser) {
			log.fatal("�ռǲ�ѯOK");
			LoginServiceInterface fileService = getUserSelect();
			List<Login> users = fileService.userSelect();

			FenyeSelectInterface fenye = getArticleSelect();
			List articleList = fenye.blurSelect(articleselectForm);
			String dom = newsdoMethod(Integer.valueOf(articleselectForm.getOlympicgameinternational()));
			if (dom == "select") {
				request.setAttribute("userselects", users);
				request.setAttribute("articleList", articleList);
				request.setAttribute("dom", dom);
			} else {
				request.setAttribute("userselects", users);
				request.setAttribute("articleList", articleList);
				request.setAttribute("dom", dom);
			}

			return mapping.findForward("users");
		} else {
			return mapping.findForward("fenyecuowu");
		}
	}

	private LoginServiceInterface getUserSelect() {
		ApplicationContext appContext = WebApplicationContextUtils
				.getWebApplicationContext(this.getServlet().getServletContext());
		return (LoginServiceInterface) appContext.getBean("loginService");
	}

	private FenyeSelectInterface getArticleSelect() {
		ApplicationContext appContext = WebApplicationContextUtils
				.getWebApplicationContext(this.getServlet().getServletContext());
		return (FenyeSelectInterface) appContext.getBean("fenyeService");
	}

}
