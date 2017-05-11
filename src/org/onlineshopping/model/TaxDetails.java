package org.onlineshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="zip")
public class TaxDetails {
	
	@Id
	@Column(name="tax_id")
	int tax_id;
	@Column(name="state")
	String state;
	@Column(name="percent")
	String percent;
	public int getTax_id() {
		return tax_id;
	}
	public void setTax_id(int tax_id) {
		this.tax_id = tax_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPercent() {
		return percent;
	}
	public void setPercent(String percent) {
		this.percent = percent;
	}
	
	

}
