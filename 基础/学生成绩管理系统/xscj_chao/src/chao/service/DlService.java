package chao.service;

import chao.model.Dlb;

public interface DlService {

	//是否存在该学号的用户
	public abstract boolean existXh(String xh);

	//根据学号和口令查找
	public abstract Dlb find(String xh, String kl);

	//添加用户
	public abstract void save(Dlb user);

}