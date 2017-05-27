package com.testapp.module;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testapp.service.CustomerService;

public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
