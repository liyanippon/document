package com.ORM;

import java.util.Date;

/**
 *��Ʒʵ��
 * @author ZHOU
 *
 */

public class Merchandise implements java.io.Serializable {

	// Fields

	private Integer id;

	private Category category;

	private String merName;

	private Double price;

	private Double sprice;

	private String merModel;

	private String picture;

	private String merDesc;

	private String manufacturer;

	private Date leaveFactoryDate;

	private Integer special;

	// Constructors

	/** default constructor */
	public Merchandise() {
	}

	/** minimal constructor */
	public Merchandise(Category category) {
		this.category = category;
	}

	/** full constructor */
	public Merchandise(Category category, String merName, Double price,
			Double sprice, String merModel, String picture, String merDesc,
			String manufacturer, Date leaveFactoryDate, Integer special) {
		this.category = category;
		this.merName = merName;
		this.price = price;
		this.sprice = sprice;
		this.merModel = merModel;
		this.picture = picture;
		this.merDesc = merDesc;
		this.manufacturer = manufacturer;
		this.leaveFactoryDate = leaveFactoryDate;
		this.special = special;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getMerName() {
		return this.merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getSprice() {
		return this.sprice;
	}

	public void setSprice(Double sprice) {
		this.sprice = sprice;
	}

	public String getMerModel() {
		return this.merModel;
	}

	public void setMerModel(String merModel) {
		this.merModel = merModel;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getMerDesc() {
		return this.merDesc;
	}

	public void setMerDesc(String merDesc) {
		this.merDesc = merDesc;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getLeaveFactoryDate() {
		return this.leaveFactoryDate;
	}

	public void setLeaveFactoryDate(Date leaveFactoryDate) {
		this.leaveFactoryDate = leaveFactoryDate;
	}

	public Integer getSpecial() {
		return this.special;
	}

	public void setSpecial(Integer special) {
		this.special = special;
	}

}