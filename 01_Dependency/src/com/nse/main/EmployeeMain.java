package com.nse.main;

import com.nse.pojo.Address;
import com.nse.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		//Using Constructor
		// employeeOne - Overloaded Constructor
		Address permanentAddress = new Address("B-212 , Nisarga CHS", "A.B Road", "Mumbai", 400012);
		Employee employeeOne = new Employee(101, "Vivek Gohil", 1000,permanentAddress);

		//Using Setter Method
		// employeeTwo - Setter Method
		Employee employeeTwo = new Employee();
		employeeTwo.setEmployeeId(102);
		employeeTwo.setName("Prathmesh Naik");
		employeeTwo.setSalary(10000);
		
		Address addressTwo = new Address();
		addressTwo.setHouseNumber("B-401 , Jasal Apartment");
		addressTwo.setStreet("Koper Road");
		addressTwo.setCity("Thane");
		addressTwo.setPin(400065);
		
		employeeTwo.setPermanentAddress(addressTwo);

		System.out.println(employeeOne);
		System.out.println(employeeTwo);
	}

}
