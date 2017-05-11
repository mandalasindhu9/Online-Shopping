package com.onlineshopping.dao;

import org.hibernate.SessionFactory;
import org.onlineshopping.model.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import org.onlineshopping.model.*;

@Repository
public class CustomerDAO extends HibernateDaoSupport {

	@Autowired
	private SessionFactory sessionFactory;

	public void addCustomer(CustomerDetails customer) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	public int getCustomerDetails(int customer_id) {

		return ((CustomerDetails) sessionFactory.getCurrentSession()).getCustomer_id();
	}

	public void deleteCustomerDetails(CustomerDetails customer){
		
		sessionFactory.getCurrentSession().createQuery("DELETE from customer where customer_id = "+customer.getCustomer_id()).executeUpdate();
	}
}
