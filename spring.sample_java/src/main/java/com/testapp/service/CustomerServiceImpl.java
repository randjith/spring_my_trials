package com.testapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.testapp.module.Customer;
import com.testapp.repository.CustomerRepository;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepo;

	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public CustomerServiceImpl(CustomerRepository customerRepo) {
		System.out.println("Used Constructor Injection");
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

	@Override
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepo) {
		System.out.println("Used setter Injection");
		this.customerRepo = customerRepo;

	}

}
