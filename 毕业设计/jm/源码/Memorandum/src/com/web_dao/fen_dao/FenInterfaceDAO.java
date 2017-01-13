package com.web_dao.fen_dao;

import java.util.List;

import com.web_serializable_bean.OlympicGames.OlympicGamesBean;
import com.web_serializable_bean.fenye_bean.Fenye;


/**
 * 2008/6/08 whp V_1.00
 * 2008/9/08 李永杰 V_1.01
 * 2008/9/08 李鑫 V_1.02
 * 2008/9/08 段萌萌 V_1.03
 */
public interface FenInterfaceDAO {


	///////////////////////////////段萌萌 V_1.03////////////////////////
	//查看奥运文章统计
	List getNewsVote();
	
	//查看国际文章统计
	List getNewsGuoJiVote();
	///////////////////////////////段萌萌 V_1.03////////////////////////

	//文章查询////////////////李鑫 V_1.02////////////////////////
	
	//文章查询
	List articleSelect(String sql);
	//文章查询////////////////李鑫 V_1.02////////////////////////
	// 查询出分页需要的数据
	List FindSelectAll(final int firstResult, final int maxResults,
			final String hql);

	Integer FindSelectCount(final String hql);
	
	// 娱乐新闻查询出分页需要的数据
	List OlympicgamesFenyeFindSelectAll(final int firstResult, final int maxResults,
			final String hql);

	// 娱乐新闻查询出分页需要的数据{默认数据库每页显示20条}
	Integer OlympicgamesFenyeFindSelectCount(final String hql);
	
	//添加娱乐新闻数据
	void Olympicgamessave(OlympicGamesBean oben);

	void save(Fenye fenye);

	List<Fenye> Select(final Integer fenye_Id);

	public boolean SelectZengJia_JL(final Integer fenye_Id, final Integer fwjilu);
	
	// 国际新闻主页需要的数据
	List NewsFindSelectAll(final int firstResult, final int maxResults,
			final String hql);
	
	//娱乐新闻主页需要的数据
	List OlympicgamesFindSelectAll(final int firstResult, final int maxResults,
			final String hql);
	
	//娱乐新闻列表
	List<OlympicGamesBean> OlympicgamesSelect(final Integer fenye_Id);
	
//	访问记录增加SelectZengJia_JL娱乐
	public boolean OlympicgamesSelectZengJia_JL(final Integer fenye_Id, final Integer fwjilu);
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>李永杰 V_1.01>>>start>>>>>>>>>>>>>>>>>>>>>
	/**
	 * 修改奥运新闻数据
	 * */ 
	void Olympicgames_update(OlympicGamesBean oben);
	/**
	 * 修改国际新闻数据
	 * */ 
	void guojinews_update(Fenye fenye);
	/**
	 * 删除奥运数据
	 * */ 
	void Olympicgames_delete(int fenye_Id);
	/**
	 * 删除国际新闻数据
	 * */ 
	void guojinews_delete(int fenye_Id);
	
	/**
	 * 获取国际新闻数据的编号
	 * */ 
	Fenye get_A(Integer fenye_Id);
	/**
	 * 获取奥运新闻数据的编号
	 * */ 
	OlympicGamesBean get(Integer fenye_Id);
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>李永杰 V_1.01>>>end>>>>>>>>>>>>>>>>>>>>>
	


}
