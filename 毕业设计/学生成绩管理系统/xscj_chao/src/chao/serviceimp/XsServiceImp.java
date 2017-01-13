package chao.serviceimp;

import java.util.List;

import chao.dao.CjDao;
import chao.dao.XsDao;
import chao.daoimp.CjDaoImp;
import chao.daoimp.XsDaoImp;
import chao.model.Xsb;
import chao.service.XsService;

public class XsServiceImp implements XsService {
    XsDao xsDao=new XsDaoImp();
    CjDao cjDao=new CjDaoImp();
	/* (non-Javadoc)
	 * @see chao.serviceimp.XsService#delete(java.lang.String)
	 */
    public void delete(String xh)
    {
    	//ɾ��ѧ��ʱͬʱҪɾ����Ӧ�ɼ�
    	xsDao.delete(xh);
    }
    //ͨ��ѧ�Ž��в���
    /* (non-Javadoc)
	 * @see chao.serviceimp.XsService#find(java.lang.String)
	 */
    public Xsb find(String xh)
    {
    	return xsDao.find(xh);
    }
    //��������ѧ��
    /* (non-Javadoc)
	 * @see chao.serviceimp.XsService#findAll(int, int)
	 */
    public List findAll(int pageNow,int pageSize)
    {
    	return xsDao.findAll(pageNow, pageSize);
    }
    /* (non-Javadoc)
	 * @see chao.serviceimp.XsService#findXsSize()
	 */
    public int findXsSize()
    {
    	return xsDao.findXsSize();
    }
    //���
    /* (non-Javadoc)
	 * @see chao.serviceimp.XsService#save(chao.model.Xsb)
	 */
    public void save(Xsb xs)
    {
    	xsDao.save(xs);
    }
    //�޸�
    /* (non-Javadoc)
	 * @see chao.serviceimp.XsService#update(chao.model.Xsb)
	 */
    public void update(Xsb xs)
    {
    	xsDao.update(xs);
    }
}
