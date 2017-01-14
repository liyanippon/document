package chao.serviceimp;

import java.util.List;

import chao.dao.CjDao;
import chao.daoimp.CjDaoImp;
import chao.model.Cjb;
import chao.model.Kcb;
import chao.model.Xsb;
import chao.service.CjService;

public class CjServiceImp implements CjService {
    CjDao cjDao=new CjDaoImp();
	//����ѧ���Ϳγ�ɾ��ѧ���ɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#deleteCj(chao.model.Xsb, chao.model.Kcb)
	 */
    public void deleteCj(String xh,String kch)
    {
    	cjDao.deleteCj(xh, kch);
    }
    //ɾ��ĳ�ſγ̵ĳɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#deleteOneKcInfo(java.lang.String)
	 */
    public void deleteOneKcInfo(String kch)
    {
    	cjDao.deleteOneKcInfo(kch);
    }
    //ɾ��ĳѧ���ĳɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#deleteOneXsCj(java.lang.String)
	 */
    public void deleteOneXsCj(String xh)
    {
    	cjDao.deleteOneXsCj(xh);
    }
    //��ҳ��ʾ����ѧ���ɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#findAll(int, int)
	 */
    public List findAllCj(int pageNow,int pageSize)
    {
    	return cjDao.findAllCj(pageNow, pageSize);
    }
    //��ѯһ���������ɼ���¼
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#findCjSize()
	 */
    public int findCjSize()
    {
    	return cjDao.findCjSize();
    }
    //��ѯĳ�ſγ̵�ѧ���ɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#getKcCjList(java.lang.String)
	 */
    public List getKcCjList(String kch)
    {
    	return cjDao.getKcCjList(kch);
    }
    //����ѧ���Ϳγ�����ѯѧ���ɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#getXsCj(chao.model.Xsb, chao.model.Kcb)
	 */
    public Cjb getXsCj(String xh,String kch)
    {
    	return cjDao.getXsCj(xh, kch);
    }
    //��ѯĳѧ����ѧ���ɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#getXsCjList(java.lang.String)
	 */
    public List getXsCjList(String xh)
    {
    	return cjDao.getXsCjList(xh);
    }
    //��ӻ����ѧ���ɼ�
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#saveorupdate(chao.model.Cjb)
	 */
    public void save(Cjb cj)
    {
    	cjDao.save(cj);
    }
    public void update(Cjb cj)
    {
    	cjDao.update(cj);
    }
}
