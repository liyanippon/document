package com.xinxi_Action.struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.mydbsql.BiaotiBean;
import com.mydbsql.BoardBean;
import com.mydbsql.Dao;
import com.mydbsql.LtBanKuai;
import com.xinxi_Action.struts.form.LtglForm;

/**
 * 论坛栏目预览
 * 
 * @author Administrator
 * 
 */
public class LtglAction extends DispatchAction {

	/**
	 * 查询论坛版块信息
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward select(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		LtglForm ltForm = (LtglForm) form;
		Dao d = new Dao();
		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		return mapping.findForward("ltglforward");
	}

	/**
	 * 论坛版块删除
	 */
	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		LtglForm ltForm = (LtglForm) form;
		LtBanKuai bk = new LtBanKuai();
		bk.setClass_id(Integer.parseInt((ltForm.getClass_id())));
		Dao d = new Dao();
		if (d.luntandelete(bk)) {
			System.err.println("成功");
		} else {
			System.err.println("失败");
		}

		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		return mapping.findForward("ltglforward");
	}

	/**
	 * 论坛版块修改
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward update(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		LtglForm ltForm = (LtglForm) form;
		LtBanKuai bk = new LtBanKuai();
		bk.setClass_id(Integer.parseInt((ltForm.getClass_id())));
		bk.setClass_name(ltForm.getClass_name());
		bk.setClass_intro(ltForm.getClass_intro());

		Dao d = new Dao();
		if (d.LuntanUpdate(bk)) {
			System.err.println("成功");
		} else {
			System.err.println("失败");
		}

		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		return mapping.findForward("ltglforward");
	}

	/**
	 * 论坛栏目添加luntantianjiavi
	 */
	public ActionForward luntantianjiavi(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		Dao d = new Dao();
		List jihe = new ArrayList();
		jihe = d.getLuntanBanKuai();
		request.setAttribute("jihe", jihe);

		return mapping.findForward("luntantianjiaviOK");
	}
	
	/**
	 * 论坛栏目添加
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward lanmusqlupdateok(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		LtglForm ltForm = (LtglForm) form;
		
		
		System.err.println(ltForm.getBankuai());
		System.err.println(ltForm.getBoard_name());
		System.err.println(ltForm.getBoard_master());
		System.err.println(ltForm.getBoard_pcard());
		BoardBean bb =new BoardBean();
		
		bb.setBoard_classID(Integer.parseInt(ltForm.getBankuai()));
		bb.setBoard_name(ltForm.getBoard_name());
		bb.setBoard_master(ltForm.getBoard_master());
		bb.setBoard_pcard(ltForm.getBoard_pcard());
		
		Dao d = new Dao();
		if(d.luntanlanmutianjia(bb)){
			System.err.println("成功啦");
		}else{
			System.err.println("失败啦");
		}
		
		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		request.setAttribute("fanhui", null);

		// 返回栏目修改数据
		request.setAttribute("selectupdate", null);


		return mapping.findForward("ltgllanmu");
	}
	/**
	 * 论坛版块添加
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward insertoop(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		LtglForm ltForm = (LtglForm) form;
		LtBanKuai bk = new LtBanKuai();
		bk.setClass_name(ltForm.getClass_name());
		bk.setClass_intro(ltForm.getClass_intro());
		Dao d = new Dao();
		if (d.luntaninsert(bk)) {
			System.err.println("成功");
		} else {
			System.err.println("失败");
		}

		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		return mapping.findForward("ltglforward");
	}

	/**
	 * 论坛版块添加(跳转页面)
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward insert(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		return mapping.findForward("ltglinsert");
	}

	/**
	 * 论坛栏目(跳转页面)
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward lanmu(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Dao d = new Dao();
		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		request.setAttribute("fanhui", null);

		// 返回栏目修改数据
		request.setAttribute("selectupdate", null);

		return mapping.findForward("ltgllanmu");
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
	public ActionForward lanmuselect(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Dao d = new Dao();
		LtglForm ltForm = (LtglForm) form;
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

		return mapping.findForward("ltgllanmu");
	}

	/**
	 * 论坛栏目修改(跳转)
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward lanmuupdate(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		System.err.println("进入修改页面");
		Dao d = new Dao();
		LtglForm ltForm = (LtglForm) form;
		// 查询版块的集合
		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		// 用户查看栏目的返回结果
		BoardBean bb = new BoardBean();

		String id = request.getParameter("board_id");

		System.err.println("id=" + id);

		bb.setBoard_id(Integer.parseInt(id));
		List<BoardBean> selectupdate = new ArrayList<BoardBean>();
		selectupdate = d.getLuntanlanmuuserselect(bb);

		request.setAttribute("Bankuai", Bankuai);

		request.setAttribute("fanhui", null);

		// 返回栏目修改数据
		request.setAttribute("selectupdate", selectupdate);

		return mapping.findForward("ltgllanmu");
	}

	/**
	 * 论坛栏目修改
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward lanmusqlupdate(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		System.err.println("进入修改页面");
		LtglForm ltForm = (LtglForm) form;
		// private String board_id;
		// private String board_name;
		// private String board_master;
		// private String board_pcard;
		// System.err.println(ltForm.getBoard_id());
		// System.err.println(ltForm.getBoard_name());
		// System.err.println(ltForm.getBoard_master());
		// System.err.println(ltForm.getBoard_pcard());
		Dao d = new Dao();

		BoardBean bb = new BoardBean();
		bb.setBoard_id(Integer.parseInt(ltForm.getBoard_id()));
		bb.setBoard_name(ltForm.getBoard_name());
		bb.setBoard_master(ltForm.getBoard_master());
		bb.setBoard_pcard(ltForm.getBoard_pcard());

		if (d.getluntanundatesql(bb)) {
			System.err.println("成功啦");
		} else {
			System.err.println("失败啦");
		}

		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		return mapping.findForward("ltgllanmu");
	}

	/**
	 * 论坛栏目删除
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward lanmuupdeletesql(ActionMapping mapping,
			ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		System.err.println("进入删除页面");
		LtglForm ltForm = (LtglForm) form;
		Dao d = new Dao();
		BoardBean bb = new BoardBean();
		bb.setBoard_id(Integer.parseInt(ltForm.getBoard_id()));

		if (d.luntanlanmudelete(bb)) {
			System.err.println("删除成功啦");
		} else {
			System.err.println("删除失败啦");
		}

		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		return mapping.findForward("ltgllanmu");
	}

}
