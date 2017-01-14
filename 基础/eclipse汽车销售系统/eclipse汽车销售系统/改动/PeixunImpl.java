package com.bmw.sale.business;

import java.util.List;
import com.bmw.sale.dao.BaseDao;

public class PeixunImpl <T>{
	
private BaseDao dao;
	
	public List<T> listPeixun(Class<T> clazz) throws Exception{		
		return dao.getAllObjects(clazz);	
	}
	
	public void addPeixun(T peixun) throws Exception{
		dao.addObject(peixun);
	}
	
	
	public void deletePeixun(int peixunid,Class<T> clazz) throws Exception{
		T u = dao.getObject(clazz, peixunid);
		dao.deleteObject(u);
	}
	
	public void modifyPeixun(T peixun) throws Exception{
		dao.updateObject(peixun);
	}
	
	public T getPeixun(Class<T> clazz, int peixunid) throws Exception{
		return dao.getObject(clazz, peixunid);
	}
	
	//暂时看不懂
	public List<T> getSell(int peixunid) throws Exception{
		if(peixunid==0){
			return null;
		}
		String queryString = "select peixunid FROM Peixun WHERE peixunid ='"+peixunid+"'";//不知对错
		List<T> sell=dao.getObjects(queryString);
		return sell;
	}
	
	//查询功能，后做
	/*public List<T> getPeixun(int peixunid) throws Exception{
		if(peixunid==0){
			return null;
		}
		//String queryString = "FROM Peixun as c WHERE c.sell.engineid ='"+id+"'";///
		String queryString = "FROM Peixun as c WHERE c.sell.engineid ='"+peixunid+"'";
		List<T> sell=dao.getObjects(queryString);
		return sell;
	}*/
		
	public BaseDao getDao() {
		return dao;
	}

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

}
