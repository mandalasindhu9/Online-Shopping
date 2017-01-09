package org.onlineshopping.paymentmethod;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="component")
public class PaymentMethodDetails {
	@Id
	@Column(name="paymentMethod_id")
	int paymentMethod_id;
	@Column(name="card_type")
	String card_type;
	@Column(name="owner")
	String owner;
	@Column(name="cardnumber")
	int cardnumber;
	@Column(name="exprires")
	int exprires;
	@Column(name="cvv")
	int cvv;
	@ManyToOne
	@ForeignKey(name="customer_id")
	int customer_id;
public int getPaymentMethod_id() {
	return paymentMethod_id;
}
public void setPaymentMethod_id(int paymentMethod_id) {
	this.paymentMethod_id = paymentMethod_id;
}
public String getCard_type() {
	return card_type;
}
public void setCard_type(String card_type) {
	this.card_type = card_type;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public int getCardnumber() {
	return cardnumber;
}
public void setCardnumber(int cardnumber) {
	this.cardnumber = cardnumber;
}
public int getExprires() {
	return exprires;
}
public void setExprires(int exprires) {
	this.exprires = exprires;
}
public int getCvv() {
	return cvv;
}
public void setCvv(int cvv) {
	this.cvv = cvv;
}
public int getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}

}
