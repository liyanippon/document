package com.ORM;


/**
 * 管理员实体
 * @author ZHOU
 *
 */

public class Admin implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Integer adminType;

	private String adminName;

	private String loginName;

	private String loginPwd;


	/** default constructor */
	public Admin() {
	}

	/** full constructor */
	public Admin(Integer adminType, String adminName, String loginName,
			String loginPwd) {
		this.adminType = adminType;
		this.adminName = adminName;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {  
		this.id = id;
	}

	public Integer getAdminType() {
		return this.adminType;
	}

	public void setAdminType(Integer adminType) {
		this.adminType = adminType;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return this.loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

}