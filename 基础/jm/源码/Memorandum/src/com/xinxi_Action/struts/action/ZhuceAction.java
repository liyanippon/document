/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.xinxi_Action.struts.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.xinxi_Action.struts.form.ZhuceForm;
import com.web_interface.LoginServiceInterface;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



/*
 * 
 */
public class ZhuceAction extends Action {

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */

	private static final Log log = LogFactory.getLog(ZhuceAction.class);

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		ZhuceForm zhuceForm = (ZhuceForm) form;
		LoginServiceInterface fileServiceSave = getLoginSave();
		fileServiceSave.save(zhuceForm);
		return mapping.findForward("zhuceok");
	}

	private LoginServiceInterface getLoginSave() {
		ApplicationContext appContext = WebApplicationContextUtils
				.getWebApplicationContext(this.getServlet().getServletContext());
		return (LoginServiceInterface) appContext.getBean("loginService");
	}
}
