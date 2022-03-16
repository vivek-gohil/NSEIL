package com.nse.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class ContactDetails {
	private int contactId;
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String email;
	private String contactType;
	private String contactStatus;

	public ContactDetails() {
		System.out.println("ContactDetails default constrcutor");
	}

	public ContactDetails(int contactId, String firstName, String lastName, String contactNumber, String email,
			String contactType, String contactStatus) {
		super();
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.contactType = contactType;
		this.contactStatus = contactStatus;
		System.out.println("ContactDetails overloaded constrcutor");
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
		System.out.println("setContactId called");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println("setFirstName called");
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println("setLastName called");
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
		System.out.println("setContactNumber called");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println("setEmail called");
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
		System.out.println("setContactType called");
	}

	public String getContactStatus() {
		return contactStatus;
	}

	public void setContactStatus(String contactStatus) {
		this.contactStatus = contactStatus;
		System.out.println("setContactStatus called");
	}

	@Override
	public String toString() {
		return "ContactDetails [contactId=" + contactId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", contactNumber=" + contactNumber + ", email=" + email + ", contactType=" + contactType
				+ ", contactStatus=" + contactStatus + "]";
	}

}
