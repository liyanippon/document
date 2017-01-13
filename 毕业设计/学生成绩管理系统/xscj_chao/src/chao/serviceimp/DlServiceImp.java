package chao.serviceimp;

import chao.dao.DlDao;
import chao.daoimp.DlDaoImp;
import chao.model.Dlb;
import chao.service.DlService;

public class DlServiceImp implements DlService {
    
	DlDao dlDao=new DlDaoImp();
	//�Ƿ���ڸ�ѧ�ŵ��û�
	/* (non-Javadoc)
	 * @see chao.serviceimp.DlService#existXh(java.lang.String)
	 */
	public boolean existXh(String xh)
	{
		return dlDao.existXh(xh);
	}
	//����ѧ�źͿ������
    /* (non-Javadoc)
	 * @see chao.serviceimp.DlService#find(java.lang.String, java.lang.String)
	 */
    public Dlb find(String xh,String kl)
    {
    	return dlDao.find(xh, kl);
    }
    //����û�
    /* (non-Javadoc)
	 * @see chao.serviceimp.DlService#save(chao.model.Dlb)
	 */
    public void save(Dlb user)
    {
    	dlDao.save(user);
    }
}
