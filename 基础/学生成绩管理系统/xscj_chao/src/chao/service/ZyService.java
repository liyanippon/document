package chao.service;

import java.util.List;

import chao.model.Zyb;

public interface ZyService {

	//查找所有专业信息
	public abstract List getAll();

	//根据专业ID查找专业信息
	public abstract Zyb getOneZy(Integer zyId);

	//添加专业信息
	public abstract void save(Zyb zy);

}