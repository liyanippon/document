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
	 * �޸Ĺ�����������
	 */
	public static boolean ProductUpdate(
			ProductUpdateDeleteForm productUpdateDeleteForm) {
		if(Dao.ProductUpdate(productUpdateDeleteForm)){
			return true;
		}
		return false;
	}
	
	/*
	 * �޸İ�����������
	 */
	public static boolean OlympicgamesUpdate(
			OlympicgamesproductContentUpdateDeleteForm olympicgamesproductContentUpdateDeleteForm) {
		if(Dao.OlympicgamesUpdate(olympicgamesproductContentUpdateDeleteForm)){
			return true;
		}
		return false;
	}

	/*
	 * ɾ��������������
	 */
	public static boolean ProductDelete(
			ProductUpdateDeleteForm productUpdateDeleteForm) {
		if(Dao.ProductDelete(productUpdateDeleteForm)){
			return true;
		}
		return false;
	}
	
	/*
	 * ɾ��������������
	 */
	public static boolean OlympicgamesDelete(
			OlympicgamesproductContentUpdateDeleteForm olympicgamesproductContentUpdateDeleteForm) {
		if(Dao.OlympicgamesDelete(olympicgamesproductContentUpdateDeleteForm)){
			return true;
		}
		return false;
	}

}
