package com.backend.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.SpringBoot.model.Customer;
import com.backend.SpringBoot.service.CustomerService;

@RestController
@RequestMapping("/demoapi/vers1")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	public ResponseEntity<Customer> createCustomer(Customer customer)
	{
		return new ResponseEntity<Customer>(customerService.createCustomer(customer) , HttpStatus.CREATED);
	}
	
	public ResponseEntity<List<Customer>> getAllCustomers()
	{
		return new ResponseEntity<List<Customer>>(customerService.getAllCustomers(),HttpStatus.OK);
	}
	
	public ResponseEntity<Customer> getCustomerByID(int id)
	{
		return new ResponseEntity<Customer>(customerService.getCustomerById(id),HttpStatus.OK);
	}
	
	public ResponseEntity<String> deleteCustomerById(int id)
	{
		customerService.deleteCustomer(id);
		return new ResponseEntity<String>("Customer Record Deleted",HttpStatus.OK);
	}
	
	public ResponseEntity<Customer> updateCustomer(int id, Customer customer)
	{
		return new ResponseEntity<Customer>(customerService.updateCustomer(id, customer),HttpStatus.OK);
	}
}
