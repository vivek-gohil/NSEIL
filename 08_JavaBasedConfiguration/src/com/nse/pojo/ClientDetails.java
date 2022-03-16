package com.nse.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope(scopeName = "prototype")
public class ClientDetails {
	private int clientId;
	private String companyName;
	private String clientStatus;
	
	private ContactDetails contactDetails;

	public ClientDetails() {
		System.out.println("Clientdetails default constrcutor");
	}

	public ClientDetails(int clientId, String companyName, String clientStatus) {
		super();
		this.clientId = clientId;
		this.companyName = companyName;
		this.clientStatus = clientStatus;

		System.out.println("Clientdetails overloaded constrcutor without ContactDetails parameter");
	}

	public ClientDetails(int clientId, String companyName, String clientStatus, ContactDetails contactDetails) {
		super();
		this.clientId = clientId;
		this.companyName = companyName;
		this.clientStatus = clientStatus;
		this.contactDetails = contactDetails;
		System.out.println("Clientdetails overloaded constrcutor");
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
		System.out.println("setClientId called");
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		System.out.println("setCompanyName called");
	}

	public String getClientStatus() {
		return clientStatus;
	}

	public void setClientStatus(String clientStatus) {
		this.clientStatus = clientStatus;
		System.out.println("setClientStatus called");
	}

	public ContactDetails getContactDetails() {
		return contactDetails;

	}
	
	@Autowired
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
		System.out.println("setContactDetails called");
	}

	@Override
	public String toString() {
		return "Clientdetails [clientId=" + clientId + ", companyName=" + companyName + ", clientStatus=" + clientStatus
				+ ", contactDetails=" + contactDetails + "]";
	}

}
