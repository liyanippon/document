package com.xinxi_Action.struts.session;

import java.util.Date;

public class StaticName {
	// �ж��û��Ƿ�ɹ���½
	public static String USERLOGIN = "";

	// ���Է�ҳ����ҳ������
	public static final String FENYE_CESHI = "OK";

	public static Integer FIRST_XIAYIYE;

	// ��next,string_previousת����Integer����(��ҳ��)
	public static Integer RequrestNext_Previous_Integer;

	
	// ������ҳ(���ݿ�ӵ�1����ʼ����)
	public static final Integer NEWS_FIRST_RESULT = 0;

	//������ҳ(���ݿ�ÿҳ����10������)
	public static final Integer NEWS_MAX_RESULTS = 10;
	
	
	// �����ҳ(Ĭ�����ݿ�ӵ�1����ʼ����)
	public static final Integer FIRST_RESULT = 0;

	// �����ҳ(Ĭ�����ݿ�ÿҳ����20������)
	public static final Integer MAX_RESULTS = 20;

	// �����ҳ(Ĭ��SQL���)
	 public static final String FENYESQL_SHUJU = "from Fenye as fenye";
	 public static final String olympicgames_FENYESQL_SHUJU = "from OlympicGamesBean as o";
//	 public static final String FENYESQL_SHUJU = "from Fenye as fenye where zuozhe='���Թ���Ա'";
//	public static final String FENYESQL_SHUJU = "from Fenye as fenye order by fenye.fenye_Id";
	//   public static final String FENYESQL_SHUJU = "select fenye_Id ,fwjilu ,zhuti,zuozhe ,shijian from Fenye as fenye order by fenye.fenye_Id";
//	public static final String FENYESQL_SHUJU = "select fenye_Id as FENYE1_1_"
//			+ ",fwjilu as FWJILU1_" + ",zhuti as ZHUTI1_"
//			+ ",zuozhe as ZUOZHE1_" + ",shijian as SHIJIAN1_ "
//			+ "from Fenye as fenye order by fenye.fenye_Id";

	// ��ѯ��ҳSQL�е�count(*)
	public static final String FENYESQL_COUNT = "select count(*) from Fenye as fenye";
	
	public static final String olympicgames_FENYESQL_COUNT = "select count(*) from OlympicGamesBean as o";

	//
	public static double SQL_DATE_CHESHI_GO = 0.0;

	public static double SQL_DATE_CHESHI_EXIT = 0.0;

	public static Date SQL_CESHI = new Date();
	
	public static Date SQL_CESHI_01 = new Date();
}
