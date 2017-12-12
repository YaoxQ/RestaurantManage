package com.rm.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Login entity. @author MyEclipse Persistence Tools
 */

public class Login implements java.io.Serializable {

	// Fields

	private String loginId;
	private Integer id;
	private String password;
	private Set adminiStrators = new HashSet(0);
	private Set staffs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Login() {
	}

	/** full constructor */
	public Login(Integer id, String password, Set adminiStrators, Set staffs) {
		this.id = id;
		this.password = password;
		this.adminiStrators = adminiStrators;
		this.staffs = staffs;
	}

	// Property accessors

	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getAdminiStrators() {
		return this.adminiStrators;
	}

	public void setAdminiStrators(Set adminiStrators) {
		this.adminiStrators = adminiStrators;
	}

	public Set getStaffs() {
		return this.staffs;
	}

	public void setStaffs(Set staffs) {
		this.staffs = staffs;
	}

}