/**
 * 
 */
package com.salesorderapp.hibernate.dao;

import java.util.List;

import com.salesorderapp.hibernate.entity.Product;

/**
 * @author freakster
 *
 */
public interface ProductDAO {
   //TODO define custom Exception handling for the below methods
   //TODO implement generic DAO 
	void addProduct(Product product) ;
	void removeProduct(String prodCode);
	void updateProduct(Product product);
	Product getProdcutDetail(String prodCode);
	List<Product> getAllProductList(Product product);
	double getProductPrice(String prodCode);
	
}
