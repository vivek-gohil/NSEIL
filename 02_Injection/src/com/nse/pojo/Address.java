package com.nse.pojo;

public class Address {
	private String houseNumber;
	private String street;
	private String city;
	private int pin;

	public Address() {
		System.out.println("Default Constructor Of Address");
	}

	public Address(String houseNumber, String street, String city, int pin) {
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.pin = pin;
		System.out.println("Overloaded Constrcutor Of Address");
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		System.out.println("setHouseNumber called");
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		System.out.println("setStreet called");
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("setCity called");
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		System.out.println("setPin called");
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}

}
