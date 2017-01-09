package org.onlineshopping.shipmentorder;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="shipment_order")
public class ShipmentOrderDetails {
	
	@Id
	@Column(name="order_id")
	int order_id;
	@Column(name="dateOrdered")
	Date dateOrdered;
	@Column(name="dateShipped")
	Date dateShipped;
	@Column(name="total")
	double total;
	@Column(name="tax")
	int tax;
	@ManyToOne
	@ForeignKey(name="tax_id")
	int tax_id;
	@ManyToOne
	@ForeignKey(name="customer_id")
	int customer_id;
	@ManyToOne
	@ForeignKey(name="address_id")
	int address_id;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public Date getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	public Date getDateShipped() {
		return dateShipped;
	}
	public void setDateShipped(Date dateShipped) {
		this.dateShipped = dateShipped;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getTax_id() {
		return tax_id;
	}
	public void setTax_id(int tax_id) {
		this.tax_id = tax_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

}
