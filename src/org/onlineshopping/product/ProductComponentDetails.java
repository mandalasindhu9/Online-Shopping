package org.onlineshopping.product;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="product_component_id")
public class ProductComponentDetails {

	@ManyToOne
	@ForeignKey(name="component_id")
	int component_id;
	@ManyToOne
	@ForeignKey(name="product_id")
	int product_id;
	public int getComponent_id() {
		return component_id;
	}
	public void setComponent_id(int component_id) {
		this.component_id = component_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

}
