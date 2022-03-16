package com.nse.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nse.pojo.ClientDetails;
import com.nse.pojo.ContactDetails;

public class SetterInjectionMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		ContactDetails contactDetails = applicationContext.getBean("contactDetails", ContactDetails.class);
		System.out.println(contactDetails);
		
		ClientDetails clientDetails = applicationContext.getBean("clientDetails",ClientDetails.class);
		System.out.println(clientDetails);

	}
}
