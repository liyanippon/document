package com.xinxi_Action.struts.action.bbs;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.mydbsql.Dao;
import com.mydbsql.bbs.BBsTzBean;
import com.mydbsql.bbs.BbsBean;
import com.mydbsql.bbs.RevertBean;
import com.mydbsql.view.PlacardBean;
import com.xinxi_Action.struts.form.bbs.BbsForm;

public class BbsAction extends DispatchAction {

	public ActionForward bbs(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Dao d = new Dao();
		// 最近心情
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		List<BbsBean> bbs = new ArrayList<BbsBean>();
		bbs = d.getBbs();
		request.setAttribute("bbs", bbs);

		request.setAttribute("list_pb", list_pb);
		return mapping.findForward("bbsindex");
	}

	public ActionForward bbsedition(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Dao d = new Dao();
		// 最近心情
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		String class_id = request.getParameter("class_id");
		System.err.println(class_id);
		List<BbsBean> bbsList = new ArrayList<BbsBean>();
		bbsList = d.getBbseditionList(Integer.parseInt(request
				.getParameter("class_id")));
		request.setAttribute("bbsList", bbsList);

		request.setAttribute("list_pb", list_pb);
		return mapping.findForward("vbbsedition");
	}

	public ActionForward bbsselect(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Dao d = new Dao();
		// 最近心情
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		String board_id = request.getParameter("board_id");
		System.err.println(board_id);
		List<BBsTzBean> bbsListselect = new ArrayList<BBsTzBean>();
		bbsListselect = d.getbbsselect(Integer.parseInt(request
				.getParameter("board_id")));

		request.setAttribute("bbsListselect", bbsListselect);

		request.setAttribute("list_pb", list_pb);
		return mapping.findForward("editionbbsselect");
	}

	public ActionForward bbseditionbbsid(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		Dao d = new Dao();
		// 最近心情
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		String bbs_id = request.getParameter("bbs_id");
		System.err.println("bbs:" + bbs_id);
		List<BBsTzBean> bbsListbid = new ArrayList<BBsTzBean>();
		bbsListbid = d.getbbsid(Integer
				.parseInt(request.getParameter("bbs_id")));
		
		List<RevertBean> list_hui = new ArrayList<RevertBean>();
		list_hui = d.getHuifuselect(Integer.parseInt(request.getParameter("bbs_id")));
		
		request.setAttribute("list_hui", list_hui);
		request.setAttribute("bbsListbid", bbsListbid);
		request.setAttribute("list_pb", list_pb);
		return mapping.findForward("editionbbsselectbbsid");
	}
	
	public ActionForward bbseditionbbsidhuifu(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		HttpSession session = request.getSession();
		Dao d = new Dao();
		// 最近心情
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		List<BbsBean> bbs = new ArrayList<BbsBean>();
		bbs = d.getBbs();
		request.setAttribute("bbs", bbs);
		//		
		BbsForm ltForm = (BbsForm) form;
		System.out.println(ltForm.getHuifu());
		System.out.println(ltForm.getBbs_id());
		
		String user = (String) session.getAttribute("login");
		
		if(d.getHuifu(ltForm, user)){
			d.getbbs_id(Integer.parseInt(ltForm.getBbs_id()));
			System.err.println("成功");
			request.setAttribute("list_pb", list_pb);
			return mapping.findForward("bbsindex");
		}else{
			System.err.println("失败");
			request.setAttribute("list_pb", list_pb);
			return mapping.findForward("bbsindex");
		}
		
	}
	
	/**
	 * 登陆
	 */
	public ActionForward login(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		
		Dao d = new Dao();
		// 最近心情
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		request.setAttribute("list_pb", list_pb);
		
		return mapping.findForward("bbslogin");
	}
	
	/**
	 * 登陆select
	 */
	public ActionForward loginselect(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		HttpSession session = request.getSession();
		Dao d = new Dao();
		// 最近心情
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		List<BbsBean> bbs = new ArrayList<BbsBean>();
		bbs = d.getBbs();
		request.setAttribute("bbs", bbs);

		BbsForm bbsForm = (BbsForm) form;
		System.err.println(bbsForm.getUserName());
		System.err.println(bbsForm.getPassWord());
		if(d.getlongin(bbsForm)){
			System.err.println("登录成功");
			Object user = (Object) bbsForm.getUserName();
			session.setAttribute("login", user);
			request.setAttribute("list_pb", list_pb);
			return mapping.findForward("bbsindex");
		}else{
			System.err.println("登录失败");
			return mapping.findForward("bbsindex");
		}
		
	}
}
