package org.onlineshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductDetails {
	
	@Id
	@Column(name="product_id")
	int product_id;
	@Column(name="name")
	String name;
	@Column(name="price")
	double price;
	@Column(name="weight")
	double weight;
	@Column(name="quantity_on_hand")
	int quantity_on_hand;
	@Column(name="reorder_point")
	String reorder_point;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getQuantity_on_hand() {
		return quantity_on_hand;
	}
	public void setQuantity_on_hand(int quantity_on_hand) {
		this.quantity_on_hand = quantity_on_hand;
	}
	public String getReorder_point() {
		return reorder_point;
	}
	public void setReorder_point(String reorder_point) {
		this.reorder_point = reorder_point;
	}
}
