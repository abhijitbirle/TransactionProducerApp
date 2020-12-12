package com.mywork.begin.TransactionDataProducerApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address{

	@JsonProperty("country")
	private String country;

	@JsonProperty("city")
	private String city;

	@JsonProperty("addressLine1")
	private String addressLine1;

	@JsonProperty("postCode")
	private String postCode;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setAddressLine1(String addressLine1){
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine1(){
		return addressLine1;
	}

	public void setPostCode(String postCode){
		this.postCode = postCode;
	}

	public String getPostCode(){
		return postCode;
	}

	@Override
 	public String toString(){
		return 
			"Address{" + 
			"country = '" + country + '\'' + 
			",city = '" + city + '\'' + 
			",addressLine1 = '" + addressLine1 + '\'' + 
			",postCode = '" + postCode + '\'' + 
			"}";
		}
}