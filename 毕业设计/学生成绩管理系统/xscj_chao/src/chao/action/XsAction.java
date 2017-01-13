package chao.action;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Hibernate;

import chao.model.Xsb;
import chao.service.XsService;
import chao.service.ZyService;
import chao.serviceimp.XsServiceImp;
import chao.serviceimp.ZyServiceImp;
import chao.tool.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

public class XsAction extends ActionSupport {
	private int pageNow = 1;
	private int pageSize = 8;
	private List list;
	private Xsb xs;
	private File zp;
	private String zpFileName;
	XsService xsService = new XsServiceImp();
	ZyService zyService = new ZyServiceImp();

	public List getList() {
		return zyService.getAll();
	}

	public void setList(List list) {
		this.list = list;
	}

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

	public Xsb getXs() {
		return xs;
	}

	public void setXs(Xsb xs) {
		this.xs = xs;
	}

	public File getZp() {
		return zp;
	}

	public void setZp(File zp) {
		this.zp = zp;
	}

	public String getZpFileName() {
		return zpFileName;
	}

	public void setZpFileName(String zpFileName) {
		this.zpFileName = zpFileName;
	}

	public String execute() throws Exception {
		List list = xsService.findAll(pageNow, pageSize);
		Map request = (Map) ActionContext.getContext().get("request");
		Pager page = new Pager(pageNow, xsService.findXsSize());
		request.put("list", list);
		request.put("page", page);
		return SUCCESS;
	}

	public String addXsView() throws Exception {
		List zys = zyService.getAll();
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("zys", zys);
		return SUCCESS;
	}

	public String addXs() throws Exception {
		Xsb stu = new Xsb();
		String xh = xs.getXh();
		if (xsService.find(xh) != null) {
			return ERROR;
		}
		stu.setXh(xs.getXh());
		stu.setXm(xs.getXm());
		stu.setXb(xs.getXb());
		stu.setCssj(xs.getCssj());
		stu.setZyb(zyService.getOneZy(xs.getZyb().getId()));
		stu.setZxf(xs.getZxf());
		stu.setBz(xs.getBz());
		if (this.getZp() != null) {
			FileInputStream in=new FileInputStream(this.getZp());
			byte buffer[]=new byte[(int)zp.length()]; 
			in.read(buffer); 
            stu.setZp(buffer);
		}
		xsService.save(stu);
		return SUCCESS;
	}
	
	public String getImage() throws Exception{
	    HttpServletResponse response=ServletActionContext.getResponse();
	    response.setContentType("image/jpeg");
	    String xh=xs.getXh();
	    Xsb stu3=xsService.find(xh);
	    byte[] img=stu3.getZp();
	    ServletOutputStream os=response.getOutputStream();
	    try{
	    	if(img!=null&&img.length!=0)
		    {
		        for(int i=0;i<img.length;i++)
		        {
		           os.write(img);
		        }
		        os.flush();
		    }
	    }
	    catch(Exception e)
	    {
	    }
	    return NONE;
	}
		
	public String findXs() throws Exception {
		String xh = xs.getXh();
		Xsb stu2 = xsService.find(xh);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("xs", stu2);
		return SUCCESS;
	}

	public String deleteXs() throws Exception {

		String xh = xs.getXh();
		xsService.delete(xh);
		return SUCCESS;
	}

	public String updateXsView() throws Exception {
		String xh = xs.getXh();
		Xsb xsInfo = xsService.find(xh);
		List zys = zyService.getAll();
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("xsInfo", xsInfo);
		request.put("zys", zys);
		return SUCCESS;
	}

	public String updateXs() throws Exception {
		Xsb xs1 = xsService.find(xs.getXh());
		xs1.setXm(xs.getXm());
		xs1.setXb(xs.getXb());
		xs1.setZyb(zyService.getOneZy(xs.getZyb().getId()));
		xs1.setCssj(xs.getCssj());
		xs1.setZxf(xs.getZxf());
		xs1.setBz(xs.getBz());
		if (this.getZp() != null) {
			FileInputStream in=new FileInputStream(this.getZp());
			byte buffer[]=new byte[(int)zp.length()]; 
			in.read(buffer); 
            xs1.setZp(buffer);
		}
		Map request = (Map) ActionContext.getContext().get("request");
		xsService.update(xs1);
		return SUCCESS;
	}
}
