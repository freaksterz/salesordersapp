package com.salesorderapp.hibernate.entity;


// Created 28 Dec 2014 

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author freakster
 */
@Entity
@Table(name = "SaleOrder", catalog = "salesorderapp")
public class SalesOrder implements java.io.Serializable {

	private String orderNumber;
	private Customer customer;
	private BigDecimal totalPrice;
	private int orderNo;
	private Set<OrderLines> orderLineses = new HashSet<OrderLines>(0);

	public SalesOrder() {
	}

	public SalesOrder(String orderNumber, int orderNo) {
		this.orderNumber = orderNumber;
		this.orderNo = orderNo;
	}

	public SalesOrder(String orderNumber, Customer customer,
			BigDecimal totalPrice, int orderNo, Set<OrderLines> orderLineses) {
		this.orderNumber = orderNumber;
		this.customer = customer;
		this.totalPrice = totalPrice;
		this.orderNo = orderNo;
		this.orderLineses = orderLineses;
	}

	@Id
	@Column(name = "OrderNumber", unique = true, nullable = false, length = 30)
	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Cust_Code")
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name = "Total_Price", precision = 10)
	public BigDecimal getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Column(name = "Order_No", nullable = false)
	public int getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "saleOrder")
	public Set<OrderLines> getOrderLineses() {
		return this.orderLineses;
	}

	public void setOrderLineses(Set<OrderLines> orderLineses) {
		this.orderLineses = orderLineses;
	}

}
