package com.xinxi_Action.struts.action.hou;

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
import com.mydbsql.view.LinkBean;
import com.mydbsql.view.PlacardBean;
import com.xinxi_Action.struts.form.hou.BackgroundForm;

public class BackgroundAction extends DispatchAction {

	public ActionForward link(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Dao d = new Dao();
		//最近心情
		PlacardBean pb = new PlacardBean();
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();

		request.setAttribute("list_pb", list_pb);
		return mapping.findForward("backgroundlink");
	}

	public ActionForward linkselectsql(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Dao d = new Dao();
		//最近心情
		PlacardBean pb = new PlacardBean();
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		BackgroundForm backgroundForm = (BackgroundForm) form;
		if (d.linkselectsql(backgroundForm.getWzmingcheng(), backgroundForm
				.getDizhi())) {
		} 
		request.setAttribute("list_pb", list_pb);
		return mapping.findForward("backgroundlink");
	}

	/**
	 * 后台相关链接删除
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward linkdele(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Dao d = new Dao();
		//最近心情
		PlacardBean pb = new PlacardBean();
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();
		request.setAttribute("list_pb", list_pb);

		return mapping.findForward("backgroundlink");
	}

	/**
	 * 后台最近心情
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward affiche(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Dao d = new Dao();
		PlacardBean pb = new PlacardBean();
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();

		request.setAttribute("list_pb", list_pb);
		return mapping.findForward("backgroundaffiche");
	}

	/**
	 * 后台最近心情修改
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward afficheupdatesql(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		Dao d = new Dao();

		//最近心情修改
		BackgroundForm backgroundForm = (BackgroundForm) form;
		if (d.afficheupdatesql(backgroundForm.getNeirong())) {
			System.err.println("最近心情更新成功");
		} else {
			System.err.println("最近心情更新失败");
		}

		PlacardBean pb = new PlacardBean();
		List<PlacardBean> list_pb = new ArrayList<PlacardBean>();
		list_pb = d.getPlacardBeanList();

		request.setAttribute("list_pb", list_pb);
		return mapping.findForward("backgroundaffiche");
	}
	
	
	
	/**
	 * 后台工作日记添加
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward coursesinsert(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		Dao d = new Dao();
		
	
		BackgroundForm backgroundForm = (BackgroundForm) form;
		String zhuti = backgroundForm.getZhuti();
		String zuozhe = backgroundForm.getZuozhe();
		String neirong = backgroundForm.getNeirong();
		if(d.coursesinsert(zuozhe, neirong, zhuti)){
			System.err.println("添加成功");
		}else{
			System.err.println("添加失败");
		}
//		

		
		return mapping.findForward("backgrounddelete");
	}
	
	
	
	/**
	 * 后台工作日记删除
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward academydelete(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		Dao d = new Dao();
		
		String cid=request.getParameter("cid");
		if(d.academydelete(Integer.parseInt(request.getParameter("cid")))){
			System.err.println("后台工作日记删除成功");
		}else{
			System.err.println("后台工作日记删除失败");
		}

		
		return mapping.findForward("backgrounddelete");
	}

	/**
	 * 后台工作日记
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward courses(ActionMapping mapping, ActionForm form,
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



		return mapping.findForward("backgroundcourses");
	}


}
