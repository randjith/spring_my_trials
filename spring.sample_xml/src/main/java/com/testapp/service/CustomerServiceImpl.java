package com.testapp.service;

import java.util.List;

import com.testapp.module.Customer;
import com.testapp.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepo;

	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param customerRepo
	 * 
	 * Constructor Injection
	 */
	public CustomerServiceImpl(CustomerRepository customerRepo) {
		this.customerRepo = customerRepo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.testapp.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

	public void setCustomerRepo(CustomerRepository customerRepo) {
		this.customerRepo = customerRepo;
	}
	
	

}
