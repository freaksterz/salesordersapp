/**
 * 
 */
package com.salesorderapp.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.salesorderapp.common.util.HibernateUtil;
import com.salesorderapp.hibernate.entity.Customer;

/**
 * @author freakster
 *
 */
public class CustomerDAOImpl implements CustomerDAO{

	public Customer addCustomer(Customer customer) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		  
        session.beginTransaction();
        
        session.save(customer);
        
        session.getTransaction().commit();
        
        
		
		return customer;
		// TODO Auto-generated method stub
		
	}

	public void removeCustomer(String custCode) {
		// TODO Auto-generated method stub
		
	}

	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public void getCustomerDetails(String custCode) {
		// TODO Auto-generated method stub
		
	}

	public float getCreditLimit(String custCode) {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getCurrentCredit(String custCode) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Customer> getAllCustomerList(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
