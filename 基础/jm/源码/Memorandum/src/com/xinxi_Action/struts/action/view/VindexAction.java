package com.xinxi_Action.struts.action.view;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.mydbsql.Dao;
import com.mydbsql.view.CoursesBean;
import com.mydbsql.view.FenYeBean;
import com.mydbsql.view.PlacardBean;
import com.web_serializable_bean.OlympicGames.OlympicGamesBean;
import com.web_serializable_bean.fenye_bean.Fenye;

public class VindexAction extends DispatchAction {

	/**
	 * 工作日记文章
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward academyselect(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		Dao d = new Dao();
		//最近心情
		PlacardBean pb = new PlacardBean();
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		request.setAttribute("list_pb", list_pb);
		System.err.println("进入工作日记");
		List<CoursesBean> list_cbsql = new ArrayList<CoursesBean>();
		list_cbsql = d.getAcademyListsql(Integer.parseInt(request
				.getParameter("cid")));

		request.setAttribute("list_cbsql", list_cbsql);

		return mapping.findForward("viewsacademyselect");
	}

	/**
	 * 工作日记
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward academy(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		Dao d = new Dao();
		//最近心情
		PlacardBean pb = new PlacardBean();
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		request.setAttribute("list_pb", list_pb);

		//分页Bean
		FenYeBean ff = new FenYeBean();
		List<FenYeBean> list_f = new ArrayList<FenYeBean>();

		//工作日记
		List<CoursesBean> list_cb = new ArrayList<CoursesBean>();
		int sum = Integer.parseInt(request.getParameter("sum"));
		if (sum == 1) {
			list_cb = d.getAcademyList(0, 15);
			list_f.add(new FenYeBean(0, 1));
			request.setAttribute("list_f", list_f);
		} else {

			String s = request.getParameter("shang");
			String x = request.getParameter("xia");
			if (s == null) {
				int xia = Integer.parseInt(x);
				int a = xia;
				xia *= 15;
				list_cb = d.getAcademyList(xia, 15);
				list_f.add(new FenYeBean(a, a + 1));
				request.setAttribute("list_f", list_f);

			} else {
				if (s.equals("0")) {
					list_cb = d.getAcademyList(0, 15);
					list_f.add(new FenYeBean(0, 1));
					request.setAttribute("list_f", list_f);
				} else {
					int shang = Integer.parseInt(s);
					shang -= shang;
					shang *= 15;
					list_cb = d.getAcademyList(shang, 15);
					list_f.add(new FenYeBean(shang, shang + 1));
					request.setAttribute("list_f", list_f);
				}
			}

		}
		request.setAttribute("list_cb", list_cb);

		return mapping.findForward("viewsacademy");
	}

	/**
	 * 进入学习日记分页
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward placard(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		Dao d = new Dao();
		//最近心情
		PlacardBean pb = new PlacardBean();
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		request.setAttribute("list_pb", list_pb);
		//分页Bean
		FenYeBean ff = new FenYeBean();
		List<FenYeBean> list_f = new ArrayList<FenYeBean>();
		//学习日记
		OlympicGamesBean og = new OlympicGamesBean();
		List<OlympicGamesBean> list_og = new ArrayList<OlympicGamesBean>();
		int sum = Integer.parseInt(request.getParameter("sum"));
		if (sum == 1) {
			list_og = d.getOlympicGamesBeanList(0, 15);
			list_f.add(new FenYeBean(0, 1));
			request.setAttribute("list_f", list_f);
		} else {

			String s = request.getParameter("shang");
			String x = request.getParameter("xia");
			if (s == null) {
				int xia = Integer.parseInt(x);
				int a = xia;
				xia *= 15;
				list_og = d.getOlympicGamesBeanList(xia, 15);
				list_f.add(new FenYeBean(a, a + 1));
				request.setAttribute("list_f", list_f);

			} else {
				if (s.equals("0")) {
					list_og = d.getOlympicGamesBeanList(0, 15);
					list_f.add(new FenYeBean(0, 1));
					request.setAttribute("list_f", list_f);
				} else {
					int shang = Integer.parseInt(s);
					shang -= shang;
					shang *= 15;
					list_og = d.getOlympicGamesBeanList(shang, 15);
					list_f.add(new FenYeBean(shang, shang + 1));
					request.setAttribute("list_f", list_f);
				}
			}

		}

		request.setAttribute("list_og", list_og);
		return mapping.findForward("viewsplacard");
	}

	public ActionForward news(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		Dao d = new Dao();
		//最近心情
		PlacardBean pb = new PlacardBean();
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		request.setAttribute("list_pb", list_pb);
		//分页Bean
		FenYeBean ff = new FenYeBean();
		List<FenYeBean> list_f = new ArrayList<FenYeBean>();
		//新闻公告
		Fenye fy = new Fenye();
		List<Fenye> list_fy = new ArrayList<Fenye>();
		int sum = Integer.parseInt(request.getParameter("sum"));

		if (sum == 1) {
			list_fy = d.getFenyeList(0, 15);
			list_f.add(new FenYeBean(0, 1));
			request.setAttribute("list_f", list_f);

		} else {

			String s = request.getParameter("shang");
			String x = request.getParameter("xia");
			if (s == null) {
				int xia = Integer.parseInt(x);
				int a = xia;
				xia *= 15;
				list_fy = d.getFenyeList(xia, 15);
				list_f.add(new FenYeBean(a, a + 1));
				request.setAttribute("list_f", list_f);
			} else {
				if (s.equals("0")) {
					list_fy = d.getFenyeList(0, 15);
					list_f.add(new FenYeBean(0, 1));
					request.setAttribute("list_f", list_f);
				} else {
					int shang = Integer.parseInt(s);
					shang -= shang;
					shang *= 15;
					list_fy = d.getFenyeList(shang, 15);
					list_f.add(new FenYeBean(shang, shang + 1));
					request.setAttribute("list_f", list_f);
				}
			}

		}

		request.setAttribute("list_fy", list_fy);
		return mapping.findForward("viewsnews");
	}

	/**
	 * 进入首页
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward vhtml(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		Dao d = new Dao();
		//最近心情
		PlacardBean pb = new PlacardBean();
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		request.setAttribute("list_pb", list_pb);
		

		//新闻公告
		Fenye fy = new Fenye();
		List<Fenye> list_fy = new ArrayList<Fenye>();
		list_fy = d.getFenyeList(0, 7);

		//学习日记
		OlympicGamesBean og = new OlympicGamesBean();
		List<OlympicGamesBean> list_og = new ArrayList<OlympicGamesBean>();
		list_og = d.getOlympicGamesBeanList(0, 7);

		request.setAttribute("list_fy", list_fy);
		request.setAttribute("list_og", list_og);
		return mapping.findForward("viewsindex");
	}

	public ActionForward newsselect(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		Dao d = new Dao();
		//最近心情
		PlacardBean pb = new PlacardBean();
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		List<Fenye> list_FenyeSelect = new ArrayList<Fenye>();
		list_FenyeSelect = d.getFenyeSelect(Integer.parseInt(request
				.getParameter("fenye_Id")));
		request.setAttribute("list_FenyeSelect", list_FenyeSelect);

		request.setAttribute("list_pb", list_pb);

		return mapping.findForward("viewsnewsselect");
	}

	/**
	 * 进入学习日记文章
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward placardselect(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		Dao d = new Dao();
		//最近心情
		PlacardBean pb = new PlacardBean();
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		List<OlympicGamesBean> list_GamesBeanSelect = new ArrayList<OlympicGamesBean>();
		list_GamesBeanSelect = d.getOlympicGamesBeanSelect(Integer
				.parseInt(request.getParameter("fenye_Id")));
		request.setAttribute("list_GamesBeanSelect", list_GamesBeanSelect);

		String fenye_Id = request.getParameter("fenye_Id");
		System.err.println("学习日记文章" + fenye_Id);

		request.setAttribute("list_pb", list_pb);

		return mapping.findForward("viewsplacardselect");
	}

	public ActionForward links(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		Dao d = new Dao();
		//最近心情
		PlacardBean pb = new PlacardBean();
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		request.setAttribute("list_pb", list_pb);
		return mapping.findForward("viewslinks");
	}

}
