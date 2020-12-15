package com.mywork.begin.transactiondataproducerapp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer{

	@JsonProperty("shipping")
	private Shipping shipping;

	@JsonProperty("phoneNumbers")
	private List<Object> phoneNumbers;

	@JsonProperty("authentication")
	private Authentication authentication;

	public void setShipping(Shipping shipping){
		this.shipping = shipping;
	}

	public Shipping getShipping(){
		return shipping;
	}

	public void setPhoneNumbers(List<Object> phoneNumbers){
		this.phoneNumbers = phoneNumbers;
	}

	public List<Object> getPhoneNumbers(){
		return phoneNumbers;
	}

	public void setAuthentication(Authentication authentication){
		this.authentication = authentication;
	}

	public Authentication getAuthentication(){
		return authentication;
	}

	@Override
 	public String toString(){
		return 
			"Customer{" + 
			"shipping = '" + shipping + '\'' + 
			",phoneNumbers = '" + phoneNumbers + '\'' + 
			",authentication = '" + authentication + '\'' + 
			"}";
		}
}