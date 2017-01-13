package com.web_dao.fen_dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.web_serializable_bean.fenye_bean.Fenye;
import com.web_serializable_bean.OlympicGames.OlympicGamesBean;

/**
 * 2008/6/08 whp    V_1.00 
 * 2008/9/08 ������  V_1.01 
 * 2008/9/08 ����    V_1.02
 * 2008/9/08 ������  V_1.03
 */
public class Fen_DAO<T> extends HibernateDaoSupport implements FenInterfaceDAO {

	private T foo;

	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}

	// /////////////////////////////������ V_1.03////////////////////////
	/**
	 * �鿴��������ͳ��
	 */
	@SuppressWarnings("unchecked")
	public List getNewsVote() {
		// log.debug("---LoginDAO userSelectDao---");
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException, SQLException {
				String hql = "select zuozhe,count(zhuti) as count from OlympicGamesBean group by zuozhe";
				List newsvotelist = session.createQuery(hql).list();
				session.close();
				return newsvotelist;
			}
		});
	}

	/**
	 * �鿴��������ͳ��
	 */
	@SuppressWarnings("unchecked")
	public List getNewsGuoJiVote() {
		// log.debug("---LoginDAO userSelectDao---");
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException, SQLException {
				String hql = "select zuozhe,count(zhuti) as count from Fenye group by zuozhe";
				List newsvotelist = session.createQuery(hql).list();
				session.close();
				return newsvotelist;
			}
		});
	}


	// �ռǲ�ѯ
	public List<?> articleSelect(final String sql) {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException, SQLException {
				List<?> articleList = session.createQuery(sql).list();
				session.close();
				return articleList;
			}
		});
	}


	/*
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.web_dao.fen_dao.FenInterfaceDAO#OlympicgamesFindSelectAll(int,
	 *      int, java.lang.String)
	 */
	public List OlympicgamesFindSelectAll(final int firstResult,
			final int maxResults, final String hql) {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException, SQLException {
				List<? super OlympicGamesBean> shanchu = new ArrayList<OlympicGamesBean>();
				try {
					List list = session.createQuery(hql).setFirstResult(
							firstResult).setMaxResults(maxResults).list();
					session.close();

					for (Object o : list) {
						OlympicGamesBean fen = (OlympicGamesBean) o;
						shanchu.add(new OlympicGamesBean(fen.getFenye_Id(), fen
								.getZhuti(), fen.getZuozhe(), fen.getFwjilu()));
					}
				} catch (RuntimeException e) {
					e.printStackTrace();
				}
				return shanchu;
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.web_dao.fen_dao.FenInterfaceDAO#NewsFindSelectAll(int, int,
	 *      java.lang.String)
	 */
	/**
	 * @return
	 */
	public List NewsFindSelectAll(final int firstResult, final int maxResults,
			final String hql) {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException, SQLException {
				List<Fenye> shanchu = new ArrayList<Fenye>();
				try {
					List list = session.createQuery(hql).setFirstResult(
							firstResult).setMaxResults(maxResults).list();
					session.close();
					for (Object i : list) {
						Fenye fen = (Fenye) i;
						shanchu.add(new Fenye(fen.getFenye_Id(),
								fen.getZhuti(), fen.getZuozhe(), fen
										.getFwjilu()));
					}
				} catch (RuntimeException e) {
					e.printStackTrace();
				}
				return shanchu;
			}
		});
	}

	/*
	 * �������Ų�ѯ����ҳ��Ҫ������
	 */
	public List OlympicgamesFenyeFindSelectAll(final int firstResult,
			final int maxResults, final String hql) {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException, SQLException {
				List<OlympicGamesBean> shanchu = new ArrayList<OlympicGamesBean>();
				try {
					List list = session.createQuery(hql).setFirstResult(
							firstResult).setMaxResults(maxResults).list();
					session.close();
					for (int i = 0; i < list.size(); i++) {
						OlympicGamesBean fen = (OlympicGamesBean) list.get(i);
						shanchu.add(new OlympicGamesBean(fen.getFenye_Id(), fen
								.getFwjilu(), fen.getZhuti(), fen.getZuozhe(),
								fen.getShijian()));
					}
				} catch (RuntimeException e) {
					e.printStackTrace();
				}
				return shanchu;
			}
		});
	}

	/*
	 * �������Ų�ѯ����ҳ��Ҫ������Fenye
	 */
	public List<?> FindSelectAll(final int firstResult, final int maxResults,
			final String hql) {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException, SQLException {
				List<Fenye> shanchu = new ArrayList<Fenye>();
				try {
					List<?> list = session.createQuery(hql).setFirstResult(
							firstResult).setMaxResults(maxResults).list();

					session.close();
					for (int i = 0; i < list.size(); i++) {
						Fenye fen = (Fenye) list.get(i);
						shanchu.add(new Fenye(fen.getFenye_Id(), fen
								.getFwjilu(), fen.getZhuti(), fen.getZuozhe(),
								fen.getShijian()));
					}
				} catch (RuntimeException e) {
					e.printStackTrace();
				}
				return shanchu;
			}
		});
	}

	// ��ѯ����ҳ��Ҫ������Fenye
	// public List FindSelectAll(final int firstResult, final int maxResults,
	// final String hql) {
	// return getHibernateTemplate().executeFind(new HibernateCallback() {
	// public Object doInHibernate(Session s) throws HibernateException,
	// SQLException {
	// Query query = s.createQuery(hql);
	// query.setFirstResult(firstResult);
	// query.setMaxResults(maxResults);
	// List<Fenye> shanchu = new ArrayList<Fenye>();
	// List list = query.list();
	// for (int i = 0; i < list.size(); i++) {
	// Fenye fen = (Fenye) list.get(i);
	// shanchu.add(new Fenye(fen.getFenye_Id(), fen.getFwjilu(),
	// fen.getZhuti(), fen.getZuozhe(), fen.getShijian()));
	// }
	// try {
	// s.close();
	// } catch (RuntimeException e) {
	// e.printStackTrace();
	// }
	// return shanchu;
	// }
	// });
	// }

	// ��ѯ����ҳ��Ҫ������Fenye
	// public List FindSelectAll(final int firstResult, final int maxResults,
	// final String hql) {
	// return getHibernateTemplate().executeFind(new HibernateCallback() {
	// public Object doInHibernate(Session s) throws HibernateException,
	// SQLException {
	//	
	// Query query = s.createQuery(hql);
	// query.setFirstResult(firstResult);
	// query.setMaxResults(maxResults);
	// List<Fenye> shanchu = new ArrayList<Fenye>();
	// List list = query.list();
	// try {
	// // for (int i = 0; i < list.size(); i++) {
	// // Fenye fen = (Fenye) list.get(i);
	// // shanchu.add(new Fenye(fen.getFenye_Id(), fen
	// // .getFwjilu(), fen.getZhuti(), fen.getZuozhe(),
	// // fen.getShijian()));
	// // }
	//	
	// s.close();
	// } catch (RuntimeException e) {
	// e.printStackTrace();
	// }
	// return list;
	// }
	// });
	// }

	// // // // ��ѯ����ҳ��Ҫ������Fenye
	// public List FindSelectAll(final int firstResult, final int maxResults,
	// final String hql) {
	// return getHibernateTemplate().executeFind(new HibernateCallback() {
	// public Object doInHibernate(Session session)
	// throws HibernateException, SQLException {
	//
	// List<Fenye> shanchu = new ArrayList<Fenye>();
	//
	// List list = session.createQuery(hql)
	// .setFirstResult(firstResult).setMaxResults(maxResults)
	// .list();
	// // for (int i = 0; i < list.size(); i++) {
	// // Fenye fen = (Fenye) list.get(i);
	// // shanchu.add(new Fenye(fen.getFenye_Id(), fen
	// // .getFwjilu(), fen.getZhuti(), fen.getZuozhe(),
	// // fen.getShijian()));
	// // }
	// try {
	// session.close();
	// } catch (RuntimeException e) {
	// e.printStackTrace();
	// }
	// return list;
	// }
	// });
	// }

	// �������Ų�ѯ����ҳ��Ҫ������{Ĭ�����ݿ�ÿҳ��ʾ20��}
	public Integer OlympicgamesFenyeFindSelectCount(final String hql) {
		Integer count = (Integer) getHibernateTemplate().find(hql)
				.listIterator().next();
		return count.intValue();
		// createCriteria ����ClassҲOK
		// Session session = super.getSession();
		// Integer count = session.createCriteria(hql).list().size();
		// System.out.println("�������Ų�ѯ����ҳ��Ҫ������:" + count);
		// super.releaseSession(session);
		// return count.intValue();
	}

	// ��ѯ����ҳ��������
	public Integer FindSelectCount(final String hql) {
		Integer count = (Integer) getHibernateTemplate().find(hql)
				.listIterator().next();
		return count.intValue();
	}

	// ���������������
	public void Olympicgamessave(OlympicGamesBean oben) {
		try {
			if (oben == null || oben.getZhuti() == null) {
			} else {
				getHibernateTemplate().saveOrUpdate(oben);
				getHibernateTemplate().flush();
				// System.out.println("ID:" + fenye.getFenye_Id());
				// getHibernateTemplate().clear();
			}
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

	public void save(Fenye fenye) {
		try {
			if (fenye == null || fenye.getZhuti() == null) {
			} else {
				getHibernateTemplate().saveOrUpdate(fenye);
				getHibernateTemplate().flush();
				// System.out.println("ID:" + fenye.getFenye_Id());
				// getHibernateTemplate().clear();
			}
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

	/*
	 * ���������б�
	 */
	public List<Fenye> Select(final Integer fenye_Id) {
		Fenye fen = (Fenye) getHibernateTemplate().get(Fenye.class, fenye_Id);
		if (fen == null) {
			fen = null;
			return null;
		}
		List<Fenye> list = new ArrayList<Fenye>();
		list.add(new Fenye(fen.getFenye_Id(), fen.getFwjilu(), fen.getZhuti(),
				fen.getZuozhe(), fen.getNeigong(), fen.getShijian()));
		return list;
	}

	/*
	 * ���������б�
	 */
	public List<OlympicGamesBean> OlympicgamesSelect(final Integer fenye_Id) {
		OlympicGamesBean obean = (OlympicGamesBean) getHibernateTemplate().get(
				OlympicGamesBean.class, fenye_Id);
		if (obean == null) {
			obean = null;
			return null;
		}
		List<OlympicGamesBean> list = new ArrayList<OlympicGamesBean>();
		list.add(new OlympicGamesBean(obean.getFenye_Id(), obean.getFwjilu(),
				obean.getZhuti(), obean.getZuozhe(), obean.getNeigong(), obean
						.getShijian()));
		return list;
	}

	/*
	 * ���ʼ�¼����SelectZengJia_JL���� (non-Javadoc)
	 * 
	 * @see com.web_dao.fen_dao.FenInterfaceDAO#SelectZengJia_JL(java.lang.Integer,
	 *      java.lang.Integer)
	 */
	public boolean SelectZengJia_JL(final Integer fenye_Id, Integer fwjilu) {
		if (fenye_Id < 0 || fenye_Id > -1) {
			Fenye fen = (Fenye) this.getHibernateTemplate().get(Fenye.class,
					fenye_Id);
			fen.setFwjilu(fwjilu = fwjilu + 1);
			this.getHibernateTemplate().update(fen);
			return true;
		} else {
			return false;
		}
	}

	/*
	 * ���ʼ�¼����SelectZengJia_JL���� (non-Javadoc)
	 * 
	 * @see com.web_dao.fen_dao.FenInterfaceDAO#OlympicgamesSelectZengJia_JL(java.lang.Integer,
	 *      java.lang.Integer)
	 */
	public boolean OlympicgamesSelectZengJia_JL(final Integer fenye_Id,
			Integer fwjilu) {
		if (fenye_Id < 0 || fenye_Id > -1) {
			OlympicGamesBean oben = (OlympicGamesBean) this
					.getHibernateTemplate().get(OlympicGamesBean.class,
							fenye_Id);
			oben.setFwjilu(fwjilu = fwjilu + 1);
			this.getHibernateTemplate().update(oben);
		}
		return true;
	}

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>������>>>start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	/**
	 * ���������޸�
	 */
	public void Olympicgames_update(OlympicGamesBean oben) {
		try {
			this.getHibernateTemplate().update(oben);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ���������޸�
	 */
	public void guojinews_update(Fenye fenye) {
		try {
			this.getHibernateTemplate().update(fenye);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡ�����������ݵı��
	 */
	public Fenye get_A(Integer fenye_Id) {
		return (Fenye) getHibernateTemplate().get(Fenye.class, fenye_Id);
	}

	/**
	 * ��ȡ�����������ݵı��
	 */
	public OlympicGamesBean get(Integer fenye_Id) {
		return (OlympicGamesBean) getHibernateTemplate().get(
				OlympicGamesBean.class, fenye_Id);
	}

	/**
	 * ��������ɾ��
	 */
	public void Olympicgames_delete(int fenye_Id) {
		getHibernateTemplate().delete(
				getHibernateTemplate().get(OlympicGamesBean.class,
						new Integer(fenye_Id)));
	}

	/**
	 * ��������ɾ��
	 */
	public void guojinews_delete(int fenye_Id) {
		getHibernateTemplate().delete(
				getHibernateTemplate().get(Fenye.class, new Integer(fenye_Id)));
	}
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>������>>>end>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

}
