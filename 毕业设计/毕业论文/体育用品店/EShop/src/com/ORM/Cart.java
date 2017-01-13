package com.ORM;

import java.util.*;

/**
 * 购物车实体
 * @author ZHOU
 *
 */

public class Cart implements java.io.Serializable {

	// Fields

	private Integer id;

	private Member member;

	private Double money;

	private Integer cartStatus;
	
	private Set merchandises = new HashSet();   //商品集合

	// Constructors

	/** default constructor */
	public Cart() {
	}

	/** minimal constructor */
	public Cart(Member member) {
		this.member = member;
	}

	/** full constructor */
	public Cart(Member member, Double money, Integer cartStatus) {
		this.member = member;
		this.money = money;
		this.cartStatus = cartStatus;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Integer getCartStatus() {
		return this.cartStatus;
	}

	public void setCartStatus(Integer cartStatus) {
		this.cartStatus = cartStatus;
	}

	public Set getMerchandises() {
		return merchandises;
	}

	public void setMerchandises(Set merchandises) {
		this.merchandises = merchandises;
	}

}