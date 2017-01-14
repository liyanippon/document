package chao.dao;

import java.util.List;

import chao.model.Zyb;

public interface ZyDao {

	public abstract List getAll();

	public abstract Zyb getOneZy(Integer zyId);

	public abstract void save(Zyb zy);

}