/**
 * 
 */
package com.salesapp.business.rest;

import com.google.gson.Gson;
import com.salesorderapp.hibernate.entity.Customer;

/**
 * @author freakster
 *
 */
public class CustomerHelper {

	
	public Customer intializeCustomerEntityBean(String cust) {
		Gson gs = new Gson();
		Customer customer = new Customer();
		customer = gs.fromJson(cust, Customer.class);
		
		System.out.println(customer);
		
		
		
		return customer;
	}
	
}
