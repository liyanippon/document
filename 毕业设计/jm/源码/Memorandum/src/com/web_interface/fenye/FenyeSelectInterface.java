package com.web_interface.fenye;

import java.util.List;

//import com.xinxi_Action.struts.form.LoginForm;
import com.xinxi_Action.struts.form.OlympicgamesproductContentUpdateDeleteForm;
import com.xinxi_Action.struts.form.ProductUpdateDeleteForm;
import com.xinxi_Action.struts.form.UpdateForm;
import com.web_serializable_bean.fenye_bean.Fenye;
import com.web_serializable_bean.OlympicGames.OlympicGamesBean;
import com.xinxi_Action.struts.form.ArticleselectForm;
/**
 * 2008/6/08 whp V_1.00
 * 2008/9/08 李永杰 V_1.01
 * 2008/9/08 李鑫 V_1.02
 * 2008/9/08 段萌萌 V_1.03
 */
public interface FenyeSelectInterface {
	////////////////段萌萌 V_1.03////////////////////////
	//查看奥运文章统计
	public List getNewsVote();
	
//	查看国际文章统计
	public List getNewsGuoJiVote();
	////////////////段萌萌 V_1.03////////////////////////
	////////////////李鑫 V_1.02////////////////////////
	//文章查询业务
	List blurSelect(ArticleselectForm articleselectForm);
	////////////////李鑫 V_1.02////////////////////////
	// 国际新闻查询出分页需要的数据
	List FindSelectAll(final int firstResult, final int maxResults,
			final String hql);

	// 国际新闻查询出分页需要的数据{默认数据库每页显示20条}
	Integer FindSelectCount(final String hql);
	
	// 娱乐新闻查询出分页需要的数据
	List OlympicgamesFenyeFindSelectAll(final int firstResult, final int maxResults,
			final String hql);

	// 娱乐新闻查询出分页需要的数据{默认数据库每页显示20条}
	Integer OlympicgamesFenyeFindSelectCount(final String hql);
	///////////////////////////////////////////////////////////////////////////////////
	
	//国际新闻主页需要的数据
	List NewsFindSelectAll(final int firstResult, final int maxResults,
			final String hql);
	
	//娱乐新闻主页需要的数据
	List OlympicgamesFindSelectAll(final int firstResult, final int maxResults,
			final String hql);
	
	//添加娱乐新闻数据
	void Olympicgamessave(UpdateForm updateForm);
	
	//添加国际娱乐新闻数据
	void save(UpdateForm updateForm);
	
	//	国际新闻列表
	List<Fenye> Select(final Integer fenye_Id);

	//访问记录增加SelectZengJia_JL国际
	public boolean SelectZengJia_JL(final Integer fenye_Id, final Integer fwjilu);
	
	//娱乐新闻列表
	List<OlympicGamesBean> OlympicgamesSelect(final Integer fenye_Id);
	
//	访问记录增加SelectZengJia_JL娱乐
	public boolean OlympicgamesSelectZengJia_JL(final Integer fenye_Id, final Integer fwjilu);
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>李永杰 V_1.01>>>start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	/**
	 * 国际新闻修改
	 * */
	void guojinews_update(ProductUpdateDeleteForm productForm );
	/**
	 * 奥运新闻修改
	 * */
	void Olympicgames_update(OlympicgamesproductContentUpdateDeleteForm olympicgamesproductContentUpdateDeleteForm);
	
	/**
	 * 删除国际新闻
	 * */
	void guojinews_delete(Integer fenye_Id);
	/**
	 * 删除奥运新闻
	 * */
    void Olympicgames_delete(Integer fenye_Id);
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>李永杰 V_1.01>>>end>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
}
