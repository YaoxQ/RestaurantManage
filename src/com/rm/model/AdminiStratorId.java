package com.rm.model;

/**
 * AdminiStratorId entity. @author MyEclipse Persistence Tools
 */

public class AdminiStratorId implements java.io.Serializable {

	// Fields

	private String name;
	private Short sex;
	private Login login;
	private String password;

	// Constructors

	/** default constructor */
	public AdminiStratorId() {
	}

	/** minimal constructor */
	public AdminiStratorId(Login login) {
		this.login = login;
	}

	/** full constructor */
	public AdminiStratorId(String name, Short sex, Login login, String password) {
		this.name = name;
		this.sex = sex;
		this.login = login;
		this.password = password;
	}

	// Property accessors

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getSex() {
		return this.sex;
	}

	public void setSex(Short sex) {
		this.sex = sex;
	}

	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AdminiStratorId))
			return false;
		AdminiStratorId castOther = (AdminiStratorId) other;

		return ((this.getName() == castOther.getName()) || (this.getName() != null
				&& castOther.getName() != null && this.getName().equals(
				castOther.getName())))
				&& ((this.getSex() == castOther.getSex()) || (this.getSex() != null
						&& castOther.getSex() != null && this.getSex().equals(
						castOther.getSex())))
				&& ((this.getLogin() == castOther.getLogin()) || (this
						.getLogin() != null && castOther.getLogin() != null && this
						.getLogin().equals(castOther.getLogin())))
				&& ((this.getPassword() == castOther.getPassword()) || (this
						.getPassword() != null
						&& castOther.getPassword() != null && this
						.getPassword().equals(castOther.getPassword())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getSex() == null ? 0 : this.getSex().hashCode());
		result = 37 * result
				+ (getLogin() == null ? 0 : this.getLogin().hashCode());
		result = 37 * result
				+ (getPassword() == null ? 0 : this.getPassword().hashCode());
		return result;
	}

}