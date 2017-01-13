package chao.serviceimp;

import java.util.List;

import chao.dao.KcDao;
import chao.daoimp.KcDaoImp;
import chao.model.Kcb;
import chao.service.KcService;

public class KcServiceImp implements KcService {
    KcDao kcDao=new KcDaoImp(); 
	//根据课程号查询
    /* (non-Javadoc)
	 * @see chao.serviceimp.KcService#find(java.lang.String)
	 */
    public Kcb find(String kch)
    {
    	return kcDao.find(kch);
    }
    //分页显示课程信息
    /* (non-Javadoc)
	 * @see chao.serviceimp.KcService#FindAll(int, int)
	 */
    public List FindAll(int pageNow,int pageSize)
    {
    	return kcDao.findAll(pageNow, pageSize);
    }
    //查询一共多少条课程记录
    /* (non-Javadoc)
	 * @see chao.serviceimp.KcService#findKcSize()
	 */
    public int findKcSize()
    {
    	return kcDao.findXsSize();
    }
    //添加课程信息
    /* (non-Javadoc)
	 * @see chao.serviceimp.KcService#save(chao.model.Kcb)
	 */
    public void save(Kcb kc)
    {
    	kcDao.save(kc);
    }
    public void delete(String kch)
    {
    	kcDao.delete(kch);
    }
    public void update(Kcb kc)
    {
    	kcDao.update(kc);
    }
}
