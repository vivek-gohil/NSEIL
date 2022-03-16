package com.nse.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nse.pojo.Address;
import com.nse.pojo.Employee;

public class DependencyInjectionMain {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		// Injection
		Address permanentAddress = applicationContext.getBean("permanentAddress", Address.class);
		System.out.println(permanentAddress);

		// Injection
		Employee employee = applicationContext.getBean("employee", Employee.class);
		System.out.println(employee);
	}
}
