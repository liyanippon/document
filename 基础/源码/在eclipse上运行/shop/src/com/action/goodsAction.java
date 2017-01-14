package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TCatelogDAO;
import com.dao.TGoodsDAO;
import com.model.TGoods;
import com.opensymphony.xwork2.ActionSupport;

public class goodsAction extends ActionSupport
{
	private int goodsId;
	private int goodsCatelogId;
	private String goodsName;
	private String goodsMiaoshu;
	private String fujian;
	private String goodsISBN;
	private int goodsShichangjia;
	private int goodsTejia;
	
	private int catelogId;
	private int goodsKucun;
	
	private String message;
	private String path;
	
	private TGoodsDAO goodsDAO;
	private TCatelogDAO catelogDAO;
	
	private int rukushuliang;
	
	
	
	
	//���������Ʒ��Ϣ
	public String goodsAdd()
	{
		TGoods goods=new TGoods();
		goods.setGoodsCatelogId(goodsCatelogId);
		goods.setGoodsName(goodsName);
		goods.setGoodsISBN(goodsISBN);
		goods.setGoodsMiaoshu(goodsMiaoshu);
		goods.setGoodsPic(fujian);
		goods.setGoodsShichangjia(goodsShichangjia);
		goods.setGoodsTejia(goodsShichangjia);
		goods.setGoodsIsnottejia("no");
		goods.setGoodsIsnottuijian("no");
		
		goods.setGoodsKucun(goodsKucun);
		goods.setGoodsDel("no");
		
		goodsDAO.save(goods);
		this.setMessage("�����ɹ�");
		this.setPath("goodsMana.action");
		return "succeed";
		
	}
	
	
	
	
	//ɾ��������Ʒ��Ϣ
	public String goodsDel()
	{
		TGoods goods=goodsDAO.findById(goodsId);
		goods.setGoodsDel("yes");
		goodsDAO.attachDirty(goods);
		this.setMessage("�����ɹ�");
		this.setPath("goodsMana.action");
		return "succeed";
	}
	
	
	
	//������Ʒ����
	public String goodsMana()
	{
		String sql="from TGoods where goodsDel='no' order by goodsIsnottejia";
		List goodsList=goodsDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("goodsList", goodsList);
		return ActionSupport.SUCCESS;
	}
	
	
	
	//�����ؼ�������Ʒ
	public String goodsShezhiTejia()
	{
		TGoods goods=goodsDAO.findById(goodsId);
		goods.setGoodsIsnottejia("yes");
		goods.setGoodsTejia(goodsTejia);
		goodsDAO.attachDirty(goods);
		
        Map request=(Map)ServletActionContext.getContext().get("request");
		
		request.put("msg", "�����ؼ����");
		return "msg";
	}
	
	
	
	//������Ʒ��ϸ��Ϣ
	public String goodsDetailHou()
	{
		Map request=(Map)ServletActionContext.getContext().get("request");
		
		TGoods goods=goodsDAO.findById(goodsId);
		request.put("goods", goods);
		return ActionSupport.SUCCESS;
	}
	
	
	//��Ա�鿴������Ʒ��ϸ��Ϣ
	public String goodsDetailQian()
	{
		Map request=(Map)ServletActionContext.getContext().get("request");
		
		TGoods goods=goodsDAO.findById(goodsId);
		request.put("goods", goods);
		return ActionSupport.SUCCESS;
	}
	
	
	
	//��Ա�鿴����������Ʒ
	public String goodsAll()
	{
        Map request=(Map)ServletActionContext.getContext().get("request");
		
		
		String sql="from TGoods where goodsDel='no' order by goodsCatelogId";
		List goodsList=goodsDAO.getHibernateTemplate().find(sql);
		request.put("goodsList", goodsList);
		return ActionSupport.SUCCESS;
	}
	
	
	
	
	//�������鿴������Ʒ��Ϣ
	public String goodsByCatelog()
	{
        Map request=(Map)ServletActionContext.getContext().get("request");
		
		String sql="from TGoods where goodsDel='no' and goodsCatelogId=?";
		Object[] con={catelogId};
		List goodsList=goodsDAO.getHibernateTemplate().find(sql,con);
		request.put("goodsList", goodsList);
		
		return ActionSupport.SUCCESS;
	}
	
	
	
	//��Ա����ؼ�������Ʒ
	public String goods_tejia()
	{
        Map request=(Map)ServletActionContext.getContext().get("request");
		
		
		String sql="from TGoods where goodsDel='no' and goodsIsnottejia='yes'";
		List goodsList=goodsDAO.getHibernateTemplate().find(sql);
		request.put("goodsList", goodsList);
		return ActionSupport.SUCCESS;
	}
	
	
	
	
	//������Ʒ��ѯ
	public String goodsSearch()
	{
        Map request=(Map)ServletActionContext.getContext().get("request");
		
		String sql="from TGoods where goodsDel='no' and goodsName like '%"+goodsName.trim()+"%'";
		
		List goodsList=goodsDAO.getHibernateTemplate().find(sql);
		request.put("goodsList", goodsList);
		
		return ActionSupport.SUCCESS;
	}
	
	
	
	
	public int getCatelogId()
	{
		return catelogId;
	}

	public void setCatelogId(int catelogId)
	{
		this.catelogId = catelogId;
	}

	public int getGoodsCatelogId()
	{
		return goodsCatelogId;
	}
	public void setGoodsCatelogId(int goodsCatelogId)
	{
		this.goodsCatelogId = goodsCatelogId;
	}
	public TGoodsDAO getGoodsDAO()
	{
		return goodsDAO;
	}
	public void setGoodsDAO(TGoodsDAO goodsDAO)
	{
		this.goodsDAO = goodsDAO;
	}
	
	public int getRukushuliang()
	{
		return rukushuliang;
	}

	public void setRukushuliang(int rukushuliang)
	{
		this.rukushuliang = rukushuliang;
	}

	public int getGoodsId()
	{
		return goodsId;
	}
	public void setGoodsId(int goodsId)
	{
		this.goodsId = goodsId;
	}
	public String getGoodsMiaoshu()
	{
		return goodsMiaoshu;
	}
	public void setGoodsMiaoshu(String goodsMiaoshu)
	{
		this.goodsMiaoshu = goodsMiaoshu;
	}
	public String getGoodsName()
	{
		return goodsName;
	}
	
	public String getFujian()
	{
		return fujian;
	}

	public int getGoodsKucun()
	{
		return goodsKucun;
	}

	public void setGoodsKucun(int goodsKucun)
	{
		this.goodsKucun = goodsKucun;
	}

	public void setFujian(String fujian)
	{
		this.fujian = fujian;
	}

	public void setGoodsName(String goodsName)
	{
		this.goodsName = goodsName;
	}
	
	public TCatelogDAO getCatelogDAO()
	{
		return catelogDAO;
	}

	public void setCatelogDAO(TCatelogDAO catelogDAO)
	{
		this.catelogDAO = catelogDAO;
	}

	public int getGoodsShichangjia()
	{
		return goodsShichangjia;
	}
	public void setGoodsShichangjia(int goodsShichangjia)
	{
		this.goodsShichangjia = goodsShichangjia;
	}
	public int getGoodsTejia()
	{
		return goodsTejia;
	}
	public void setGoodsTejia(int goodsTejia)
	{
		this.goodsTejia = goodsTejia;
	}
	
	public String getGoodsISBN()
	{
		return goodsISBN;
	}

	public void setGoodsISBN(String goodsISBN)
	{
		this.goodsISBN = goodsISBN;
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
