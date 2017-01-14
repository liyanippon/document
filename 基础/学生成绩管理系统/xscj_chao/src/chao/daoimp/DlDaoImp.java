package chao.daoimp;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import chao.dao.DlDao;
import chao.model.Dlb;
import chao.util.HibernateSessionFactory;

public class DlDaoImp implements DlDao {
    public boolean existXh(String xh)
    {
    	boolean b=false;
    	Session session=null;
    	try {
			session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from Dlb where xh=?"+xh);
			Dlb dl=(Dlb) query.uniqueResult();
			if(dl!=null)
			{
				b=true;
			}
			else
			{
				b=false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
    	return b;
    }
    public Dlb find(String xh,String kl)
    {
    	Dlb dl=null;
    	Session session=null;
    	try {
			session=HibernateSessionFactory.getSession();
			Query query=session.createQuery("from Dlb where xh='"+xh+"'"+"and kl='"+kl+"'");
			dl=(Dlb) query.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			session.close();
		}
        return dl;
    }
    public void save(Dlb user)
    {
    	Session session=null;
    	try {
    		session=HibernateSessionFactory.getSession();
    		Transaction ts = session.beginTransaction();
    		session.save(user);
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
