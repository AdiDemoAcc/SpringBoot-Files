package com.backend.SpringBoot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.SpringBoot.model.Customer;
import com.backend.SpringBoot.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public void deleteCustomer(int id) {
		Customer customer = customerRepository.findById(id).get();
		if (customer != null) {
			customerRepository.delete(customer);
		}
	}

	@Override
	public Customer updateCustomer(int id, Customer newcustomer) {
		Customer oldcustomer = customerRepository.findById(id).get();
		if (oldcustomer != null) {
			newcustomer.setCustomerID(id);
			customerRepository.save(newcustomer);
		}
		return newcustomer;
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

}
