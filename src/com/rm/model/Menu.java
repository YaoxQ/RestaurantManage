package com.rm.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Menu entity. @author MyEclipse Persistence Tools
 */

public class Menu implements java.io.Serializable {

	// Fields

	private Integer menuId;
	private Menu menu;
	private String menuName;
	private Double price;
	private Integer number;
	private Set menus = new HashSet(0);
	private Set books = new HashSet(0);

	// Constructors

	/** default constructor */
	public Menu() {
	}

	/** minimal constructor */
	public Menu(Menu menu, String menuName, Double price, Integer number) {
		this.menu = menu;
		this.menuName = menuName;
		this.price = price;
		this.number = number;
	}

	/** full constructor */
	public Menu(Menu menu, String menuName, Double price, Integer number,
			Set menus, Set books) {
		this.menu = menu;
		this.menuName = menuName;
		this.price = price;
		this.number = number;
		this.menus = menus;
		this.books = books;
	}

	// Property accessors

	public Integer getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
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

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Set getMenus() {
		return this.menus;
	}

	public void setMenus(Set menus) {
		this.menus = menus;
	}

	public Set getBooks() {
		return this.books;
	}

	public void setBooks(Set books) {
		this.books = books;
	}

}