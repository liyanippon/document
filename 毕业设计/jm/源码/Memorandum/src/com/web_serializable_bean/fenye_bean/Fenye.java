package com.web_serializable_bean.fenye_bean;

/**
 * 2008/6/08 whp V_1.00 
 * 2008/9/08 ¶ÎÃÈÃÈ V_1.01
 */
public class Fenye extends FenyeAbstract implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8986437661851487250L;

	// ·ÃÎÊÎÄÕÂ£¬²éÑ¯ÎÄÕÂµÈµÈ...
	public Fenye() {
	}

	// //////////////¶ÎÃÈÃÈ V_1.01////////////////////////

	public Fenye(String zuozhe, Integer count) {
		super(zuozhe, count);
	}

	public Fenye(String zuozhe) {
		super(zuozhe);
	}

	// //////////////¶ÎÃÈÃÈ V_1.01////////////////////////

	/**
	 * ÍøÕ¾Ê×Ò³¼ÓÔØ
	 * @param fwjilu
	 * @param zhuti
	 * @param shijian
	 */
	public Fenye(Integer fwjilu, String zhuti, java.sql.Timestamp shijian) {
		super(fwjilu, zhuti, shijian);
	}

	public Fenye(Integer fenye_Id, String zhuti, String zuozhe, Integer fwjilu) {
		super(fenye_Id, zhuti, zuozhe, fwjilu);
	}

	public Fenye(Integer fenye_Id, Integer fwjilu, String zhuti, String zuozhe,
			java.sql.Timestamp shijian) {
		super(fenye_Id, fwjilu, zhuti, zuozhe, shijian);
	}

	public Fenye(Integer fenye_Id, Integer fwjilu, String zhuti, String zuozhe,
			String neigong, java.sql.Timestamp shijian) {
		super(fenye_Id, fwjilu, zhuti, zuozhe, neigong, shijian);
	}

}
