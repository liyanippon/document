package chao.service;

import java.util.List;

import chao.model.Xsb;

public interface XsService {

	public abstract void delete(String xh);

	//ͨ��ѧ�Ž��в���
	public abstract Xsb find(String xh);

	//��������ѧ��
	public abstract List findAll(int pageNow, int pageSize);

	public abstract int findXsSize();

	//���
	public abstract void save(Xsb xs);

	//�޸�
	public abstract void update(Xsb xs);
	
}