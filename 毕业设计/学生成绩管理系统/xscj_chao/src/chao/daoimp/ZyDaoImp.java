package chao.daoimp;

import java.util.List;

import chao.dao.ZyDao;
import chao.model.Xsb;
import chao.model.Zyb;
import chao.util.HibernateSessionFactory;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ZyDaoImp implements ZyDao {
    public List getAll()
    {
    	List list=null;
		Session session=null;
		try {
			session = HibernateSessionFactory.getSession();
			Query query = session.createQuery("from Zyb");
			list = query.list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return list;
    }
    public Zyb getOneZy(Integer zyId)
    {
    	Zyb zy=null;
		Session session=null;
		try {
			session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from Zyb where id='"+zyId+"'");
			zy=(Zyb) query.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
		return zy;
    }
    public void save(Zyb zy)
    {
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.save(zy);
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
