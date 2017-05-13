package com.onlineshopping.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import org.onlineshopping.model.*;

@Repository
public class TransactionDAO extends HibernateDaoSupport {
	
	@Autowired
	private SessionFactory session;
	
	public List<ProductDetails> productDetails(ProductDetails product) {
	
		List<ProductDetails> productDetails = session.getCurrentSession().createQuery("from product where product_id=" + product.getProduct_id()).list();
		
		for(ProductDetails p:productDetails){
			System.out.println("Details: "+p);
		}
		return productDetails;	
	}
	
	public void addShipmentInformation(ShipmentOrderDetails ship){
		
		session.getCurrentSession().saveOrUpdate(ship);
		
	}
	
	public void addOrderDetails(OrderProductDetails order){
		
		session.getCurrentSession().saveOrUpdate(order);
	}

	public void addCardDetails(PaymentMethodDetails payDetails){
		
		session.getCurrentSession().saveOrUpdate(payDetails);
	}
}
