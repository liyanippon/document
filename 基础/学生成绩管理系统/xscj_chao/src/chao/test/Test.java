package chao.test;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import chao.model.Xsb;
import chao.util.HibernateSessionFactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Session session=HibernateSessionFactory.getSession();
         Transaction ts=session.beginTransaction();
         Query query=session.createQuery("from Xsb where xh='081104'");
         Xsb xs=(Xsb) query.uniqueResult();
         session.delete(xs);
         ts.commit();
         session.close();
	}

}
