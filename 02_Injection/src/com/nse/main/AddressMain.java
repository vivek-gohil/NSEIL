package com.nse.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nse.pojo.Address;

public class AddressMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		Address addressOne = applicationContext.getBean("permanentAddress", Address.class);

		System.out.println(addressOne);
	}

}
