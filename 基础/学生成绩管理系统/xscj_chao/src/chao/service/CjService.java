package chao.service;

import java.util.List;

import chao.model.Cjb;
import chao.model.Kcb;
import chao.model.Xsb;

public interface CjService {

	//����ѧ���Ϳγ�ɾ��ѧ���ɼ�
	public abstract void deleteCj(String xh,String kch);

	//ɾ��ĳ�ſγ̵ĳɼ�
	public abstract void deleteOneKcInfo(String kch);

	//ɾ��ĳѧ���ĳɼ�
	public abstract void deleteOneXsCj(String xh);

	//��ҳ��ʾ����ѧ���ɼ�
	public abstract List findAllCj(int pageNow, int pageSize);

	//��ѯһ���������ɼ���¼
	public abstract int findCjSize();

	//��ѯĳ�ſγ̵�ѧ���ɼ�
	public abstract List getKcCjList(String kch);

	//����ѧ���Ϳγ�����ѯѧ���ɼ�
	public abstract Cjb getXsCj(String xh,String kch);

	//��ѯĳѧ����ѧ���ɼ�
	public abstract List getXsCjList(String xh);

	//��ӻ����ѧ���ɼ�	
	public abstract void save(Cjb cj);
	
	public abstract void update(Cjb cj);

}