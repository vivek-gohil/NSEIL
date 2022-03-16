package com.nse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nse.pojo.Address;
import com.nse.pojo.ClientDetails;
import com.nse.pojo.ContactDetails;

@Configuration
public class SpringConfiguration {

	@Bean
	public Address address() {
//		Address address = new Address();
//		return address;
		return new Address();
	}
	
	@Bean
	public ContactDetails contactDetails() {
		return new ContactDetails();
	}
	
	@Bean
	public ClientDetails clientDetails() {
		return new ClientDetails();
	}
}
