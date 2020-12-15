package com.mywork.begin.transactiondataproducerapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Authentication{

	@JsonProperty("threeDSecure")
	private ThreeDSecure threeDSecure;

	public void setThreeDSecure(ThreeDSecure threeDSecure){
		this.threeDSecure = threeDSecure;
	}

	public ThreeDSecure getThreeDSecure(){
		return threeDSecure;
	}

	@Override
 	public String toString(){
		return 
			"Authentication{" + 
			"threeDSecure = '" + threeDSecure + '\'' + 
			"}";
		}
}