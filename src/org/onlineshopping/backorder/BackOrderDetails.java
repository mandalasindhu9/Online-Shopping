package org.onlineshopping.backorder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="backorder")
public class BackOrderDetails {
	@Id
	@Column(name="backorder_id")
	int backorder_id;
	@Column(name="quantity")
	int quantity;
	@Column(name="item_id")
	int item_id;
	@ManyToOne
	@ForeignKey(name="order_id")
	int order_id;
	public int getBackorder_id() {
		return backorder_id;
	}
	public void setBackorder_id(int backorder_id) {
		this.backorder_id = backorder_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}


}
