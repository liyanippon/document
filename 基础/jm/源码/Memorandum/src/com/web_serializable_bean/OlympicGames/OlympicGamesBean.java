package com.web_serializable_bean.OlympicGames;
/**
 * 2008/6/08 whp V_1.00
 * 2008/9/08 ∂Œ√»√» V_1.01
 */
public class OlympicGamesBean extends OlympicGamesAbstract implements
		java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 206237296307891086L;

	public OlympicGamesBean() {
	}
	
	/**
	 * Õ¯’æ ◊“≥º”‘ÿ
	 * @param fwjilu
	 * @param zhuti
	 * @param shijian
	 */
	public OlympicGamesBean(Integer fwjilu, String zhuti, java.sql.Timestamp shijian) {
		super(fwjilu, zhuti, shijian);
	}
	
	////////////////∂Œ√»√» V_1.01////////////////////////
	
	public OlympicGamesBean( String zuozhe,Integer count) {
		super(zuozhe, count);
	}
	
	public OlympicGamesBean( String zuozhe) {
		super(zuozhe);
	}
	////////////////∂Œ√»√» V_1.01////////////////////////

	public OlympicGamesBean(Integer fenye_Id, String zhuti, String zuozhe,
			Integer fwjilu) {
		super(fenye_Id, zhuti, zuozhe, fwjilu);
	}

	public OlympicGamesBean(Integer fenye_Id, Integer fwjilu, String zhuti,
			String zuozhe, java.sql.Timestamp shijian) {
		super(fenye_Id, fwjilu, zhuti, zuozhe, shijian);
	}

	public OlympicGamesBean(Integer fenye_Id, Integer fwjilu, String zhuti,
			String zuozhe, String neigong, java.sql.Timestamp shijian) {
		super(fenye_Id, fwjilu, zhuti, zuozhe, neigong, shijian);
	}
}
