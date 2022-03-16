package com.nse.main;

import com.nse.pojo.Address;

public class AddressMain {
	public static void main(String[] args) {
		//Calling overloaded/parameterized constructor
		Address addressOne = new Address("B-212 , Nisarga CHS", "A.B Road", "Mumbai", 400012);
		
		//Calling Setter
		Address addressTwo = new Address();
		addressTwo.setHouseNumber("B-401 , Jasal Apartment");
		addressTwo.setStreet("Koper Road");
		addressTwo.setCity("Thane");
		addressTwo.setPin(400065);
		
		System.out.println(addressOne);
		System.out.println(addressTwo);
	}
}
