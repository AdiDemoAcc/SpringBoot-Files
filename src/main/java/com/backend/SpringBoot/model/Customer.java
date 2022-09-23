package com.backend.SpringBoot.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int CustomerID;
	
	@Column(name = "customer_name")
	private String CustomerName;
	
	@Column(name = "customer_dob")
	private java.sql.Date DOB;
	
	@Column(name = "customer_contact")
	private String CustomerContact;
	
	@Column(name = "customer_address")
	private String CustomerAddress;
	
	@Column(name = "customer_emailid")
	private String CustomerEmailID;
	
	@Column(name = "customer_gender")
	public String CustomerGender;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(int customerID, String customerName, java.sql.Date dOB, String customerContact, String customerAddress,
			String customerEmailID, String customerGender) {
		CustomerID = customerID;
		CustomerName = customerName;
		DOB = dOB;
		CustomerContact = customerContact;
		CustomerAddress = customerAddress;
		CustomerEmailID = customerEmailID;
		CustomerGender = customerGender;
	}


	public int getCustomerID() {
		return CustomerID;
	}


	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}


	public String getCustomerName() {
		return CustomerName;
	}


	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}


	public java.sql.Date getDOB() {
		return DOB;
	}


	public void setDOB(java.sql.Date dOB) {
		DOB = dOB;
	}


	public String getCustomerContact() {
		return CustomerContact;
	}


	public void setCustomerContact(String customerContact) {
		CustomerContact = customerContact;
	}


	public String getCustomerAddress() {
		return CustomerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}


	public String getCustomerEmailID() {
		return CustomerEmailID;
	}


	public void setCustomerEmailID(String customerEmailID) {
		CustomerEmailID = customerEmailID;
	}
	
	

	public String getCustomerGender() {
		return CustomerGender;
	}


	public void setCustomerGender(String customerGender) {
		CustomerGender = customerGender;
	}


	@Override
	public String toString() {
		return "Customer [CustomerID=" + CustomerID + ", CustomerName=" + CustomerName + ", DOB=" + DOB
				+ ", CustomerContact=" + CustomerContact + ", CustomerAddress=" + CustomerAddress + ", CustomerEmailID="
				+ CustomerEmailID + "CustomerGender= "+ CustomerGender +"]";
	}
	
	
}
