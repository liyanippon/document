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
 * ��̳��ĿԤ��
 * 
 * @author Administrator
 * 
 */
public class LtglAction extends DispatchAction {

	/**
	 * ��ѯ��̳�����Ϣ
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
	 * ��̳���ɾ��
	 */
	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		LtglForm ltForm = (LtglForm) form;
		LtBanKuai bk = new LtBanKuai();
		bk.setClass_id(Integer.parseInt((ltForm.getClass_id())));
		Dao d = new Dao();
		if (d.luntandelete(bk)) {
			System.err.println("�ɹ�");
		} else {
			System.err.println("ʧ��");
		}

		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		return mapping.findForward("ltglforward");
	}

	/**
	 * ��̳����޸�
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
			System.err.println("�ɹ�");
		} else {
			System.err.println("ʧ��");
		}

		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		return mapping.findForward("ltglforward");
	}

	/**
	 * ��̳��Ŀ���luntantianjiavi
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
	 * ��̳��Ŀ���
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
			System.err.println("�ɹ���");
		}else{
			System.err.println("ʧ����");
		}
		
		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		request.setAttribute("fanhui", null);

		// ������Ŀ�޸�����
		request.setAttribute("selectupdate", null);


		return mapping.findForward("ltgllanmu");
	}
	/**
	 * ��̳������
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
			System.err.println("�ɹ�");
		} else {
			System.err.println("ʧ��");
		}

		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		return mapping.findForward("ltglforward");
	}

	/**
	 * ��̳������(��תҳ��)
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
	 * ��̳��Ŀ(��תҳ��)
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

		// ������Ŀ�޸�����
		request.setAttribute("selectupdate", null);

		return mapping.findForward("ltgllanmu");
	}

	/**
	 * ��̳��Ŀ��ѯ
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
		// ��ѯ���ļ���
		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		// �û��鿴��Ŀ�ķ��ؽ��
		BoardBean bb = new BoardBean();
		bb.setBoard_classID(Integer.parseInt(ltForm.getClass_id()));
		List<BoardBean> select = new ArrayList<BoardBean>();
		select = d.getLuntanlanmuselect(bb);

		// ���ر���
		List<BiaotiBean> bt = new ArrayList<BiaotiBean>();
		bt = d.getBiaoti(Integer.parseInt(ltForm.getClass_id()));
		request.setAttribute("biaoti", bt);

		request.setAttribute("Bankuai", Bankuai);

		request.setAttribute("fanhui", select);
		// ������Ŀ�޸�����
		request.setAttribute("selectupdate", null);

		return mapping.findForward("ltgllanmu");
	}

	/**
	 * ��̳��Ŀ�޸�(��ת)
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward lanmuupdate(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		System.err.println("�����޸�ҳ��");
		Dao d = new Dao();
		LtglForm ltForm = (LtglForm) form;
		// ��ѯ���ļ���
		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		// �û��鿴��Ŀ�ķ��ؽ��
		BoardBean bb = new BoardBean();

		String id = request.getParameter("board_id");

		System.err.println("id=" + id);

		bb.setBoard_id(Integer.parseInt(id));
		List<BoardBean> selectupdate = new ArrayList<BoardBean>();
		selectupdate = d.getLuntanlanmuuserselect(bb);

		request.setAttribute("Bankuai", Bankuai);

		request.setAttribute("fanhui", null);

		// ������Ŀ�޸�����
		request.setAttribute("selectupdate", selectupdate);

		return mapping.findForward("ltgllanmu");
	}

	/**
	 * ��̳��Ŀ�޸�
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward lanmusqlupdate(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		System.err.println("�����޸�ҳ��");
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
			System.err.println("�ɹ���");
		} else {
			System.err.println("ʧ����");
		}

		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		return mapping.findForward("ltgllanmu");
	}

	/**
	 * ��̳��Ŀɾ��
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
		System.err.println("����ɾ��ҳ��");
		LtglForm ltForm = (LtglForm) form;
		Dao d = new Dao();
		BoardBean bb = new BoardBean();
		bb.setBoard_id(Integer.parseInt(ltForm.getBoard_id()));

		if (d.luntanlanmudelete(bb)) {
			System.err.println("ɾ���ɹ���");
		} else {
			System.err.println("ɾ��ʧ����");
		}

		List<LtBanKuai> Bankuai = new ArrayList<LtBanKuai>();
		Bankuai = d.getLuntanBanKuai();
		request.setAttribute("Bankuai", Bankuai);

		return mapping.findForward("ltgllanmu");
	}

}
