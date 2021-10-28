package com.yadni8.dealers.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DealerList")
public class Dealer {
	
	@Id
	private int did;
	private String dealerName;
	private String emailId;
	private String mobileNumber;
	private String password;
	private String location;
	
	public Dealer() {
		
	}

	

	public Dealer(int did, String dealerName, String emailId, String mobileNumber, String password, String location) {
		super();
		this.did = did;
		this.dealerName = dealerName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.location = location;
	}



	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
