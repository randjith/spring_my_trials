package com.testapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.testapp.module.Customer;

@Repository("customerRepo")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public HibernateCustomerRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.testapp.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List customers = new ArrayList<Customer>();

		Customer cus = new Customer();
		cus.setFirstName("Ganesh");
		cus.setLastName("Siva");

		customers.add(cus);

		return customers;

	}

}
