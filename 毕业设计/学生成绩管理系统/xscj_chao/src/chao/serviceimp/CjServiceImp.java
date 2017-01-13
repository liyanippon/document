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
	//根据学生和课程删除学生成绩
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#deleteCj(chao.model.Xsb, chao.model.Kcb)
	 */
    public void deleteCj(String xh,String kch)
    {
    	cjDao.deleteCj(xh, kch);
    }
    //删除某门课程的成绩
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#deleteOneKcInfo(java.lang.String)
	 */
    public void deleteOneKcInfo(String kch)
    {
    	cjDao.deleteOneKcInfo(kch);
    }
    //删除某学生的成绩
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#deleteOneXsCj(java.lang.String)
	 */
    public void deleteOneXsCj(String xh)
    {
    	cjDao.deleteOneXsCj(xh);
    }
    //分页显示所有学生成绩
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#findAll(int, int)
	 */
    public List findAllCj(int pageNow,int pageSize)
    {
    	return cjDao.findAllCj(pageNow, pageSize);
    }
    //查询一共多少条成绩记录
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#findCjSize()
	 */
    public int findCjSize()
    {
    	return cjDao.findCjSize();
    }
    //查询某门课程的学生成绩
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#getKcCjList(java.lang.String)
	 */
    public List getKcCjList(String kch)
    {
    	return cjDao.getKcCjList(kch);
    }
    //根据学生和课程来查询学生成绩
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#getXsCj(chao.model.Xsb, chao.model.Kcb)
	 */
    public Cjb getXsCj(String xh,String kch)
    {
    	return cjDao.getXsCj(xh, kch);
    }
    //查询某学生的学生成绩
    /* (non-Javadoc)
	 * @see chao.serviceimp.CjService#getXsCjList(java.lang.String)
	 */
    public List getXsCjList(String xh)
    {
    	return cjDao.getXsCjList(xh);
    }
    //添加或更新学生成绩
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
