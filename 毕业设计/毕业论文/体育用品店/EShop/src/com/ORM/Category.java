package com.ORM;

/**
 * ���ʵ��
 * @author ZHOU
 *
 */

public class Category implements java.io.Serializable {

	// Fields

	private Integer id;

	private String cateName;

	private String cateDesc;

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** full constructor */
	public Category(String cateName, String cateDesc) {
		this.cateName = cateName;
		this.cateDesc = cateDesc;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCateName() {
		return this.cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public String getCateDesc() {
		return this.cateDesc;
	}

	public void setCateDesc(String cateDesc) {
		this.cateDesc = cateDesc;
	}

}