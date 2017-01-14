package kd;

public class Circle extends Point{

	protected float mRadius;    //半径

	  public Circle(float x, float y, float r)  //构造方法
	  {
	    super(x, y);  //显式调用父类构造方法，必须是第一条语句
	    mRadius = r;
	  }




}
