package com.onlineshopping.service;

import java.util.List;

import org.onlineshopping.model.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.onlineshopping.dao.CustomerDAO;
import com.onlineshopping.dao.StockDAO;
import com.onlineshopping.dao.TransactionDAO;

@Service
public class OnlineShoppingService {
	
	private CustomerDAO customerDAO;
	private StockDAO stockDAO;
	private TransactionDAO transDAO;
	
	public void setPersonDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}


	@Transactional
	public void addCustomer(CustomerDetails customer) {
		this.customerDAO.addCustomer(customer);
	}

	@Transactional
	public void deleteCustomer(CustomerDetails customer){
		this.customerDAO.deleteCustomerDetails(customer);
	}
	
	@Transactional
	public CustomerDetails getCustomer(int customer_id){
		return this.customerDAO.getCustomerDetails(customer_id);
	}
	
	@Transactional
	public void updateStock(ComponentDetails stock){
		this.stockDAO.updateStock(stock);
	}
	
	@Transactional
	public void addShipmentInfo(ShipmentOrderDetails ship){
		this.transDAO.addShipmentInformation(ship);
	}
	

	@Transactional
	public void addOrderDetails(OrderProductDetails order){
		this.transDAO.addOrderDetails(order);
	}
	

	@Transactional
	public void addCardDetails(PaymentMethodDetails payDetails){
		this.transDAO.addCardDetails(payDetails);
	}
	
	@Transactional
	public List<ProductDetails> productDetails(ProductDetails product){
		return this.transDAO.productDetails(product);
	}
}
