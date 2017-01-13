/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.struts.action;

import java.util.*;
import javax.servlet.http.*;
import org.apache.struts.action.*;
import com.ORM.*;
import com.base.*;
import com.service.*;

/** 
 * @author ZHOU
 * XDoclet definition:
 * @struts.action parameter="method" validate="true"
 */
public class OrderAction extends BaseAction {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward browseOrder(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = null;
		OrderService service = new OrderServiceImpl();
		List result = null;
		try{
			//判断会员是否已成功登录
			Member mem = (Member)request.getSession().getAttribute("member");			
			if(mem==null){
				forward = mapping.findForward("memSorry");
			}else{
				result = service.browseOrder(mem);
				if(result!=null&&result.size()>0)request.setAttribute("result", result);	
				forward = mapping.findForward("browseOrder");
			}			
		}catch(Exception ex){
			logger.info("在执行OrderAction类中的browseOrder方法时出错：\n");
			ex.printStackTrace();
		}
		return forward;
	}
	
	public ActionForward viewOrder(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = null;
		OrderService service = new OrderServiceImpl();
		MerService merService = new MerServiceImpl();
		Map row = null;
		List result = null;		
		Orders order = null;
		Integer id = new Integer(0);
		if(request.getParameter("id")!=null)id = new Integer(request.getParameter("id"));
		try{
			//判断会员是否已成功登录
			Member mem = (Member)request.getSession().getAttribute("member");			
			if(mem==null){
				forward = mapping.findForward("memSorry");
			}else{
				order = service.loadOrder(id);
				if(order!=null){
					List tmp = service.browseOrderMer(order.getCart());
					if (tmp!=null && tmp.size()>0){
						result = new ArrayList();
						Iterator it = tmp.iterator();
						Cartselectedmer sel = null;
						Merchandise mer = null;
						while(it.hasNext()){
							row = new HashMap();
							sel = (Cartselectedmer)it.next();
							mer = merService.loadMer(sel.getMerchandise());
							row.put("merName", mer.getMerName().trim());
							row.put("memprice", sel.getPrice());
							row.put("price", mer.getPrice());						
							row.put("number", sel.getNumber());
							row.put("money", sel.getMoney());
							result.add(row);
						}
						request.setAttribute("result", result);	
					}					
					request.setAttribute("order", order);	
				}
				forward = mapping.findForward("viewOrder");
			}			
		}catch(Exception ex){
			logger.info("在执行OrderAction类中的viewOrder方法时出错：\n");
			ex.printStackTrace();
		}
		return forward;		
	}
	
	public ActionForward delOrder(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = null;
		OrderService service = new OrderServiceImpl();
		ActionMessages msgs = new ActionMessages();
		Integer id = new Integer(0);
		if(request.getParameter("id")!=null)id = new Integer(request.getParameter("id"));
		try{
			boolean status = false;
			//判断会员是否已成功登录
			Member mem = (Member)request.getSession().getAttribute("member");			
			if(mem==null){
				forward = mapping.findForward("memSorry");
			}else{
				status = service.delOrder(id);
				if (status){
					msgs.add("delOrderStatus",new ActionMessage(Constants.ORDER_DEL_SUC_KEY));
				}else{
					msgs.add("delOrderStatus",new ActionMessage(Constants.ORDER_DEL_FAIL_KEY));
				}				
				forward = new ActionForward("/order.do?method=browseOrder");
				saveErrors(request, msgs);
			}			
		}catch(Exception ex){
			logger.info("在执行OrderAction类中的delOrder方法时出错：\n");
			ex.printStackTrace();
		}
		return forward;		
	}
}