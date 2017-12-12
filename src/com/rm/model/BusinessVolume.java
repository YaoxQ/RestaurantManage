package com.rm.model;

import java.util.HashSet;
import java.util.Set;

/**
 * BusinessVolume entity. @author MyEclipse Persistence Tools
 */

public class BusinessVolume implements java.io.Serializable {

	// Fields

	private String orderId;
	private Double total;
	private Set books = new HashSet(0);

	// Constructors

	/** default constructor */
	public BusinessVolume() {
	}

	/** minimal constructor */
	public BusinessVolume(Double total) {
		this.total = total;
	}

	/** full constructor */
	public BusinessVolume(Double total, Set books) {
		this.total = total;
		this.books = books;
	}

	// Property accessors

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Set getBooks() {
		return this.books;
	}

	public void setBooks(Set books) {
		this.books = books;
	}

}