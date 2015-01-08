package com.salesorderapp.hibernate.entity;


// created 28 Dec, 2014 

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "Customer", catalog = "salesorderapp")
public class Customer implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 	
	 */
	//private static final long serialVersionUID = 4720496769878541698L;
		private String custCode = null;
		private String custName = null;
		private String adress = null;
		private String phone1 = null;
		private String phone2 = null;
		private double creditLimit;
		private double currentLimit;
	private transient Set<SalesOrder> saleOrders = new HashSet<SalesOrder>(0);

	public Customer() {
	}

	public Customer(String custCode, String custName, String phone1,
			double creditLimit, double currentLimit) {
		this.custCode = custCode;
		this.custName = custName;
		this.phone1 = phone1;
		this.creditLimit = creditLimit;
		this.currentLimit = currentLimit;
	}

	public Customer(String custCode, String custName, String adress,
			String phone1, String phone2, double creditLimit,
			double currentLimit, Set<SalesOrder> saleOrders) {
		this.custCode = custCode;
		this.custName = custName;
		this.adress = adress;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.creditLimit = creditLimit;
		this.currentLimit = currentLimit;
		this.saleOrders = saleOrders;
	}

	@Id
	@Column(name = "Cust_Code", unique = true, nullable = false, length = 30)
	public String getCustCode() {
		return this.custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	@Column(name = "Cust_Name", nullable = false, length = 40)
	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Column(name = "Adress", length = 100)
	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Column(name = "Phone1", nullable = false, length = 15)
	public String getPhone1() {
		return this.phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	@Column(name = "Phone2", length = 15)
	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	@Column(name = "Credit_Limit", nullable = false, precision = 10)
	public double getCreditLimit() {
		return this.creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	@Column(name = "Current_Limit", nullable = false, precision = 10)
	public double getCurrentLimit() {
		return this.currentLimit;
	}

	public void setCurrentLimit(double currentLimit) {
		this.currentLimit = currentLimit;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<SalesOrder> getSaleOrders() {
		return this.saleOrders;
	}

	public void setSaleOrders(Set<SalesOrder> saleOrders) {
		this.saleOrders = saleOrders;
	}

}
