package com.mywork.begin.transactiondataproducerapp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Merchant{

	@JsonProperty("name")
	private String name;

	@JsonProperty("sites")
	private List<SitesItem> sites;

	@JsonProperty("businessIdentifiers")
	private List<Object> businessIdentifiers;

	@JsonProperty("id")
	private String id;

	@JsonProperty("UUID")
	private String uUID;

	@JsonProperty("locale")
	private Locale locale;

	@JsonProperty("contracts")
	private List<ContractsItem> contracts;

	@JsonProperty("contacts")
	private List<Object> contacts;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setSites(List<SitesItem> sites){
		this.sites = sites;
	}

	public List<SitesItem> getSites(){
		return sites;
	}

	public void setBusinessIdentifiers(List<Object> businessIdentifiers){
		this.businessIdentifiers = businessIdentifiers;
	}

	public List<Object> getBusinessIdentifiers(){
		return businessIdentifiers;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setUUID(String uUID){
		this.uUID = uUID;
	}

	public String getUUID(){
		return uUID;
	}

	public void setLocale(Locale locale){
		this.locale = locale;
	}

	public Locale getLocale(){
		return locale;
	}

	public void setContracts(List<ContractsItem> contracts){
		this.contracts = contracts;
	}

	public List<ContractsItem> getContracts(){
		return contracts;
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
			"Merchant{" + 
			"name = '" + name + '\'' + 
			",sites = '" + sites + '\'' + 
			",businessIdentifiers = '" + businessIdentifiers + '\'' + 
			",id = '" + id + '\'' + 
			",uUID = '" + uUID + '\'' + 
			",locale = '" + locale + '\'' + 
			",contracts = '" + contracts + '\'' + 
			",contacts = '" + contacts + '\'' + 
			"}";
		}
}