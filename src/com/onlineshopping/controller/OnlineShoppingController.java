package com.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.onlineshopping.model.*;
import com.onlineshopping.service.*;

@Controller
public class OnlineShoppingController {
	
	private OnlineShoppingService onlineShopping;
	
	@Autowired(required=true)
	@Qualifier(value="onlineShopping")
	public void setOnlineShoppingService(OnlineShoppingService os){
		this.onlineShopping = os;
	}
	
		@RequestMapping(value= "/customerDetails/add", method = RequestMethod.POST)
		public String addCustomer(@ModelAttribute("customerDetails") CustomerDetails cd){
			
			if(cd.getCustomer_id() == 0){
				this.onlineShopping.addCustomer(cd);
			}
			
			return "redirect:/customerDetails";
			}
		
		@RequestMapping("/remove/{customer_id}")
	    public String removeCustomer(@PathVariable("customer_id") CustomerDetails cd){
			
	        this.onlineShopping.deleteCustomer(cd);
	        return "redirect:/customerDetails";
	    }
		
		@RequestMapping(value= "/componentDetails/add", method = RequestMethod.POST)
		public String updateStock(@ModelAttribute("componentDetails") ComponentDetails cd){
	
			if(cd.getComponent_id() == 0){
				this.onlineShopping.updateStock(cd);
			}
			
			return "redirect:/componentDetails";
			}
		
		@RequestMapping(value= "/shipmentOrderDetails/add", method = RequestMethod.POST)
		public String addShipmentOrder(@ModelAttribute("shipmentOrderDetails") ShipmentOrderDetails sod){
	
			if(sod.getAddress_id() == 0){
				this.onlineShopping.addShipmentInfo(sod);
			}
			
			return "redirect:/shipmentOrderDetails";
			}
		@RequestMapping(value= "/orderProductDetails/add", method = RequestMethod.POST)
		public String addProductDetails(@ModelAttribute("orderProductDetails") OrderProductDetails opd){
	
			if(opd.getOrder_id() == 0){
				this.onlineShopping.addOrderDetails(opd);
			}
			
			return "redirect:/orderProductDetails";
			}
		
		@RequestMapping(value= "/paymentMethodDetails/add", method = RequestMethod.POST)
		public String addCardDetails(@ModelAttribute("paymentMethodDetails") PaymentMethodDetails pmd){
	
			if(pmd.getPaymentMethod_id()==0){
				this.onlineShopping.addCardDetails(pmd);
			}
			
			return "redirect:/paymentMethodDetails";
			}
		}
