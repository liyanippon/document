package chao.daoimp;

import java.util.List;

import chao.dao.CjDao;
import chao.model.Cjb;
import chao.model.CjbId;
import chao.model.Kcb;
import chao.model.Xsb;
import chao.util.HibernateSessionFactory;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CjDaoImp implements CjDao {
	
    public Cjb getXsCj(String xh,String kch)
    {	
    	Cjb cj=null;
    	Session session = null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Query query=session.createQuery("from Cjb where id.xsb.xh='"+xh+"'"+"and id.kcb.kch='"+kch+"'");
    		cj=(Cjb) query.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return cj;
    }
    //����ѧ�Ų��ѧ�������������пγ̵Ŀγ̺š��γ���������ɼ���ѧ��

    public List getKcCjList(String kch)
    {
    	List list=null;
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Query query=session.createQuery("from Cjb where id.kcb.kch='"+kch+"'");
    		list=query.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return list;
    }

    public List getXsCjList(String xh)
    {
    	List list=null;
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Query query=session.createQuery("from Cjb where id.xsb.xh='"+xh+"'");
    		list=query.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return list;
    }
    //������гɼ���ѧ����ѧ�š����������ѧ�ּ���Ӧ�γ̺źͿγ���
    public List findAllCj(int pageNow, int pageSize) 
    {
    	List list=null;
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Query query=session.createQuery("from Cjb");
    		int firstResult = (pageNow - 1) * pageSize;
			query.setFirstResult(firstResult);
			query.setMaxResults(pageSize);
    		list=query.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return list;
	}
    public int findCjSize() {
    	int size=0;
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Query query=session.createQuery("from Cjb");
    		List list=query.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		finally{
			session.close();
		}
		return size;
	}
	public void deleteCj(String xh,String kch)
    {
		Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		Query query=session.createQuery("from Cjb where id.xsb.xh='"+xh+"'"+"and id.kcb.kch='"+kch+"'");
    		Cjb cj=(Cjb) query.uniqueResult();
    		session.delete(cj);
    		ts.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
    }
	//ɾ�����з��Ͽγ̺ŵ�ѧ���ɼ�
	public void deleteOneKcInfo(String kch)
	{
		Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.delete(getKcCjList(kch));
    		ts.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	//ɾ�����з���ѧ�ŵ�ѧ���ɼ�
	public void deleteOneXsCj(String xh)
	{
		Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.delete(getXsCjList(xh));
    		ts.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	public void save(Cjb cj)
	{
		Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.save(cj);
    		ts.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
	public void update(Cjb cj)
	{
		Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.update(cj);
    		ts.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
}
