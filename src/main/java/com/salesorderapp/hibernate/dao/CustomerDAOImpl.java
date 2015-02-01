/**
 * 
 */
package com.salesorderapp.hibernate.dao;

import com.salesorderapp.common.util.HibernateUtil;
import com.salesorderapp.hibernate.entity.Customer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

;

/**
 * @author freakster
 *
 */
public class CustomerDAOImpl implements CustomerDAO{

	public Customer addCustomer(Customer customer) {

		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();

		return customer;
		
	}



	public void removeCustomer(String custCode) {
		// TODO Auto-generated method stub
		
	}

	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public Customer getCustomerDetails(String custCode) {
		
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		Customer customer = (Customer) session.get(Customer.class, custCode);
		return customer;
	}

	public float getCreditLimit(String custCode) {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getCurrentCredit(String custCode) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Customer> getAllCustomerList() {
		Session session = HibernateUtil.getSession();
		List<Customer> customerList = (List<Customer>) session.createQuery("from Customer").list();
		return customerList;
	}

	

}
