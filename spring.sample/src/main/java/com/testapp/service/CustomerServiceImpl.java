package com.testapp.service;

import java.util.List;

import com.testapp.module.Customer;
import com.testapp.repository.CustomerRepository;
import com.testapp.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepo = new HibernateCustomerRepositoryImpl();

	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
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

}
