package com.pluralsight.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		//CustomerService customerService = new CustomerServiceImpl();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
		System.out.println(customerService);
		
		CustomerService customerService2 = appContext.getBean("customerService", CustomerService.class);
		System.out.println(customerService2);
		
		System.out.println(customerService.findAll().get(0).getFirstname());
		System.out.println(customerService.findAll().get(0).getLastname());

	}

}
