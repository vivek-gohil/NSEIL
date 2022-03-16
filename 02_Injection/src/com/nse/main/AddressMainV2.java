package com.nse.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nse.pojo.Address;

public class AddressMainV2 {

	public static void main(String[] args) {
		System.out.println("Main Start");

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Spring factory is created");

		Address addressOne = applicationContext.getBean("permanentAddress", Address.class);
		System.out.println("Address object injected");

		System.out.println(addressOne);
		System.out.println("HashCode of addressOne :: " + addressOne.hashCode());

		System.out.println("---------------------------------");
		System.out.println("Injecting another object of address");

		Address addressTwo = applicationContext.getBean("permanentAddress", Address.class);
		System.out.println("Address object injected");

		System.out.println(addressTwo);
		System.out.println("HashCode of addressTwo :: " + addressTwo.hashCode());
		System.out.println("Main End");
	}

}
