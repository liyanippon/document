package chao.service;

import java.util.List;

import chao.model.Zyb;

public interface ZyService {

	//��������רҵ��Ϣ
	public abstract List getAll();

	//����רҵID����רҵ��Ϣ
	public abstract Zyb getOneZy(Integer zyId);

	//���רҵ��Ϣ
	public abstract void save(Zyb zy);

}