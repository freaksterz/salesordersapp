/**
 * 
 */
package com.salesapp.business.rest;

import java.io.IOException;
import java.math.BigDecimal;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.salesorderapp.hibernate.entity.Customer;

/**
 * @author freakster
 *
 */
public class CustomerHelper {

	
	public String intializeCustomerEntityBean(String cust) {
		Gson gs = new Gson();
		Customer customer = new Customer();
		/*JSONObject json =  new JSONObject(cust);
		if("".equals(json.get("creditLimit"))){
			json.put("creditLimit", BigDecimal.ZERO);
		}
		if("".equals(json.get("currentLimit"))){
			json.put("creditLimit", BigDecimal.ZERO);
		}*/
		
		
		  GsonBuilder gb = new GsonBuilder();
		    gb.registerTypeAdapter(BigDecimal.class, new TypeAdapter<BigDecimal>() {

		        @Override
		        public BigDecimal read(JsonReader reader) throws IOException {
		            if (reader.peek() == JsonToken.NULL) {
		                reader.nextNull();
		                return null;
		            }
		            	String stringValue = reader.nextString();
		            try {
		            	 String filterString = stringValue.replaceAll(",","");
		            	 BigDecimal value = new BigDecimal(filterString);
		            	//BigDecimal value = BigDecimal.valueOf(stringValue);
		                return value;
		            } catch (NumberFormatException e) {
		                return BigDecimal.ZERO;
		            }
		        }

		       /* @Override
		        public void write(JsonWriter writer,  value) throws IOException {
		            if (value == null) {
		                writer.nullValue();
		                return;
		            }
		            writer.value(value);
		        }*/

				@Override
				public void write(JsonWriter out, BigDecimal value)
						throws IOException {
					if (value == null) {
		                out.nullValue();
		                return;
		            }
		            out.value(value);
					
				}

		    });
		customer = gs.fromJson(cust, Customer.class);
		
		System.out.println(customer);
		
		String custFromDB = gs.toJson(customer);
		
		return custFromDB;
	}
	
}
