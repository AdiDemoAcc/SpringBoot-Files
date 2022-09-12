package com.backend.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.SpringBoot.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
		
}
