package com.salesorderapp.hibernate.entity;

import java.math.BigDecimal;

public class CustomerRuntime {
	private BigDecimal creditLimit;
	private BigDecimal currentLimit;

	public CustomerRuntime() {
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public BigDecimal getCurrentLimit() {
		return currentLimit;
	}

	public void setCurrentLimit(BigDecimal currentLimit) {
		this.currentLimit = currentLimit;
	}
}