package org.onlineshopping.shipmentorder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="shipmentorder_product_int")
public class OrderProductDetails {
	
	@Column(name="quantity")
	int quantity;
	@ManyToOne
	@ForeignKey(name="order_id")
	int order_id;
	@ManyToOne
	@ForeignKey(name="product_id")
	int product_id;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

}
