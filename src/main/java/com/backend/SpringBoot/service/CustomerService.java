package com.backend.SpringBoot.service;

import java.util.List;

import com.backend.SpringBoot.model.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	
	public Customer getCustomerById(int id);
	
	public void deleteCustomer(int id);
	
	public Customer updateCustomer(int id, Customer customer);
	
	public Customer createCustomer(Customer customer);
	
}
