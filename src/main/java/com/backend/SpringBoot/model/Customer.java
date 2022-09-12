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
	private Date DOB;
	
	@Column(name = "customer_contact")
	private String CustomerContact;
	
	@Column(name = "customer_address")
	private String CustomerAddress;
	
	@Column(name = "customer_emailid")
	private String CustomerEmailID;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(int customerID, String customerName, Date dOB, String customerContact, String customerAddress,
			String customerEmailID) {
		super();
		CustomerID = customerID;
		CustomerName = customerName;
		DOB = dOB;
		CustomerContact = customerContact;
		CustomerAddress = customerAddress;
		CustomerEmailID = customerEmailID;
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


	public Date getDOB() {
		return DOB;
	}


	public void setDOB(Date dOB) {
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


	@Override
	public String toString() {
		return "Customer [CustomerID=" + CustomerID + ", CustomerName=" + CustomerName + ", DOB=" + DOB
				+ ", CustomerContact=" + CustomerContact + ", CustomerAddress=" + CustomerAddress + ", CustomerEmailID="
				+ CustomerEmailID + "]";
	}
	
	
}
