package chao.dao;

import java.util.List;

import chao.model.Kcb;

public interface KcDao {

	public abstract Kcb find(String kch);

	public abstract List findAll(int pageNow, int pageSize);

	public abstract int findXsSize();

	public abstract void save(Kcb kc);
	
	public abstract void delete(String kch);
	
	public abstract void update(Kcb kc);

}