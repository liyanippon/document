package com.web_interface.fenye;

import java.util.*;

import com.web_dao.fen_dao.FenInterfaceDAO;
import com.web_serializable_bean.OlympicGames.OlympicGamesBean;
import com.web_serializable_bean.fenye_bean.Fenye;
import com.xinxi_Action.struts.form.UpdateForm;
import com.xinxi_Action.struts.form.OlympicgamesproductContentUpdateDeleteForm;
import com.xinxi_Action.struts.form.ProductUpdateDeleteForm;
import com.xinxi_Action.struts.form.ArticleselectForm;
import com.web_serializable_bean.ArticleselectBeen.ArticleSelect;

public class FenyeSelect implements FenyeSelectInterface {
	private FenInterfaceDAO fenyeDAO;

	@SuppressWarnings("unchecked")
	public List<OlympicGamesBean> getNewsVote() {
		List<? super OlympicGamesBean> newsvotelist = new ArrayList<OlympicGamesBean>();
		List obean = fenyeDAO.getNewsVote();
		Iterator it = obean.iterator();
		while (it.hasNext()) {
			Object[] ob = (Object[]) it.next();
			newsvotelist.add(new OlympicGamesBean(ob[0].toString(),
					(Integer) ob[1]));
		}
		return (List<OlympicGamesBean>) newsvotelist;
	}

	@SuppressWarnings("unchecked")
	public List<Fenye> getNewsGuoJiVote() {
		List<? super Fenye> newsvotelist = new ArrayList<Fenye>();
		List fbean = fenyeDAO.getNewsGuoJiVote();
		Iterator it = fbean.iterator();
		while (it.hasNext()) {
			Object[] ob = (Object[]) it.next();
			newsvotelist.add(new Fenye(ob[0].toString(), (Integer) ob[1]));
		}

		return (List<Fenye>) newsvotelist;
	}

	public String sql(ArticleSelect articleSelect) {
		String sql = null;
		if (articleSelect.getUserlist() == "") {
			sql = "select fenye_Id as fenye_Id,fwjilu as fwjilu, zhuti as zhuti, zuozhe as zuozhe,shijian as shijian from "
					+ this.newsMethod(articleSelect
							.getOlympicgameinternational())
					+ " where zhuti like '%"
					+ articleSelect.getZhuti().toString() + "%'";

		} else {
			sql = "select fenye_Id as fenye_Id,fwjilu as fwjilu, zhuti as zhuti, zuozhe as zuozhe,shijian as shijian from "
					+ this.newsMethod(articleSelect
							.getOlympicgameinternational())
					+ " as o where zhuti like '%"
					+ articleSelect.getZhuti().toString()
					+ "%' and zuozhe= '"
					+ articleSelect.getUserlist().toString() + "'";
		}
		return sql;
	}

	public static String newsdoMethod(Integer olympicgameinternational) {
		String table = null;
		switch (olympicgameinternational) {
		case 1:
			table = "selectolympicgames";
			break;
		case 2:
			table = "select";
			break;
		}
		return table;
	}

	public String newsMethod(Integer olympicgameinternational) {
		String table = null;
		switch (olympicgameinternational) {
		case 1:
			table = "OlympicGamesBean";
			break;
		case 2:
			table = "Fenye";
			break;
		}
		return table;
	}

	@SuppressWarnings("unchecked")
	public List blurSelect(ArticleselectForm articleselectForm) {
		ArticleSelect articleSelect = new ArticleSelect();
		articleSelect.setZhuti(articleselectForm.getZhuti().replace(" ", ""));
		articleSelect.setOlympicgameinternational(Integer
				.valueOf(articleselectForm.getOlympicgameinternational()));
		articleSelect.setUserlist(articleselectForm.getUserlist());
		String sql = this.sql(articleSelect);
		List bean = new ArrayList();
		List obean = fenyeDAO.articleSelect(sql);
		Iterator it = obean.iterator();
		if (this.newsMethod(articleSelect.getOlympicgameinternational()) == "Fenye") {
			while (it.hasNext()) {
				Object[] ob = (Object[]) it.next();
				bean.add(new Fenye((Integer) ob[0], (Integer) ob[1], ob[2]
						.toString(), ob[3].toString(),
						(java.sql.Timestamp) ob[4]));
			}

		} else {
			while (it.hasNext()) {
				Object[] ob = (Object[]) it.next();
				bean.add(new OlympicGamesBean((Integer) ob[0], (Integer) ob[1],
						ob[2].toString(), ob[3].toString(),
						(java.sql.Timestamp) ob[4]));
			}
		}
		return bean;
	}

