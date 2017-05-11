package org.onlineshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="component")
public class ComponentDetails {
	@Id
	@Column(name="component_id")
	int component_id;
	@Column(name="name")
	String name;
	@Column(name="cost")
	double cost;
	@Column(name="quantity_on_hand")
	int quantity_on_hand;
	@Column(name="reorder_point")
	String reorder_point;
	@Column(name="unitOfMeasure")
	String unitOfMeasure;
	@Column(name="description")
	String description;
	@ManyToOne
	@ForeignKey(name="vendor_id")
	int vendor_id;
	
	public int getComponent_id() {
		return component_id;
	}
	public void setComponent_id(int component_id) {
		this.component_id = component_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
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
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}


}
