package com.nse.pojo;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	private Address permanentAddress;

	public Employee() {
		System.out.println("Default Constructor Of Employee");
	}

	public Employee(int employeeId, String name, double salary, Address permanentAddress) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.permanentAddress = permanentAddress;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", permanentAddress="
				+ permanentAddress + "]";
	}

}