package com.rm.model;

/**
 * AdminiStrator entity. @author MyEclipse Persistence Tools
 */

public class AdminiStrator implements java.io.Serializable {

	// Fields

	private AdminiStratorId id;
	private Login login;

	// Constructors

	/** default constructor */
	public AdminiStrator() {
	}

	/** full constructor */
	public AdminiStrator(AdminiStratorId id, Login login) {
		this.id = id;
		this.login = login;
	}

	// Property accessors

	public AdminiStratorId getId() {
		return this.id;
	}

	public void setId(AdminiStratorId id) {
		this.id = id;
	}

	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

}