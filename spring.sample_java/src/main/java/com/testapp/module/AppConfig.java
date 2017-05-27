package com.testapp.module;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.testapp.repository.CustomerRepository;
import com.testapp.repository.HibernateCustomerRepositoryImpl;
import com.testapp.service.CustomerService;
import com.testapp.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.testapp"})
public class AppConfig {

	/*
	

	@Bean(name = "customerService")
	public CustomerService getCustomerService() {

//		CustomerService customerService = new CustomerServiceImpl(getCustomerRepository());
		
		CustomerService customerService = new CustomerServiceImpl();
//		customerService.setCustomerRepository(getCustomerRepository());

		return customerService;

	}

	@Bean(name = "customerRepo")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();

	}
*/
}
