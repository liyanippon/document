package com.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TGonggaoDAO;
import com.model.TAdmin;
import com.model.TGonggao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class gonggaoAction extends ActionSupport
{
	private int gonggaoId;
	private String gonggaoTitle;
	private String gonggaoContent;
	private String gonggaoData;
	private String gonggaoFabuzhe;
	
	private String message;
	private String path;
	
	private TGonggaoDAO gonggaoDAO;
	
	
	//公告信息录入
	public String gonggaoAdd()
	{
		TGonggao gonggao=new TGonggao();
		gonggao.setGonggaoTitle(gonggaoTitle);
		gonggao.setGonggaoContent(gonggaoContent);
		gonggao.setGonggaoData(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
		gonggaoDAO.save(gonggao);
		this.setMessage("公告添加完毕");
		this.setPath("gonggaoMana.action");
		return "succeed";
	}
	
    //公告信息管理
	public String gonggaoMana()
	{
		List gonggaoList =gonggaoDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("gonggaoList", gonggaoList);
		return ActionSupport.SUCCESS;
	}
	
	
	//公告信息删除
	public String gonggaoDel()
	{
		TGonggao gonggao=gonggaoDAO.findById(gonggaoId);
		gonggaoDAO.delete(gonggao);
		this.setMessage("公告删除完毕");
		this.setPath("gonggaoMana.action");
		return "succeed";
	}
	
	
	
	//公告详细信息
	public String gonggaoDetail()
	{
		TGonggao gonggao=gonggaoDAO.findById(gonggaoId);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("gonggao", gonggao);
		return ActionSupport.SUCCESS;
	}
	
	
	
	//所有公告信息
	public String gonggaoAll()
	{
        Map request=(Map)ServletActionContext.getContext().get("request");
		
		List gonggaoList=gonggaoDAO.findAll();
		request.put("gonggaoList", gonggaoList);
		return ActionSupport.SUCCESS;
	}
	
	
	
	//网站显示公告详细信息
	public String gonggaoDetailQian()
	{
		TGonggao gonggao=gonggaoDAO.findById(gonggaoId);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("gonggao", gonggao);
		
		return ActionSupport.SUCCESS;
	}

	
	public String getGonggaoContent()
	{
		return gonggaoContent;
	}

	public void setGonggaoContent(String gonggaoContent)
	{
		this.gonggaoContent = gonggaoContent;
	}

	public TGonggaoDAO getGonggaoDAO()
	{
		return gonggaoDAO;
	}

	public void setGonggaoDAO(TGonggaoDAO gonggaoDAO)
	{
		this.gonggaoDAO = gonggaoDAO;
	}

	public String getGonggaoData()
	{
		return gonggaoData;
	}

	public void setGonggaoData(String gonggaoData)
	{
		this.gonggaoData = gonggaoData;
	}

	public String getGonggaoFabuzhe()
	{
		return gonggaoFabuzhe;
	}

	public void setGonggaoFabuzhe(String gonggaoFabuzhe)
	{
		this.gonggaoFabuzhe = gonggaoFabuzhe;
	}

	public int getGonggaoId()
	{
		return gonggaoId;
	}

	public void setGonggaoId(int gonggaoId)
	{
		this.gonggaoId = gonggaoId;
	}

	public String getGonggaoTitle()
	{
		return gonggaoTitle;
	}

	public void setGonggaoTitle(String gonggaoTitle)
	{
		this.gonggaoTitle = gonggaoTitle;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}
	
}
