/**
 * 
 */
package com.salesorderapp.business.rest;


import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.salesorderapp.hibernate.dao.CustomerDAOImpl;
import com.salesorderapp.hibernate.entity.Customer;

/**
 * @author freakster
 *
 */
public class CustomerHelper {

	String custFromDB = null;
	
	public String intializeCustomerEntityBean(String cust) {
		// start of jackson example
		Customer customer = null;
		ObjectMapper mapper = new ObjectMapper();
		 customer = getCustomerFromJson(cust, customer, mapper);
		
		 CustomerDAOImpl daoImpl = new CustomerDAOImpl();
		 daoImpl.addCustomer(customer);
		 
		System.out.println(customer);
		
		return getJSONCustomer(customer, mapper);

	}

	/**
	 * @param customer
	 * @param mapper
	 * @return
	 */
	private String getJSONCustomer(Customer customer, ObjectMapper mapper) {
		String json =null;
		
	      try
	      {
	    	  json = mapper.writeValueAsString(customer);
	      } catch (JsonGenerationException e)
	      {
	         e.printStackTrace();
	      } catch (JsonMappingException e)
	      {
	         e.printStackTrace();
	      } catch (IOException e)
	      {
	         e.printStackTrace();
	      }
		 
	      System.out.println(json);
	      return json;
	}

	/**
	 * @param cust
	 * @param customer
	 * @param mapper
	 * @return
	 */
	private Customer getCustomerFromJson(String cust, Customer customer,
			ObjectMapper mapper) {
		try
	      {
	        customer = mapper.readValue(cust, Customer.class);
	      } catch (JsonGenerationException e)
	      {
	         e.printStackTrace();
	      } catch (JsonMappingException e)
	      {
	         e.printStackTrace();
	      } catch (IOException e)
	      {
	         e.printStackTrace();
	      }
		return customer;
	}
	
}
