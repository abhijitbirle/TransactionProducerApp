package com.mywork.begin.transactiondataproducerapp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SitesItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("phoneNumbers")
	private List<Object> phoneNumbers;

	@JsonProperty("contacts")
	private List<Object> contacts;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPhoneNumbers(List<Object> phoneNumbers){
		this.phoneNumbers = phoneNumbers;
	}

	public List<Object> getPhoneNumbers(){
		return phoneNumbers;
	}

	public void setContacts(List<Object> contacts){
		this.contacts = contacts;
	}

	public List<Object> getContacts(){
		return contacts;
	}

	@Override
 	public String toString(){
		return 
			"SitesItem{" + 
			"name = '" + name + '\'' + 
			",phoneNumbers = '" + phoneNumbers + '\'' + 
			",contacts = '" + contacts + '\'' + 
			"}";
		}
}