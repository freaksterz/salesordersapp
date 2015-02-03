/**
 * 
 */
package com.salesorderapp.business.rest;

import javax.ws.rs.*;
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
    @GET
	@Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getListOfCustomers() {

        CustomerHelper ch = new CustomerHelper();
        String listOfCustomers = (String) ch.getCustomerDetails();
		System.out.println("listOfCustomers = " + listOfCustomers);
		return listOfCustomers;

    }

}
