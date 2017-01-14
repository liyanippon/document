package chao.dao;

import chao.model.Dlb;

public interface DlDao {

	public abstract boolean existXh(String xh);

	public abstract Dlb find(String xh, String kl);

	public abstract void save(Dlb user);

}