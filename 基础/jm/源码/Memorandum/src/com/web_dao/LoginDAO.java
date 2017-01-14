package com.web_dao;

import java.sql.SQLException;
import java.util.List;

import com.web_serializable_bean.Login;
import com.web_dao.LoginInterfaceDAO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * 2008/6/08 whp V_1.00
 * 2008/9/08 ¿ÓˆŒ V_1.01
 *
 */
public class LoginDAO extends HibernateDaoSupport implements LoginInterfaceDAO {

	private static final Log log = LogFactory.getLog(LoginDAO.class);

	public boolean loginCheck(Login login) {
		
		log.debug("---LoginDAO loginCheck---");
		try {
			List results = getHibernateTemplate().find(
					"from Login where userName = ?  and   passWord = ? ",
					new String[] { login.getUserName(), login.getPassWord() });
			return results != null && !results.isEmpty() && results.size() == 1;
		} catch (RuntimeException re) {
			log.error("Select login failed", re);
			throw re;
		}
	}

	public void save(Login login) {
		log.debug("---LoginDAO save---");
		try {
			getHibernateTemplate().save(login);
			getHibernateTemplate().flush();
		} catch (DataAccessException e) {
			log.error("LoginDAO save failed", e);
		}
	}

////////////////¿ÓˆŒ V_1.01////////////////////////
	@SuppressWarnings("unchecked")
	public List<Login> userSelectDao() {
		log.debug("---LoginDAO userSelectDao---");
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(final Session session)
					throws HibernateException, SQLException {
				String hql = "select userName as userName from Login";
				List list = session.createQuery(hql).list();
//				for(Object o : list){
//					Login login= new Login();
//					login.setUserName((String) o);
//					System.out.println(o.toString());
//					System.out.println(login.getUserName());
//				}
				// Query query =
				// session.getNamedQuery("com.web_dao.userSelectDao");
				// List<Login> list = query.list();
				session.close();
				return list;
			}
		});
	}
////////////////¿ÓˆŒ V_1.01////////////////////////
}
