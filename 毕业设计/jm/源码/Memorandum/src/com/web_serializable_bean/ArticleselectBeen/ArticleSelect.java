package com.web_serializable_bean.ArticleselectBeen;

public class ArticleSelect extends ArticleSelectAbstract implements java.io.Serializable {
	
	public ArticleSelect(){
		
	}
	
	public ArticleSelect(String zhuti, Integer olympicgameinternational, String userlist){
		super(zhuti, olympicgameinternational, userlist);
	}
	
	public ArticleSelect(String zhuti, Integer olympicgameinternational){
		super(zhuti, olympicgameinternational);
	}
}
