package com.salesorderapp.business.rest;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author freakster
 *
 */
@Path("/SalesOrders")
public class SalesOrderFeedServices {
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
    public String createCustomer(String prod) {
		//TODO implment business helper class
    	System.out.println(prod);
		return prod;
    }
	
	
}