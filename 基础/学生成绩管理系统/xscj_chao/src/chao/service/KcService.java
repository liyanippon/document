package chao.service;

import java.util.List;

import chao.model.Kcb;

public interface KcService {

	//���ݿγ̺Ų�ѯ
	public abstract Kcb find(String kch);

	//��ҳ��ʾ�γ���Ϣ
	public abstract List FindAll(int pageNow, int pageSize);

	//��ѯһ���������γ̼�¼
	public abstract int findKcSize();

	//��ӿγ���Ϣ
	public abstract void save(Kcb kc);
	
	public abstract void delete(String kch);
	
	public abstract void update(Kcb kc);

}