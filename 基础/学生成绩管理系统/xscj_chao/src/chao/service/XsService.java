package chao.service;

import java.util.List;

import chao.model.Xsb;

public interface XsService {

	public abstract void delete(String xh);

	//通过学号进行查找
	public abstract Xsb find(String xh);

	//查找所有学生
	public abstract List findAll(int pageNow, int pageSize);

	public abstract int findXsSize();

	//添加
	public abstract void save(Xsb xs);

	//修改
	public abstract void update(Xsb xs);
	
}