package chao.service;

import chao.model.Dlb;

public interface DlService {

	//�Ƿ���ڸ�ѧ�ŵ��û�
	public abstract boolean existXh(String xh);

	//����ѧ�źͿ������
	public abstract Dlb find(String xh, String kl);

	//����û�
	public abstract void save(Dlb user);

}