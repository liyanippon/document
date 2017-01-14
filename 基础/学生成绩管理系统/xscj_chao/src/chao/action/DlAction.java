package chao.action;

import java.util.Map;

import chao.model.Dlb;
import chao.service.DlService;
import chao.serviceimp.DlServiceImp;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DlAction extends ActionSupport {

	private Dlb dl;
	public Dlb getDl() {
		return dl;
	}
	public void setDl(Dlb dl) {
		this.dl = dl;
	}
	public String execute() throws Exception {
		DlService dlService=new DlServiceImp();
		Dlb user=dlService.find(dl.getXh(), dl.getKl());
		if(user!=null)
		{
			Map session=(Map) ActionContext.getContext().get("session");
			session.put("user", dl.getXh());
			return SUCCESS;
		}
		else
			return ERROR;
	}   
}
