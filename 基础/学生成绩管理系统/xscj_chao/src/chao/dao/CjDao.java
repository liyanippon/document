package chao.dao;

import java.util.List;

import chao.model.Cjb;
import chao.model.Kcb;
import chao.model.Xsb;

public interface CjDao {

	public abstract Cjb getXsCj(String xh,String kch);

	//����ѧ�Ų��ѧ�������������пγ̵Ŀγ̺š��γ���������ɼ���ѧ��
	public abstract List getKcCjList(String kch);

	public abstract List getXsCjList(String xh);

	//������гɼ���ѧ����ѧ�š����������ѧ�ּ���Ӧ�γ̺źͿγ���
	public abstract List findAllCj(int pageNow, int pageSize);

	public abstract int findCjSize();

	public abstract void deleteCj(String xh,String kch);

	//ɾ�����з��Ͽγ̺ŵ�ѧ���ɼ�
	public abstract void deleteOneKcInfo(String kch);

	//ɾ�����з���ѧ�ŵ�ѧ���ɼ�
	public abstract void deleteOneXsCj(String xh);

	public abstract void save(Cjb cj);
	
	public abstract void update(Cjb cj);

}