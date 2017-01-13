package chao.dao;

import java.util.List;

import chao.model.Cjb;
import chao.model.Kcb;
import chao.model.Xsb;

public interface CjDao {

	public abstract Cjb getXsCj(String xh,String kch);

	//根据学号查出学生的姓名及所有课程的课程号、课程名、所获成绩和学分
	public abstract List getKcCjList(String kch);

	public abstract List getXsCjList(String xh);

	//查出所有成绩的学生的学号、姓名、获得学分及对应课程号和课程名
	public abstract List findAllCj(int pageNow, int pageSize);

	public abstract int findCjSize();

	public abstract void deleteCj(String xh,String kch);

	//删除所有符合课程号的学生成绩
	public abstract void deleteOneKcInfo(String kch);

	//删除所有符合学号的学生成绩
	public abstract void deleteOneXsCj(String xh);

	public abstract void save(Cjb cj);
	
	public abstract void update(Cjb cj);

}