package chao.service;

import java.util.List;

import chao.model.Kcb;

public interface KcService {

	//根据课程号查询
	public abstract Kcb find(String kch);

	//分页显示课程信息
	public abstract List FindAll(int pageNow, int pageSize);

	//查询一共多少条课程记录
	public abstract int findKcSize();

	//添加课程信息
	public abstract void save(Kcb kc);
	
	public abstract void delete(String kch);
	
	public abstract void update(Kcb kc);

}