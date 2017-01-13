package chao.serviceimp;

import java.util.List;

import chao.dao.ZyDao;
import chao.daoimp.ZyDaoImp;
import chao.model.Zyb;
import chao.service.ZyService;

public class ZyServiceImp implements ZyService {
    ZyDao zyDao=new ZyDaoImp();
	//查找所有专业信息
	/* (non-Javadoc)
	 * @see chao.serviceimp.ZyService#getAll()
	 */
	public List getAll()
	{
		return zyDao.getAll();
	}
	//根据专业ID查找专业信息
	/* (non-Javadoc)
	 * @see chao.serviceimp.ZyService#getOneZy(java.lang.Integer)
	 */
	public Zyb getOneZy(Integer zyId)
	{
		return zyDao.getOneZy(zyId);
	}
	//添加专业信息
	/* (non-Javadoc)
	 * @see chao.serviceimp.ZyService#save(chao.model.Zyb)
	 */
	public void save(Zyb zy)
	{
		zyDao.save(zy);
	}
}
