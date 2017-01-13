package chao.action;

import java.util.List;
import java.util.Map;

import chao.model.Cjb;
import chao.model.CjbId;
import chao.model.Kcb;
import chao.model.Xsb;
import chao.service.CjService;
import chao.service.KcService;
import chao.service.XsService;
import chao.serviceimp.CjServiceImp;
import chao.serviceimp.KcServiceImp;
import chao.serviceimp.XsServiceImp;
import chao.tool.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CjAction extends ActionSupport{
    private Cjb cj;
    private int pageNow=1;
	private int pageSize=8; 
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
	public Cjb getCj() {
		return cj;
	}
	public void setCj(Cjb cj) {
		this.cj = cj;
	}
	XsService xsService=new XsServiceImp();
    KcService kcService=new KcServiceImp();
    CjService cjService=new CjServiceImp();
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		List list1=xsService.findAll(1, xsService.findXsSize());
		List list2=kcService.FindAll(1, kcService.findKcSize());
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("list1", list1);
		request.put("list2", list2);
		return SUCCESS;
	}
	public String addCj() throws Exception {
		String xh=cj.getId().getXsb().getXh();
		String kch=cj.getId().getKcb().getKch();
		if(cjService.getXsCj(xh, kch)!=null)
		{
			return ERROR;
		}
		Cjb cj1=new Cjb();
		CjbId cjId=new CjbId();
		cjId.setXsb(cj.getId().getXsb());
		cjId.setKcb(cj.getId().getKcb());
		cj1.setId(cjId);
		cj1.setCj(cj.getCj());
		Kcb kc1=kcService.find(cj.getId().getKcb().getKch());
		if(cj.getCj()>60||cj.getCj()==60)
		{
			cj1.setXf(kc1.getXf());
		}
		else
			cj1.setXf(0);
		cjService.save(cj1);
		return SUCCESS;
	}
	public String xscjInfo() throws Exception {
		List list=cjService.findAllCj(pageNow, pageSize);
		Map request=(Map) ActionContext.getContext().get("request");
		Pager page=new Pager(pageNow, cjService.findCjSize());
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}
	public String findXscj() throws Exception {
		List list=cjService.getXsCjList(cj.getId().getXsb().getXh());
		if(list.size()>0)
		{
			Map request=(Map) ActionContext.getContext().get("request");
			request.put("list", list);
			return SUCCESS;
		}
		else
			return ERROR;
	}
	public String findCj() throws Exception {
		Cjb stucj=cjService.getXsCj(cj.getId().getXsb().getXh(),cj.getId().getKcb().getKch());
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("stucj", stucj);
		return SUCCESS;
	}
	public String deleteCj() throws Exception {
		String xh=cj.getId().getXsb().getXh();
		String kch=cj.getId().getKcb().getKch();
        cjService.deleteCj(xh, kch);
		return SUCCESS;
	}
	public String updateCjView() throws Exception {
		Cjb cjInfo=cjService.getXsCj(cj.getId().getXsb().getXh(),cj.getId().getKcb().getKch());
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("cjInfo", cjInfo);
		return SUCCESS;
	}
	public String updateXscj() throws Exception {
		// TODO Auto-generated method stub
		Cjb cj1=null;
		CjbId cjId1=new CjbId();
		cjId1.setXsb(cj.getId().getXsb());
		cjId1.setKcb(cj.getId().getKcb());
		if(cjService.getXsCj(cj.getId().getXsb().getXh(), cj.getId().getKcb().getKch())==null)
		{
			cj1=new Cjb();
			cj1.setId(cjId1);
		}
		else
		{
			cj1=cjService.getXsCj(cj.getId().getXsb().getXh(), cj.getId().getKcb().getKch());
		}
		Kcb kc1=kcService.find(cj.getId().getKcb().getKch());
		cj1.setCj(cj.getCj());
		if(cj.getCj()>60||cj.getCj()==60)
		{
			cj1.setXf(kc1.getXf());
		}
		else
			cj1.setXf(0);
		Map request=(Map) ActionContext.getContext().get("request");
		cjService.update(cj1);
		return SUCCESS;
	}
	
}
