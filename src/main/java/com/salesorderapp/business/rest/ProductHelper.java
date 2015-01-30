package com.salesorderapp.business.rest;

import com.salesorderapp.common.util.JSONConverter;
import com.salesorderapp.hibernate.dao.CustomerDAOImpl;
import com.salesorderapp.hibernate.dao.ProductDAOImpl;
import com.salesorderapp.hibernate.entity.Product;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by AGA2 on 1/30/2015.
 */
public class ProductHelper {


    String intializeProductEntityBean(String prod){
        Product product= new Product();
        //ObjectMapper mapper = new ObjectMapper();
        product = (Product) JSONConverter.getEntityObjectFromJSon(prod, product);

        ProductDAOImpl daoPDImpl = new ProductDAOImpl();
        daoPDImpl.addProduct(product);

        System.out.println(product);

        return JSONConverter.getJSONFromEntity(product);

    }
}
