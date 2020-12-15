package com.mywork.begin.transactiondataproducerapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OtherParty{

	@JsonProperty("acquiringInstitution")
	private long acquiringInstitution;

	@JsonProperty("role")
	private String role;

	public void setAcquiringInstitution(long acquiringInstitution){
		this.acquiringInstitution = acquiringInstitution;
	}

	public long getAcquiringInstitution(){
		return acquiringInstitution;
	}

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	@Override
 	public String toString(){
		return 
			"OtherParty{" + 
			"acquiringInstitution = '" + acquiringInstitution + '\'' + 
			",role = '" + role + '\'' + 
			"}";
		}
}