package com.testapp.module;

import com.testapp.service.CustomerService;
import com.testapp.service.CustomerServiceImpl;

public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
