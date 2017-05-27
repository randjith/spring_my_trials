package com.testapp.repository;

import java.util.List;

import com.testapp.module.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}