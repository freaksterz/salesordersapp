/**
 * 
 */
package com.salesorderapp.business.rest;


import com.salesorderapp.common.util.JSONConverter;
import com.salesorderapp.hibernate.dao.CustomerDAOImpl;
import com.salesorderapp.hibernate.entity.Customer;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author freakster
 *
 */
public class CustomerHelper {

	String custFromDB = null;
	
	public String intializeCustomerEntityBean(String cust) {
	
		//Customer customer = new Customer();
		Customer customer = new Customer();
		customer = (Customer) JSONConverter.getEntityObjectFromJSon(cust, customer);
		CustomerDAOImpl daoImpl = new CustomerDAOImpl();
		daoImpl.addCustomer(customer);
		System.out.println(customer);
		return JSONConverter.getJSONFromEntity(customer);

	}

	public String getCustomerDetails(String cust_code) {
		CustomerDAOImpl daoImpl = new CustomerDAOImpl();
		ObjectMapper mapper = new ObjectMapper();
		Customer customer = daoImpl.getCustomerDetails(cust_code);
		String customerJSON = JSONConverter.getJSONFromEntity(customer);
		return customerJSON;
	}
	
}
