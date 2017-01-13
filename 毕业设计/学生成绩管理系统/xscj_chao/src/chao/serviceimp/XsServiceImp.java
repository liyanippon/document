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
    	//删除学生时同时要删除对应成绩
    	xsDao.delete(xh);
    }
    //通过学号进行查找
    /* (non-Javadoc)
	 * @see chao.serviceimp.XsService#find(java.lang.String)
	 */
    public Xsb find(String xh)
    {
    	return xsDao.find(xh);
    }
    //查找所有学生
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
    //添加
    /* (non-Javadoc)
	 * @see chao.serviceimp.XsService#save(chao.model.Xsb)
	 */
    public void save(Xsb xs)
    {
    	xsDao.save(xs);
    }
    //修改
    /* (non-Javadoc)
	 * @see chao.serviceimp.XsService#update(chao.model.Xsb)
	 */
    public void update(Xsb xs)
    {
    	xsDao.update(xs);
    }
}
