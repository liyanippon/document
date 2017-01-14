package com.xinxi_Action.struts.action.bean;

import java.sql.SQLException;

import com.xinxi_Action.struts.action.bean.Dao;
import com.xinxi_Action.struts.action.bean.MysqlDb;
import com.xinxi_Action.struts.form.OlympicgamesproductContentUpdateDeleteForm;
import com.xinxi_Action.struts.form.ProductUpdateDeleteForm;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Modle {

	public Modle() {
	}
	
	/*
	 * 修改国际新闻数据
	 */
	public static boolean ProductUpdate(
			ProductUpdateDeleteForm productUpdateDeleteForm) {
		if(Dao.ProductUpdate(productUpdateDeleteForm)){
			return true;
		}
		return false;
	}
	
	/*
	 * 修改奥运新闻数据
	 */
	public static boolean OlympicgamesUpdate(
			OlympicgamesproductContentUpdateDeleteForm olympicgamesproductContentUpdateDeleteForm) {
		if(Dao.OlympicgamesUpdate(olympicgamesproductContentUpdateDeleteForm)){
			return true;
		}
		return false;
	}

	/*
	 * 删除国际新闻数据
	 */
	public static boolean ProductDelete(
			ProductUpdateDeleteForm productUpdateDeleteForm) {
		if(Dao.ProductDelete(productUpdateDeleteForm)){
			return true;
		}
		return false;
	}
	
	/*
	 * 删除奥运新闻数据
	 */
	public static boolean OlympicgamesDelete(
			OlympicgamesproductContentUpdateDeleteForm olympicgamesproductContentUpdateDeleteForm) {
		if(Dao.OlympicgamesDelete(olympicgamesproductContentUpdateDeleteForm)){
			return true;
		}
		return false;
	}

}
