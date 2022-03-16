package com.nse.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nse.config.SpringConfiguration;
import com.nse.pojo.Address;
import com.nse.pojo.ClientDetails;

public class AddressMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Address address = applicationContext.getBean("address", Address.class);
		System.out.println(address);
		
		ClientDetails clientDetails = applicationContext.getBean("clientDetails", ClientDetails.class);
		System.out.println(clientDetails);
	}
}
