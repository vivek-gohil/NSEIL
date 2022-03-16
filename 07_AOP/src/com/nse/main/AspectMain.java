package com.nse.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nse.main.pojo.Employee;

public class AspectMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		Employee employee = applicationContext.getBean("employee", Employee.class);

		employee.setEmployeeId(101);

		System.out.println(employee);
	}

}
