/**
 * 
 */
package com.salesorderapp.business.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author freakster
 *
 */
@Path("/Products")
public class ProductFeedServices {
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
    public String createCustomer(String prod) {
		//TODO implment business helper class
		ProductHelper ch = new ProductHelper();
		String product = (String) ch.intializeProductEntityBean(prod);
		System.out.println(product);
		return product;
    }
}