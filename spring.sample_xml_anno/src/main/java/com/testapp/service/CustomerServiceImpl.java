package com.testapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.module.Customer;
import com.testapp.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

//	@Autowired
	private CustomerRepository customerRepo ;

	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepo) {
		System.out.println("Constructor injection used with autowiring...");
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

	/*@Autowired
	public void setCustomerRepo(CustomerRepository customerRepo) {
		System.out.println("Setter injection used with autowiring...");
		this.customerRepo = customerRepo;
	}*/

}
