package com.xinxi_Action.struts.session;

import java.util.Date;

public class StaticName {
	// 判断用户是否成功登陆
	public static String USERLOGIN = "";

	// 测试分页返回页面数据
	public static final String FENYE_CESHI = "OK";

	public static Integer FIRST_XIAYIYE;

	// 将next,string_previous转换成Integer类型(分页中)
	public static Integer RequrestNext_Previous_Integer;

	
	// 新闻主页(数据库从第1条开始检索)
	public static final Integer NEWS_FIRST_RESULT = 0;

	//新闻主页(数据库每页返回10条数据)
	public static final Integer NEWS_MAX_RESULTS = 10;
	
	
	// 进入分页(默认数据库从第1条开始检索)
	public static final Integer FIRST_RESULT = 0;

	// 进入分页(默认数据库每页返回20条数据)
	public static final Integer MAX_RESULTS = 20;

	// 进入分页(默认SQL语句)
	 public static final String FENYESQL_SHUJU = "from Fenye as fenye";
	 public static final String olympicgames_FENYESQL_SHUJU = "from OlympicGamesBean as o";
//	 public static final String FENYESQL_SHUJU = "from Fenye as fenye where zuozhe='测试管理员'";
//	public static final String FENYESQL_SHUJU = "from Fenye as fenye order by fenye.fenye_Id";
	//   public static final String FENYESQL_SHUJU = "select fenye_Id ,fwjilu ,zhuti,zuozhe ,shijian from Fenye as fenye order by fenye.fenye_Id";
//	public static final String FENYESQL_SHUJU = "select fenye_Id as FENYE1_1_"
//			+ ",fwjilu as FWJILU1_" + ",zhuti as ZHUTI1_"
//			+ ",zuozhe as ZUOZHE1_" + ",shijian as SHIJIAN1_ "
//			+ "from Fenye as fenye order by fenye.fenye_Id";

	// 查询分页SQL中的count(*)
	public static final String FENYESQL_COUNT = "select count(*) from Fenye as fenye";
	
	public static final String olympicgames_FENYESQL_COUNT = "select count(*) from OlympicGamesBean as o";

	//
	public static double SQL_DATE_CHESHI_GO = 0.0;

	public static double SQL_DATE_CHESHI_EXIT = 0.0;

	public static Date SQL_CESHI = new Date();
	
	public static Date SQL_CESHI_01 = new Date();
}
