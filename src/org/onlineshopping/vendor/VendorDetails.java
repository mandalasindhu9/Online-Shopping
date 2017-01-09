package org.onlineshopping.vendor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vendor")
public class VendorDetails {
	
	@Id
	@Column(name="vendor_id")
	int vendor_id;
	@Column(name="name")
	String name;
	@Column(name="address")
	String address;
	@Column(name="contact")
	int phone_number;
	@Column(name="tax_id")
	int contact;
	@Column(name="atl_phone")
	int atl_phone;
	@Column(name="fax")
	int fax;
	@Column(name="email")
	String email;
	@Column(name="account_number")
	int account_number;
	@Column(name="description")
	String description;
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getAtl_phone() {
		return atl_phone;
	}
	public void setAtl_phone(int atl_phone) {
		this.atl_phone = atl_phone;
	}
	public int getFax() {
		return fax;
	}
	public void setFax(int fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
