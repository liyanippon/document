package com.web_serializable_bean.OlympicGames;

/**
 * 2008/6/08 whp V_1.00 2008/9/08 段萌萌 V_1.01
 */
public abstract class OlympicGamesAbstract implements java.io.Serializable {

	// ID
	private Integer fenye_Id;

	// 访问记录
	private Integer fwjilu;

	// 主题
	private String zhuti;

	// 作者
	private String zuozhe;

	// 文章内容
	private String neigong;

	// 发表时间
	private java.sql.Timestamp shijian;

	// //////////////段萌萌 V_1.01////////////////////////
	// 文章数
	private Integer count;

	// //////////////段萌萌 V_1.01////////////////////////

	public OlympicGamesAbstract() {
	}

	// //////////////段萌萌 V_1.01////////////////////////
	public OlympicGamesAbstract(String zuozhe, Integer count) {
		this.zuozhe = zuozhe;
		this.count = count;

	}

	public OlympicGamesAbstract(String zuozhe) {
		this.zuozhe = zuozhe;

	}

	/**
	 * 网站首页加载
	 * 
	 * @param fwjilu
	 * @param zhuti
	 * @param shijian
	 */
	public OlympicGamesAbstract(Integer fwjilu, String zhuti,
			java.sql.Timestamp shijian) {
		this.fwjilu = fwjilu;
		this.zhuti = zhuti;
		this.shijian = shijian;
	}

	// //////////////段萌萌 V_1.01////////////////////////

	public OlympicGamesAbstract(Integer fenye_Id, String zhuti, String zuozhe,
			Integer fwjilu) {
		this.fenye_Id = fenye_Id;
		this.zhuti = zhuti;
		this.zuozhe = zuozhe;
		this.fwjilu = fwjilu;

	}

	public OlympicGamesAbstract(Integer fenye_Id) {
		this.fenye_Id = fenye_Id;
	}

	public OlympicGamesAbstract(Integer fenye_Id, Integer fwjilu, String zhuti,
			String zuozhe, java.sql.Timestamp shijian) {
		this.fenye_Id = fenye_Id;
		this.fwjilu = fwjilu;
		this.zhuti = zhuti;
		this.zuozhe = zuozhe;
		this.shijian = shijian;

	}

	public OlympicGamesAbstract(Integer fwjilu, String zhuti, String zuozhe,
			String neigong, java.sql.Timestamp shijian) {
		this.fwjilu = fwjilu;
		this.zhuti = zhuti;
		this.zuozhe = zuozhe;
		this.neigong = neigong;
		this.shijian = shijian;
	}

	public OlympicGamesAbstract(Integer fenye_Id, Integer fwjilu, String zhuti,
			String zuozhe, String neigong, java.sql.Timestamp shijian) {
		this.fenye_Id = fenye_Id;
		this.fwjilu = fwjilu;
		this.zhuti = zhuti;
		this.zuozhe = zuozhe;
		this.neigong = neigong;
		this.shijian = shijian;
	}

	public Integer getFenye_Id() {
		return fenye_Id;
	}

	public void setFenye_Id(Integer fenye_Id) {
		this.fenye_Id = fenye_Id;
	}

	public Integer getFwjilu() {
		return fwjilu;
	}

	public void setFwjilu(Integer fwjilu) {
		this.fwjilu = fwjilu;
	}

	public String getNeigong() {
		return neigong;
	}

	public void setNeigong(String neigong) {
		this.neigong = neigong;
	}

	public java.sql.Timestamp getShijian() {
		return shijian;
	}

	public void setShijian(java.sql.Timestamp shijian) {
		this.shijian = shijian;
	}

	public String getZhuti() {
		return zhuti;
	}

	public void setZhuti(String zhuti) {
		this.zhuti = zhuti;
	}

	public String getZuozhe() {
		return zuozhe;
	}

	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
