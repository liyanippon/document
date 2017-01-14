/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.xinxi_Action.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import java.util.*;

import com.web_interface.fenye.FenyeSelectInterface;
import com.web_serializable_bean.fenye_bean.Fenye;
import com.xinxi_Action.struts.session.SessionService;
import com.xinxi_Action.struts.session.StaticName;

/**
 * MyEclipse Struts Creation date: 12-06-2007
 * 
 * XDoclet definition:
 * 
 * @struts.action validate="true"
 * @struts.action-forward name="success" path="/select.jsp"
 */
public class SelectAction extends Action {
	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		// 判断用户是否曾经登陆过,或者关闭网页从新访问登陆后的页面
		SessionService sessionservice = new SessionService();
		boolean booleanUser = sessionservice.SessionService(session,
				StaticName.USERLOGIN = (String) session.getAttribute("login"));
		if (booleanUser) {
			String fenye_Id = request.getParameter("fenye_Id");
			String fwjilu = request.getParameter("fwjilu");
			FenyeSelectInterface fenyeSelectInterface = getSelectInterface();
			//访问记录增加SelectZengJia_JL
			if (fenyeSelectInterface.SelectZengJia_JL(Integer.parseInt(fenye_Id), Integer.parseInt(fwjilu))) {
				//查询指定的文章
				List<Fenye> select = (List<Fenye>) fenyeSelectInterface
						.Select(Integer.parseInt(fenye_Id));
				request.setAttribute("select", select);
				return mapping.findForward("success");
			} else {
				return mapping.findForward("fenye");
			}

		} else {
			return mapping.findForward("fenyecuowu");
		}
	}

	// ApplicationContext的设置
	private FenyeSelectInterface getSelectInterface() {
		ApplicationContext appContext = WebApplicationContextUtils
				.getWebApplicationContext(this.getServlet().getServletContext());
		return (FenyeSelectInterface) appContext.getBean("fenyeService");
	}
}