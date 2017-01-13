package chao.dao;

import java.util.List;

import chao.model.Xsb;

public interface XsDao {

	public abstract void delete(String xh);

	public abstract Xsb find(String xh);

	public abstract List findAll(int pageNow, int pageSize);

	public abstract int findXsSize();

	public abstract void save(Xsb xs);

	public abstract void update(Xsb xs);

}