package com.rm.model;

import java.util.Date;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */

public class Book implements java.io.Serializable {

	// Fields

	private String menuId;
	private Menu menu;
	private BusinessVolume businessVolume;
	private String menuName;
	private Double price;
	private Date orderTime;
	private Integer number;

	// Constructors

	/** default constructor */
	public Book() {
	}

	/** minimal constructor */
	public Book(Menu menu, BusinessVolume businessVolume, String menuName,
			Double price, Integer number) {
		this.menu = menu;
		this.businessVolume = businessVolume;
		this.menuName = menuName;
		this.price = price;
		this.number = number;
	}

	/** full constructor */
	public Book(Menu menu, BusinessVolume businessVolume, String menuName,
			Double price, Date orderTime, Integer number) {
		this.menu = menu;
		this.businessVolume = businessVolume;
		this.menuName = menuName;
		this.price = price;
		this.orderTime = orderTime;
		this.number = number;
	}

	// Property accessors

	public String getMenuId() {
		return this.menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public BusinessVolume getBusinessVolume() {
		return this.businessVolume;
	}

	public void setBusinessVolume(BusinessVolume businessVolume) {
		this.businessVolume = businessVolume;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}