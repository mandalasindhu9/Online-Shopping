package com.onlineshopping.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;
import org.onlineshopping.model.*;

@Repository
public class StockDAO extends HibernateDaoSupport {
	
	@Autowired
	private SessionFactory session;
	
	public void updateStock(ComponentDetails componentDetails){
		
		session.getCurrentSession().update(componentDetails);
		
	}
}