	public void Olympicgames_update(
			OlympicgamesproductContentUpdateDeleteForm olympicgamesproductContentUpdateDeleteForm) {
		try {
			OlympicGamesBean oben = fenyeDAO
					.get(olympicgamesproductContentUpdateDeleteForm
							.getFenye_Id());
			oben.setFwjilu(olympicgamesproductContentUpdateDeleteForm
					.getFwjilu());
			oben
					.setZhuti(olympicgamesproductContentUpdateDeleteForm
							.getZhuti());
			oben.setZuozhe(olympicgamesproductContentUpdateDeleteForm
					.getZuozhe());
			fenyeDAO.Olympicgames_update(oben);
		} catch (Exception ee) {
			ee.printStackTrace();
		}

	}

	/**
	 */
	public void guojinews_update(ProductUpdateDeleteForm productForm) {
		try {
			Fenye fenye = fenyeDAO.get_A(productForm.getFenye_Id());
			fenye.setFwjilu(productForm.getFwjilu());
			fenye.setZhuti(productForm.getZhuti());
			fenye.setZuozhe(productForm.getZuozhe());
			fenyeDAO.guojinews_update(fenye);
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}

	/**
	 */
	public void guojinews_delete(Integer fenye_Id) {
		try {
			fenyeDAO.guojinews_delete(fenye_Id);
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}

	/**
	 * 奥运新闻删除
	 */
	public void Olympicgames_delete(Integer fenye_Id) {
		try {
			fenyeDAO.Olympicgames_delete(fenye_Id);
		} catch (Exception ee) {
			ee.printStackTrace();
		}

	}


	// 查询出分页需要的数据
	public List FindSelectAll(final int firstResult, final int maxResults,
			final String hql) {
		return fenyeDAO.FindSelectAll(firstResult, maxResults, hql);
	}

	public Integer FindSelectCount(final String hql) {
		return fenyeDAO.FindSelectCount(hql);
	}

	// 娱乐新闻查询出分页需要的数据
	public List OlympicgamesFenyeFindSelectAll(final int firstResult,
			final int maxResults, final String hql) {
		return fenyeDAO.OlympicgamesFenyeFindSelectAll(firstResult, maxResults,
				hql);
	}

	// 娱乐新闻查询出分页需要的数据{默认数据库每页显示20条}
	public Integer OlympicgamesFenyeFindSelectCount(final String hql) {
		return fenyeDAO.OlympicgamesFenyeFindSelectCount(hql);
	}

	// 国际新闻主页需要的数据
	public List NewsFindSelectAll(final int firstResult, final int maxResults,
			final String hql) {
		return fenyeDAO.NewsFindSelectAll(firstResult, maxResults, hql);
	}

	// 娱乐新闻主页需要的数据
	public List OlympicgamesFindSelectAll(final int firstResult,
			final int maxResults, final String hql) {
		return fenyeDAO.OlympicgamesFindSelectAll(firstResult, maxResults, hql);
	}

	// 添加娱乐新闻数据
	public void Olympicgamessave(UpdateForm updateForm) {
		OlympicGamesBean oben = new OlympicGamesBean();
		oben.setFwjilu(updateForm.getFwjilu());
		oben.setZhuti(updateForm.getZhuti());
		oben.setZuozhe(updateForm.getZuozhe());
		oben.setNeigong(updateForm.getNeigong());
		fenyeDAO.Olympicgamessave(oben);
	}

	public void save(UpdateForm updateForm) {
		Fenye fenye = new Fenye();
		fenye.setFwjilu(updateForm.getFwjilu());
		fenye.setZhuti(updateForm.getZhuti());
		fenye.setZuozhe(updateForm.getZuozhe());
		fenye.setNeigong(updateForm.getNeigong());
		fenyeDAO.save(fenye);
	}

	public boolean SelectZengJia_JL(final Integer fenye_Id, final Integer fwjilu) {
		return fenyeDAO.SelectZengJia_JL(fenye_Id, fwjilu);
	}

	public List<Fenye> Select(final Integer fenye_Id) {
		return fenyeDAO.Select(fenye_Id);
	}

	// 娱乐新闻列表
	public List<OlympicGamesBean> OlympicgamesSelect(final Integer fenye_Id) {
		return fenyeDAO.OlympicgamesSelect(fenye_Id);
	}

	// 访问记录增加SelectZengJia_JL娱乐
	public boolean OlympicgamesSelectZengJia_JL(final Integer fenye_Id,
			final Integer fwjilu) {
		return fenyeDAO.OlympicgamesSelectZengJia_JL(fenye_Id, fwjilu);
	}

	public FenInterfaceDAO getFenyeDAO() {
		return fenyeDAO;
	}

	public void setFenyeDAO(FenInterfaceDAO fenyeDAO) {
		this.fenyeDAO = fenyeDAO;
	}

}
