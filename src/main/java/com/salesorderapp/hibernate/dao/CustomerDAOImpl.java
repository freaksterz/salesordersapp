/**
 * 
 */
package com.salesorderapp.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.salesorderapp.common.util.HibernateUtil;
import com.salesorderapp.hibernate.entity.Customer;
import com.salesorderapp.hibernate.dao.CustomerDAO;;

/**
 * @author freakster
 *
 */
public class CustomerDAOImpl implements CustomerDAO{

	public Customer addCustomer(Customer customer) {
		
		/*Session session = HibernateUtil.getSessionFactory().openSession();
		  
        session.beginTransaction();
        
        session.save(customer);
        
        session.getTransaction().commit();
        */
		Session session = getSession();
		
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		//session.close();
		
	
		
		return customer;
		
	}

	/**
	 * @return Sesssion
	 * @
	 */
	private Session getSession() {
		Session session = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();	
		}catch (HibernateException he){
			session = HibernateUtil.getSessionFactory().openSession();
		}
		return session;
	}

	public void removeCustomer(String custCode) {
		// TODO Auto-generated method stub
		
	}

	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public Customer getCustomerDetails(String custCode) {
		
		Session session = getSession();
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
		Session session = getSession();
		List<Customer> customerList = (List<Customer>) session.createQuery("from Customer").list();
		return customerList;
	}

	

}
