package com.web_serializable_bean.ArticleselectBeen;

public abstract class ArticleSelectAbstract implements java.io.Serializable{
	
	private String userlist;

	private String zhuti;

	private Integer olympicgameinternational;
	
	public ArticleSelectAbstract(){
		
	}
	
	public ArticleSelectAbstract(String zhuti, Integer olympicgameinternational, String userlist){
		this.zhuti = zhuti;
		this.olympicgameinternational = olympicgameinternational;
		this.userlist = userlist;
	}
	
	public ArticleSelectAbstract(String zhuti, Integer olympicgameinternational){
		this.olympicgameinternational = olympicgameinternational;
		this.zhuti = zhuti;
	}

	public String getUserlist() {
		return userlist;
	}

	public void setUserlist(String userlist) {
		this.userlist = userlist;
	}

	public String getZhuti() {
		return zhuti;
	}

	public void setZhuti(String zhuti) {
		this.zhuti = zhuti;
	}

	public Integer getOlympicgameinternational() {
		return olympicgameinternational;
	}

	public void setOlympicgameinternational(Integer olympicgameinternational) {
		this.olympicgameinternational = olympicgameinternational;
	}
	
}
