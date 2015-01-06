/**
 * 
 */
package com.salesorderapp.common.util;

import java.lang.reflect.Type;
import java.math.BigDecimal;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.salesorderapp.hibernate.entity.CustomerRuntime;

/**
 * @author freakster
 *
 */
public class CustomerRuntimeTypeAdaptor implements JsonDeserializer<CustomerRuntimeTypeAdaptor>,JsonSerializer<CustomerRuntimeTypeAdaptor>{

	public JsonElement serialize(CustomerRuntime src,
			Type typeOfSrc, JsonSerializationContext context) {
		// TODO Auto-generated method stub
		return new JsonPrimitive(src.getCreditLimit());
	}

	public CustomerRuntimeTypeAdaptor deserialize(JsonElement json,
			Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		BigDecimal runtime;
        try
        {
            runtime = json.getAsBigDecimal();
            
        }
        catch (NumberFormatException e)
        {
           /// return new CustomerRuntime();
        	return null;
        }
        return new CustomerRuntimeTypeAdaptor();
	}

	public JsonElement serialize(CustomerRuntimeTypeAdaptor src,
			Type typeOfSrc, JsonSerializationContext context) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
