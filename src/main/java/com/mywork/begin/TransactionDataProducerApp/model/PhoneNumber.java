package com.mywork.begin.TransactionDataProducerApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumber{

	@JsonProperty("phoneType")
	private String phoneType;

	@JsonProperty("isPrimary")
	private boolean isPrimary;

	@JsonProperty("value")
	private String value;

	public void setPhoneType(String phoneType){
		this.phoneType = phoneType;
	}

	public String getPhoneType(){
		return phoneType;
	}

	public void setIsPrimary(boolean isPrimary){
		this.isPrimary = isPrimary;
	}

	public boolean isIsPrimary(){
		return isPrimary;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"PhoneNumber{" + 
			"phoneType = '" + phoneType + '\'' + 
			",isPrimary = '" + isPrimary + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}