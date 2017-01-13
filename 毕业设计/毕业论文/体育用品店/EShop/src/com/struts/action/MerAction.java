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
 * 
 * XDoclet definition:
 * @struts.action parameter="method" validate="true"
 */
public class MerAction extends BaseAction {
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
	public ActionForward browseIndexMer(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		List cateList = null;
		List merList = null;
		List smerList = null;
		MerService service = new MerServiceImpl();
		int paseSize = 3; //一页包含3条记录
		int pageNo = 1; //当前为第一页
		try{
			cateList = service.browseCategory();
			merList = service.browseMer(paseSize,pageNo,0,false);
			smerList = service.browseMer(paseSize,pageNo,0,true);
			if (cateList!=null)request.setAttribute("cateList", cateList);						
			if (merList!=null)request.setAttribute("merList", merList);
			if (smerList!=null)request.setAttribute("smerList", smerList);
		}catch(Exception ex){
			logger.info("在执行MerAction类中的browseIndexMer方法时出错：\n");
			ex.printStackTrace();
		}
		return mapping.findForward("index");
	}
	
	public ActionForward browseSMer(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		List smerList = null;
		MerService service = new MerServiceImpl();
		int pageNo = 1; //页号
		int pageSize = 15; //每页记录数
		int totals = 0; //记录总数
		int totalPages = 0; //总页数
		if (request.getParameter("pageNo")!=null)pageNo = Integer.parseInt(request.getParameter("pageNo"));			
		try{
			smerList = service.browseMer(pageSize,pageNo,0,true);
			totals = service.countRecord("select count(*) from Merchandise as a where a.special=1");
			if (smerList!=null)request.setAttribute("smerList", smerList);
			//设置总记录数、总页数、当前页号
			totalPages = totals / pageSize;
			if ((totals % pageSize)>0) totalPages++; 
			request.setAttribute("totals",new Integer(totals).toString());
			request.setAttribute("totalPages",new Integer(totalPages).toString());
			request.setAttribute("pageNo",new Integer(pageNo).toString());			
		}catch(Exception ex){
			logger.info("在执行MerAction类中的browseSMer方法时出错：\n");
			ex.printStackTrace();
		}
		return mapping.findForward("browseSMer");		
	}
	
	public ActionForward browseMer(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		List merList = null;
		MerService service = new MerServiceImpl();
		int pageNo = 1; //页号
		int pageSize = 15; //每页记录数
		int totals = 0; //记录总数
		int totalPages = 0; //总页数
		if (request.getParameter("pageNo")!=null)pageNo = Integer.parseInt(request.getParameter("pageNo"));			
		try{
			merList = service.browseMer(pageSize,pageNo,0,false);
			totals = service.countRecord("select count(*) from Merchandise as a where a.special=0");
			if (merList!=null)request.setAttribute("merList", merList);
			//设置总记录数、总页数、当前页号
			totalPages = totals / pageSize;
			if ((totals % pageSize)>0) totalPages++; 
			request.setAttribute("totals",new Integer(totals).toString());
			request.setAttribute("totalPages",new Integer(totalPages).toString());
			request.setAttribute("pageNo",new Integer(pageNo).toString());			
		}catch(Exception ex){
			logger.info("在执行MerAction类中的browseMer方法时出错：\n");
			ex.printStackTrace();
		}
		return mapping.findForward("browseMer");		
	}
	
	public ActionForward searchMer(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		List merList = null;
		MerService service = new MerServiceImpl();
		int pageNo = 1; //页号
		int pageSize = 15; //每页记录数
		int totals = 0; //记录总数
		int totalPages = 0; //总页数
		if (request.getParameter("pageNo")!=null)pageNo = Integer.parseInt(request.getParameter("pageNo"));			
		try{
			String hql = "from Merchandise as a ";
			String hql1 = "select count(*) from Merchandise as a ";
			String action ="mer.do?method=searchMer&";
			boolean hasWhere = false;
			String cateid = request.getParameter("cateid");
			String key = request.getParameter("key");
			if (cateid!=null&&Integer.parseInt(cateid)>0){
				request.setAttribute("cateid", cateid);
				hql = hql + "where a.category.id="+cateid;
				hasWhere = true;
				hql1 = hql1 + "where a.category.id="+cateid;
				action = action + "cateid="+cateid+"&";
			}
			if (key!=null){
				key = new String(key.getBytes("ISO8859-1"),"gb2312");
				request.setAttribute("key", key);
				if(hasWhere){
					hql = hql + " and a.merName like '%"+key+"%'";
					hql1 = hql1 + " and a.merName like '%"+key+"%'";
					action = action + "key="+key+"&";
				}else{
					hql = hql + " where a.merName like '%"+key+"%'";
					hql1 = hql1 + " where a.merName like '%"+key+"%'";
					action = action + "&key="+key+"&";
				}				
			}
			request.setAttribute("action", action);
			merList = service.browseMer(pageSize,pageNo,hql);
			totals = service.countRecord(hql1);
			if (merList!=null&&merList.size()>0)request.setAttribute("merList", merList);
			//设置总记录数、总页数、当前页号
			totalPages = totals / pageSize;
			if ((totals % pageSize)>0) totalPages++; 
			request.setAttribute("totals",new Integer(totals).toString());
			request.setAttribute("totalPages",new Integer(totalPages).toString());
			request.setAttribute("pageNo",new Integer(pageNo).toString());			
		}catch(Exception ex){
			logger.info("在执行MerAction类中的searchMer方法时出错：\n");
			ex.printStackTrace();
		}
		return mapping.findForward("searchMer");		
	}
	
	public ActionForward showMer(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		MerService service = new MerServiceImpl();
		try{
			Integer id = new Integer(0);
			if (request.getParameter("id")!=null)id = new Integer(request.getParameter("id"));
			Merchandise mer = service.loadMer(id);
			if (mer!=null)request.setAttribute("mer", mer);
		}catch(Exception ex){
			logger.info("在执行MerAction类中的showMer方法时出错：\n");
			ex.printStackTrace();
		}
		return mapping.findForward("showMer");		
	}
}