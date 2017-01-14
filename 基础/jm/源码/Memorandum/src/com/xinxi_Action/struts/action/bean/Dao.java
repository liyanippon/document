/**
 *在这里调用用了NewsBean.java;
 */
package com.xinxi_Action.struts.action.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.sql.SQLException;

import com.xinxi_Action.struts.form.OlympicgamesproductContentUpdateDeleteForm;
import com.xinxi_Action.struts.form.ProductUpdateDeleteForm;

public class Dao {

	/*
	 * 修改国际新闻数据 `FENYE_ID`, `FWJILU`, `ZHUTI`, `ZUOZHE`,
	 */
	public static boolean ProductUpdate(
			ProductUpdateDeleteForm productUpdateDeleteForm) {
		MysqlDb db = new MysqlDb();
		String sql = "UPDATE wenzhang set FWJILU='"
				+ productUpdateDeleteForm.getFwjilu() + "',ZHUTI='"
				+ productUpdateDeleteForm.getZhuti() + "',ZUOZHE='"
				+ productUpdateDeleteForm.getZuozhe() + "' where FENYE_ID='"
				+ productUpdateDeleteForm.getFenye_Id() + "'";
		System.out.println(sql);
		int jieguo = db.ExcecuteUpdate(sql);
		if (jieguo == 1) {
			return true;
		}
		return false;
	}
	
	/*
	 * 修改奥运新闻数据 `FENYE_ID`, `FWJILU`, `ZHUTI`, `ZUOZHE`,
	 */
	public static boolean OlympicgamesUpdate(
			OlympicgamesproductContentUpdateDeleteForm olympicgamesproductContentUpdateDeleteForm) {
		MysqlDb db = new MysqlDb();
		String sql = "UPDATE t_worknote set FWJILU='"
				+ olympicgamesproductContentUpdateDeleteForm.getFwjilu() + "',ZHUTI='"
				+ olympicgamesproductContentUpdateDeleteForm.getZhuti() + "',ZUOZHE='"
				+ olympicgamesproductContentUpdateDeleteForm.getZuozhe() + "' where FENYE_ID='"
				+ olympicgamesproductContentUpdateDeleteForm.getFenye_Id() + "'";
		System.out.println(sql);
		int jieguo = db.ExcecuteUpdate(sql);
		if (jieguo == 1) {
			return true;
		}
		return false;
	}


	/*
	 * 删除国际新闻数据
	 */
	public static boolean ProductDelete(
			ProductUpdateDeleteForm productUpdateDeleteForm) {
		MysqlDb db = new MysqlDb();
		String sql = "delete  from wenzhang where FENYE_ID='"
				+ productUpdateDeleteForm.getFenye_Id() + "'";
		int jieguo = db.ExcecuteUpdate(sql);
		if (jieguo == 1) {
			return true;
		}
		return false;
	}

	/*
	 * 删除奥运新闻数据
	 */
	public static boolean OlympicgamesDelete(
			OlympicgamesproductContentUpdateDeleteForm olympicgamesproductContentUpdateDeleteForm) {
		MysqlDb db = new MysqlDb();
		String sql = "delete  from t_worknote where FENYE_ID='"
				+ olympicgamesproductContentUpdateDeleteForm.getFenye_Id() + "'";
		int jieguo = db.ExcecuteUpdate(sql);
		if (jieguo == 1) {
			return true;
		}
		return false;
	}

}
