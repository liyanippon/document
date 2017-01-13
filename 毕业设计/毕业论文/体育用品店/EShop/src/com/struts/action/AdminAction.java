package com.struts.action;

import javax.servlet.http.*;
import org.apache.struts.action.*;
import com.ORM.*;
import com.base.*;
import com.service.*;
import com.struts.form.AdminForm;
import java.util.*;

/**
 * @author ZHOU
 * @struts.action path="/Admin/admin" name="adminForm" input="/Admin/adminAddUser.jsp" parameter="method" scope="request" validate="true"
 */
public class AdminAction extends BaseAction {
	/** 
	 * Method 增加会员
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward addAdmin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		//adminform是首先在登陆成功前,用户输入,而程序封装好,给adminaction用的.
		//所以是有数据的.
		AdminForm adminForm = (AdminForm) form;
		Admin admin = new Admin();
		admin.setAdminName(adminForm.getAdminName().trim());
		admin.setLoginName(adminForm.getLoginName().trim());
		admin.setLoginPwd(adminForm.getLoginPwd().trim());
		admin.setAdminType(new Integer(adminForm.getAdminType()));
		AdminService service = new AdminServiceImpl();
		ActionMessages msgs = new ActionMessages();
		try{
			boolean status = service.addAdmin(admin);
			if (status){
				msgs.add("addAdminStatus",new ActionMessage(Constants.ADDADMIN_SUC_KEY));
			}else{				
				msgs.add("addAdminStatus",new ActionMessage(Constants.ADDADMIN_FAIL_KEY));
			}
			saveErrors(request, msgs);
		}catch(Exception ex){
			logger.info("在执行AdminAction类中的addAdmin方法时出错：\n");
			ex.printStackTrace();
		}
		return mapping.getInputForward();
	}
	
	public ActionForward browseAdmin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		List<Admin> list = null;
		AdminService service = new AdminServiceImpl();
		Admin admin = (Admin)request.getSession().getAttribute("Admin");
		//AdminType()的等级为4的时候,它是系统用户管理员
		if (admin==null||admin.getAdminType().intValue()!=4){
			//权限不对,返回sorry视图
			return mapping.findForward("sorry");
		}
		try{
			list = service.browseAdmin();
			request.setAttribute("adminList", list);
		}catch(Exception ex){
			logger.info("在执行AdminAction类中的browseAdmin方法时出错：\n");
			ex.printStackTrace();
		}
		return mapping.findForward("browse");		
	}
	
	public ActionForward delAdmin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		//struts内置ActionMessages
		ActionMessages msgs = new ActionMessages();
		AdminService service = new AdminServiceImpl();
		String p = request.getParameter("id");
		Integer id = null;
		if(p!=null){
			id = new Integer(p);
		}else{
			id = new Integer(0);
		}
		try{
			boolean status = service.delAdmin(id);
			if (status){
				msgs.add("delAdminStatus",new ActionMessage(Constants.DELADMIN_SUC_KEY));
			}else{				
				msgs.add("delAdminStatus",new ActionMessage(Constants.DELADMIN_FAIL_KEY));
			}			
			saveErrors(request, msgs);
		}catch(Exception ex){
			logger.info("在执行AdminAction类中的delAdmin方法时出错：\n");
			ex.printStackTrace();
		}
		return mapping.findForward("delete");		
	}
	
	public ActionForward loadAdmin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		AdminService service = new AdminServiceImpl();
		Admin admin = null;
		String p = request.getParameter("id");
		Integer id = null;
		if(p!=null){
			id = new Integer(p);
		}else{
			id = new Integer(0);
		}
		try{
			admin = service.loadAdmin(id);
			if(admin!=null){
				form = new AdminForm();
				((AdminForm)form).setAdminName(admin.getAdminName().trim());
				((AdminForm)form).setLoginName(admin.getLoginName().trim());
				((AdminForm)form).setLoginPwd(admin.getLoginPwd().trim());				
				((AdminForm)form).setAdminType(admin.getAdminType().toString());
				request.setAttribute("adminForm", form);
				request.setAttribute("id", admin.getId());
			}
		}catch(Exception ex){
			logger.info("在执行AdminAction类中的loadAdmin方法时出错：\n");
			ex.printStackTrace();
		}
		return mapping.findForward("modify");		
	}
	
	public ActionForward modiAdmin(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		AdminForm adminForm = (AdminForm) form;
		AdminService service = new AdminServiceImpl();
		ActionMessages msgs = new ActionMessages();		
		String p = request.getParameter("id");
		Integer id = null;
		if(p!=null){
			id = new Integer(p);
		}else{
			id = new Integer(0);
		}
		try{
			Admin admin = service.loadAdmin(id);
			if (admin!=null){
				admin.setAdminName(adminForm.getAdminName().trim());
				admin.setLoginName(adminForm.getLoginName().trim());
				admin.setLoginPwd(adminForm.getLoginPwd().trim());				
				admin.setAdminType(new Integer(adminForm.getAdminType()));
			}
			boolean status = service.updateAdmin(admin);
			if (status){
				msgs.add("modiAdminStatus",new ActionMessage(Constants.MODIADMIN_SUC_KEY));
			}else{				
				msgs.add("modiAdminStatus",new ActionMessage(Constants.MODIADMIN_FAIL_KEY));
			}
			saveErrors(request, msgs);
		}catch(Exception ex){
			logger.info("在执行AdminAction类中的modiAdmin方法时出错：\n");
			ex.printStackTrace();
		}
		return mapping.findForward("modify");		
	}
}