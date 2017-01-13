package com.xinxi_Action.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.web_dao.fen_dao.FenInterfaceDAO;
import com.web_interface.fenye.FenyeSelectInterface;
//import com.web_interface.fenye.FenyeSelectInterface;
/**
 * 2008/9/08 段萌萌 V_1.00
 */
public class VoteWenzhangAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
	System.out.println("进入了本页面");
	FenyeSelectInterface fenyeSelectInterface = getVote();
	List newsvotelist=fenyeSelectInterface.getNewsVote();
	//System.out.println(newsvotelist.toString());

	request.setAttribute("newsvotelist",newsvotelist);
	return mapping.findForward("report");
	}
	
	private FenyeSelectInterface  getVote() {
		ApplicationContext appContext = WebApplicationContextUtils
				.getWebApplicationContext(this.getServlet().getServletContext());
		return (FenyeSelectInterface) appContext.getBean("fenyeService");
	}
	
	
}
