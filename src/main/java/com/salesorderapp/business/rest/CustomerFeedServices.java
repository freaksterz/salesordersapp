/**
 * 
 */
package com.salesorderapp.business.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

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
		String customer = (String) ch.intializeCustomerEntityBean(cust);
		
    	//System.out.println(customer);
		return customer;
    }
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getCustomer(@QueryParam("cust_code")String cust_code) {
		
		CustomerHelper ch = new CustomerHelper();
		String customer = (String) ch.getCustomerDetails(cust_code);
		
		return customer;
		
	}
}
