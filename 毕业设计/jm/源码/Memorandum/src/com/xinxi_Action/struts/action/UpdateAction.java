/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.xinxi_Action.struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.web_interface.fenye.FenyeSelectInterface;
import com.xinxi_Action.struts.form.UpdateForm;
import com.xinxi_Action.struts.session.SessionService;
import com.xinxi_Action.struts.session.StaticName;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * MyEclipse Struts Creation date: 12-05-2007
 * 
 * XDoclet definition:
 * 
 * @param <UpdateInterface>
 * @struts.action input="/web/addemd.jsp" scope="request" validate="true"
 */
public class UpdateAction extends Action {
	/*
	 * Generated Methods
	 */
	List<UpdateForm> update = new ArrayList<UpdateForm>();

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
		// 设置session判断用户是否成功登陆或者关闭网页后复制url来进行访问
		// 测试页面跳转 成功=OK
		HttpSession session = request.getSession();
		SessionService sessionservice = new SessionService();
		boolean booleanUser = sessionservice.SessionService(session,
				StaticName.USERLOGIN = (String) session.getAttribute("login"));
		if (booleanUser) {
			UpdateForm updateForm = (UpdateForm) form;
			FenyeSelectInterface updateService = getUpdateInterface();
			updateService.save(updateForm);
			return mapping.findForward("success");
		} else {
			return mapping.findForward("fenyecuowu");
		}

	}

	private FenyeSelectInterface getUpdateInterface() {
		ApplicationContext appContext = WebApplicationContextUtils
				.getWebApplicationContext(this.getServlet().getServletContext());
		return (FenyeSelectInterface) appContext.getBean("fenyeService");
	}
}
