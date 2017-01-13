package chao.daoimp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import chao.dao.XsDao;
import chao.model.Kcb;
import chao.model.Xsb;
import chao.util.HibernateSessionFactory;

public class XsDaoImp implements XsDao {

    
	public void delete(String xh)
    {
		Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		Query query=session.createQuery("from Xsb where xh='"+xh+"'");
    		Xsb xs=(Xsb) query.uniqueResult();
    		session.delete(xs);
    		ts.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(session.isOpen())
			   session.close();
		}
    }
    public Xsb find(String xh)
    {
    	Xsb xs=null;
		Session session=null;
		try {
			session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from Xsb where xh='"+xh+"'");
			xs=(Xsb) query.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(session.isOpen())
		        session.close();
		}
		return xs;
    }
    public List findAll(int pageNow,int pageSize)
    {
    	
    	List list=null;
		Session session=null;
		try {
			session = HibernateSessionFactory.getSession();
			Query query = session.createQuery("from Xsb order by xh");
			int firstResult = (pageNow - 1) * pageSize;
			query.setFirstResult(firstResult);
			query.setMaxResults(pageSize);
			list = query.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(session.isOpen())
		        session.close();
		}
		return list;
    }
    public int findXsSize()
    {
    	int size=0;
		Session session=null;
		try {
			session = HibernateSessionFactory.getSession();
			Query query = session.createQuery("from Xsb");
			List list= query.list();
			size=list.size();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(session.isOpen())
		        session.close();
		}
		return size;
    }
    public void save(Xsb xs)
    {
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.save(xs);
    		ts.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(session.isOpen())
		        session.close();
		}
    }
    public void update(Xsb xs)
    {
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.update(xs);
    		ts.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(session.isOpen())
		        session.close();
		}
    }
}
