package com.mywork.begin.transactiondataproducerapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Shipping{

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("phoneNumber")
	private PhoneNumber phoneNumber;

	@JsonProperty("address")
	private Address address;

	@JsonProperty("receiptEmail")
	private String receiptEmail;

	@JsonProperty("recipientName")
	private String recipientName;

	@JsonProperty("email")
	private String email;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public PhoneNumber getPhoneNumber(){
		return phoneNumber;
	}

	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		return address;
	}

	public void setReceiptEmail(String receiptEmail){
		this.receiptEmail = receiptEmail;
	}

	public String getReceiptEmail(){
		return receiptEmail;
	}

	public void setRecipientName(String recipientName){
		this.recipientName = recipientName;
	}

	public String getRecipientName(){
		return recipientName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"Shipping{" + 
			"firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",address = '" + address + '\'' + 
			",receiptEmail = '" + receiptEmail + '\'' + 
			",recipientName = '" + recipientName + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}