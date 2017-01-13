package com.xinxi_Action.struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.mydbsql.BbsArticleBean;
import com.mydbsql.BiaotiBean;
import com.mydbsql.BoardBean;
import com.mydbsql.Dao;
import com.mydbsql.LtBanKuai;
import com.xinxi_Action.struts.form.ArticleForm;

public class ArticleAction extends DispatchAction {

	/**
	 * 管理发帖子(添加数据)
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward lanmuarticleissuesql(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		HttpSession session = request.getSession();
		String user = (String) session.getAttribute("login");
		ArticleForm ltForm = (ArticleForm) form;
		System.err.println(user);
		System.err.println(ltForm.getBoard_id());
		System.err.println(ltForm.getBbs_title());
		System.err.println(ltForm.getBbs_content());
		int board_id = Integer.parseInt(ltForm.getBoard_id());
		String bbs_title = ltForm.getBbs_title();
		String bbs_content = ltForm.getBbs_content();

		Dao d = new Dao();
		if (d.luntantieziinsert(user, board_id, bbs_title, bbs_content)) {
			System.err.println("帖子发布成功");
		} else {
			System.err.println("帖子发布失败");
		}
		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		request.setAttribute("fanhui", null);

		// 返回栏目修改数据
		request.setAttribute("selectupdate", null);

		return mapping.findForward("articleselect");
	}

	/**
	 * 管理发帖子页面
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward lanmuarticleissue(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		HttpSession session = request.getSession();

		Dao d = new Dao();
		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		ArticleForm ltForm = (ArticleForm) form;
		System.err.println("id:" + Integer.parseInt(ltForm.getBoard_id()));
		System.err.println("栏目名称:" + ltForm.getBoard_name());
		int board_id = Integer.parseInt(ltForm.getBoard_id());
		String board_name = ltForm.getBoard_name();
		List<BoardBean> list = new ArrayList<BoardBean>();
		list.add(new BoardBean(board_id, board_name));

		// String user = (String) session.getAttribute("login");
		// System.err.println(user + ":发帖子");
		request.setAttribute("viwe", list);

		request.setAttribute("Bankuai", Bankuai);
		request.setAttribute("fanhui", null);
		// 返回栏目修改数据
		request.setAttribute("selectupdate", null);

		return mapping.findForward("articleissuetiezi");
	}

	/**
	 * 封帖子
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward luntanarticleonoff(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		// bbs_id=${a3.bbs_id}&onoff
		Dao d = new Dao();
		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();

		ArticleForm ltForm = (ArticleForm) form;

		System.err.println("111:" + ltForm.getBbs_id());
		System.err.println("222:" + ltForm.getOnoff());
		if (d.luntanonoff(Integer.parseInt(ltForm.getOnoff()), Integer
				.parseInt(ltForm.getBbs_id()))) {
			System.out.println("帖子状态修改成功");
		} else {
			System.out.println("帖子状态修改失败");
		}

		request.setAttribute("Bankuai", Bankuai);

		request.setAttribute("fanhui", null);

		// 返回栏目修改数据
		request.setAttribute("selectupdate", null);

		return mapping.findForward("articleselect");
	}

	public ActionForward luntanarticle(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Dao d = new Dao();
		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		request.setAttribute("fanhui", null);

		// 返回栏目修改数据
		request.setAttribute("selectupdate", null);

		return mapping.findForward("articleselect");
	}

	/**
	 * 论坛栏目查询
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward lanmuarticleselect(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		Dao d = new Dao();
		ArticleForm ltForm = (ArticleForm) form;
		// 查询版块的集合
		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		// 用户查看栏目的返回结果
		BoardBean bb = new BoardBean();
		bb.setBoard_classID(Integer.parseInt(ltForm.getClass_id()));
		List<BoardBean> select = new ArrayList<BoardBean>();
		select = d.getLuntanlanmuselect(bb);

		// 返回标题
		List<BiaotiBean> bt = new ArrayList<BiaotiBean>();
		bt = d.getBiaoti(Integer.parseInt(ltForm.getClass_id()));
		request.setAttribute("biaoti", bt);

		request.setAttribute("Bankuai", Bankuai);

		request.setAttribute("fanhui", select);
		// 返回栏目修改数据
		request.setAttribute("selectupdate", null);

		return mapping.findForward("articleselect");
	}

	/**
	 * 帖子进入
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward lanmuarticleselectsql(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		Dao d = new Dao();
		ArticleForm ltForm = (ArticleForm) form;
		// 查询版块的集合
		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();

		List<BbsArticleBean> tiezi = new ArrayList<BbsArticleBean>();
		// 帖子返回
		tiezi = d.getluntantieziselect(Integer.parseInt(ltForm.getBoard_id()));
		request.setAttribute("tiezi", tiezi);
		request.setAttribute("Bankuai", Bankuai);

		return mapping.findForward("articleselect");
	}

	/**
	 * 帖子主题进入
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward lanmuarticlebbstitle(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		Dao d = new Dao();
		ArticleForm ltForm = (ArticleForm) form;
		// 查询版块的集合
		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();

		// 帖子主题
		List<BbsArticleBean> zhuti = new ArrayList<BbsArticleBean>();
		zhuti = d.getluntantitle(Integer.parseInt(ltForm.getBbs_id()));

		request.setAttribute("Bankuai", Bankuai);
		request.setAttribute("tiezizhuti", zhuti);

		return mapping.findForward("articleselect");
	}

}
