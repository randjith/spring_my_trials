package com.testapp.service;

import java.util.List;

import com.testapp.module.Customer;
import com.testapp.repository.CustomerRepository;

public interface CustomerService {

	List<Customer> findAll();

	void setCustomerRepository(CustomerRepository customerRepo);

}