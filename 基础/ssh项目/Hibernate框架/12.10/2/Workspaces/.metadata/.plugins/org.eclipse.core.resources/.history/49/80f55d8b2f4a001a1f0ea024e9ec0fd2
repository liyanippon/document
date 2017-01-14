package com.dao;

/**
 * AbstractPerson entity provides the base persistence definition of the Person
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPerson implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String name;
	private String password;
	private String address;

	// Constructors

	/** default constructor */
	public AbstractPerson() {
	}

	/** minimal constructor */
	public AbstractPerson(Integer pid) {
		this.pid = pid;
	}

	/** full constructor */
	public AbstractPerson(Integer pid, String name, String password,
			String address) {
		this.pid = pid;
		this.name = name;
		this.password = password;
		this.address = address;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}