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
 * 2008/9/08 ������ V_1.01
 * 2008/9/08 ���� V_1.02
 * 2008/9/08 ������ V_1.03
 */
public interface FenyeSelectInterface {
	////////////////������ V_1.03////////////////////////
	//�鿴��������ͳ��
	public List getNewsVote();
	
//	�鿴��������ͳ��
	public List getNewsGuoJiVote();
	////////////////������ V_1.03////////////////////////
	////////////////���� V_1.02////////////////////////
	//���²�ѯҵ��
	List blurSelect(ArticleselectForm articleselectForm);
	////////////////���� V_1.02////////////////////////
	// �������Ų�ѯ����ҳ��Ҫ������
	List FindSelectAll(final int firstResult, final int maxResults,
			final String hql);

	// �������Ų�ѯ����ҳ��Ҫ������{Ĭ�����ݿ�ÿҳ��ʾ20��}
	Integer FindSelectCount(final String hql);
	
	// �������Ų�ѯ����ҳ��Ҫ������
	List OlympicgamesFenyeFindSelectAll(final int firstResult, final int maxResults,
			final String hql);

	// �������Ų�ѯ����ҳ��Ҫ������{Ĭ�����ݿ�ÿҳ��ʾ20��}
	Integer OlympicgamesFenyeFindSelectCount(final String hql);
	///////////////////////////////////////////////////////////////////////////////////
	
	//����������ҳ��Ҫ������
	List NewsFindSelectAll(final int firstResult, final int maxResults,
			final String hql);
	
	//����������ҳ��Ҫ������
	List OlympicgamesFindSelectAll(final int firstResult, final int maxResults,
			final String hql);
	
	//���������������
	void Olympicgamessave(UpdateForm updateForm);
	
	//��ӹ���������������
	void save(UpdateForm updateForm);
	
	//	���������б�
	List<Fenye> Select(final Integer fenye_Id);

	//���ʼ�¼����SelectZengJia_JL����
	public boolean SelectZengJia_JL(final Integer fenye_Id, final Integer fwjilu);
	
	//���������б�
	List<OlympicGamesBean> OlympicgamesSelect(final Integer fenye_Id);
	
//	���ʼ�¼����SelectZengJia_JL����
	public boolean OlympicgamesSelectZengJia_JL(final Integer fenye_Id, final Integer fwjilu);
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>������ V_1.01>>>start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	/**
	 * ���������޸�
	 * */
	void guojinews_update(ProductUpdateDeleteForm productForm );
	/**
	 * ���������޸�
	 * */
	void Olympicgames_update(OlympicgamesproductContentUpdateDeleteForm olympicgamesproductContentUpdateDeleteForm);
	
	/**
	 * ɾ����������
	 * */
	void guojinews_delete(Integer fenye_Id);
	/**
	 * ɾ����������
	 * */
    void Olympicgames_delete(Integer fenye_Id);
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>������ V_1.01>>>end>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
}
