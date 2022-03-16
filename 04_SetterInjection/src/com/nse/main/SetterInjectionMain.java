package com.nse.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nse.pojo.ClientDetails;

public class SetterInjectionMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		ClientDetails clientDetails = applicationContext.getBean("clientDetails", ClientDetails.class);

		System.out.println(clientDetails);
	}

}
