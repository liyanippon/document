package com.web_dao.fen_dao;

import java.util.List;

import com.web_serializable_bean.OlympicGames.OlympicGamesBean;
import com.web_serializable_bean.fenye_bean.Fenye;


/**
 * 2008/6/08 whp V_1.00
 * 2008/9/08 ������ V_1.01
 * 2008/9/08 ���� V_1.02
 * 2008/9/08 ������ V_1.03
 */
public interface FenInterfaceDAO {


	///////////////////////////////������ V_1.03////////////////////////
	//�鿴��������ͳ��
	List getNewsVote();
	
	//�鿴��������ͳ��
	List getNewsGuoJiVote();
	///////////////////////////////������ V_1.03////////////////////////

	//���²�ѯ////////////////���� V_1.02////////////////////////
	
	//���²�ѯ
	List articleSelect(String sql);
	//���²�ѯ////////////////���� V_1.02////////////////////////
	// ��ѯ����ҳ��Ҫ������
	List FindSelectAll(final int firstResult, final int maxResults,
			final String hql);

	Integer FindSelectCount(final String hql);
	
	// �������Ų�ѯ����ҳ��Ҫ������
	List OlympicgamesFenyeFindSelectAll(final int firstResult, final int maxResults,
			final String hql);

	// �������Ų�ѯ����ҳ��Ҫ������{Ĭ�����ݿ�ÿҳ��ʾ20��}
	Integer OlympicgamesFenyeFindSelectCount(final String hql);
	
	//���������������
	void Olympicgamessave(OlympicGamesBean oben);

	void save(Fenye fenye);

	List<Fenye> Select(final Integer fenye_Id);

	public boolean SelectZengJia_JL(final Integer fenye_Id, final Integer fwjilu);
	
	// ����������ҳ��Ҫ������
	List NewsFindSelectAll(final int firstResult, final int maxResults,
			final String hql);
	
	//����������ҳ��Ҫ������
	List OlympicgamesFindSelectAll(final int firstResult, final int maxResults,
			final String hql);
	
	//���������б�
	List<OlympicGamesBean> OlympicgamesSelect(final Integer fenye_Id);
	
//	���ʼ�¼����SelectZengJia_JL����
	public boolean OlympicgamesSelectZengJia_JL(final Integer fenye_Id, final Integer fwjilu);
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>������ V_1.01>>>start>>>>>>>>>>>>>>>>>>>>>
	/**
	 * �޸İ�����������
	 * */ 
	void Olympicgames_update(OlympicGamesBean oben);
	/**
	 * �޸Ĺ�����������
	 * */ 
	void guojinews_update(Fenye fenye);
	/**
	 * ɾ����������
	 * */ 
	void Olympicgames_delete(int fenye_Id);
	/**
	 * ɾ��������������
	 * */ 
	void guojinews_delete(int fenye_Id);
	
	/**
	 * ��ȡ�����������ݵı��
	 * */ 
	Fenye get_A(Integer fenye_Id);
	/**
	 * ��ȡ�����������ݵı��
	 * */ 
	OlympicGamesBean get(Integer fenye_Id);
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>������ V_1.01>>>end>>>>>>>>>>>>>>>>>>>>>
	


}
