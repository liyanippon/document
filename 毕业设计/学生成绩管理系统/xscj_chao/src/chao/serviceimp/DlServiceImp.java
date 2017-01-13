package chao.serviceimp;

import chao.dao.DlDao;
import chao.daoimp.DlDaoImp;
import chao.model.Dlb;
import chao.service.DlService;

public class DlServiceImp implements DlService {
    
	DlDao dlDao=new DlDaoImp();
	//是否存在该学号的用户
	/* (non-Javadoc)
	 * @see chao.serviceimp.DlService#existXh(java.lang.String)
	 */
	public boolean existXh(String xh)
	{
		return dlDao.existXh(xh);
	}
	//根据学号和口令查找
    /* (non-Javadoc)
	 * @see chao.serviceimp.DlService#find(java.lang.String, java.lang.String)
	 */
    public Dlb find(String xh,String kl)
    {
    	return dlDao.find(xh, kl);
    }
    //添加用户
    /* (non-Javadoc)
	 * @see chao.serviceimp.DlService#save(chao.model.Dlb)
	 */
    public void save(Dlb user)
    {
    	dlDao.save(user);
    }
}
