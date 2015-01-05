/**
 * 
 */
package com.salesapp.business.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.salesorderapp.hibernate.entity.Customer;





/**
 * @author freakster
 *
 */
@Path("/Customers")
public class CustomerFeedServices {
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
    public String createCustomer(String cust) {
		CustomerHelper ch = new CustomerHelper();
		Customer customer = ch.intializeCustomerEntityBean(cust);
    	//System.out.println(customer);
		return null;
    }

}
