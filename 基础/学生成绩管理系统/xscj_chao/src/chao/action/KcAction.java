package chao.action;

import java.util.List;
import java.util.Map;

import chao.model.Kcb;
import chao.model.Xsb;
import chao.service.KcService;
import chao.service.XsService;
import chao.serviceimp.KcServiceImp;
import chao.serviceimp.XsServiceImp;
import chao.tool.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class KcAction extends ActionSupport {

	private int pageNow=1;
	private int pageSize=8; 
	private Kcb kc; 
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public Kcb getKc() {
		return kc;
	}
	public void setKc(Kcb kc) {
		this.kc = kc;
	}
	XsService xsService=new XsServiceImp();
	KcService kcService=new KcServiceImp();
	public String execute() throws Exception {

		return SUCCESS;
	}
	public String addKc() throws Exception {
		Kcb kc1=new Kcb();
		String kch=kc.getKch();
		if(kcService.find(kch)!=null)
		{
			return ERROR;
		}
		kc.setKch(kc.getKch());
		kc1.setKcm(kc.getKcm());
		kc1.setKxxq(kc.getKxxq());
		kc1.setXs(kc.getXs());
		kc1.setXf(kc.getXf());
		kcService.save(kc);
		return SUCCESS;
	}
	public String kcInfo() throws Exception {
		List list=kcService.FindAll(pageNow, pageSize);
		Map request=(Map) ActionContext.getContext().get("request");
		Pager page=new Pager(pageNow, kcService.findKcSize());
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}
	public String findKc() throws Exception {
		String kch=kc.getKch();
		Kcb kc=kcService.find(kch);
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("kc", kc);
		return SUCCESS;
	}
	public String deleteKc() throws Exception {
		String kch=kc.getKch();
        kcService.delete(kch);
		return SUCCESS;
	}
	public String updateKcView() throws Exception {
		String kch=kc.getKch();
		Kcb kcInfo=kcService.find(kch);
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("kcInfo", kcInfo);
		return SUCCESS;
	}
	public String updateKc() throws Exception {
		Kcb kc1=kcService.find(kc.getKch());
		kc1.setKcm(kc.getKcm());
		kc1.setKxxq(kc.getKxxq());
		kc1.setXs(kc.getXs());
		kc1.setXf(kc.getXf());
		Map request=(Map) ActionContext.getContext().get("request");
		kcService.update(kc);
		return SUCCESS;
	}
}
