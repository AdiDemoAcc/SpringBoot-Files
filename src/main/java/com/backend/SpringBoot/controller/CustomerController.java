package com.backend.SpringBoot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.backend.SpringBoot.model.Customer;
import com.backend.SpringBoot.service.CustomerService;

@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/create")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer)
	{
		return new ResponseEntity<Customer>(customerService.createCustomer(customer) , HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Customer>> getAllCustomers()
	{
		return new ResponseEntity<List<Customer>>(customerService.getAllCustomers(),HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Customer> getCustomerByID(@PathVariable int id)
	{
		return new ResponseEntity<Customer>(customerService.getCustomerById(id),HttpStatus.OK);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<String> deleteCustomerById(@PathVariable int id)
	{
		customerService.deleteCustomer(id);
		return new ResponseEntity<String>("Customer Record Deleted",HttpStatus.OK);
	}
	
	@PostMapping("/update/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable int id,@RequestBody Customer customer)
	{
		return new ResponseEntity<Customer>(customerService.updateCustomer(id, customer),HttpStatus.OK);
	}
}
