package com.mywork.begin.TransactionDataProducerApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SalesContext{

	@JsonProperty("salesIdentifier")
	private String salesIdentifier;

	public void setSalesIdentifier(String salesIdentifier){
		this.salesIdentifier = salesIdentifier;
	}

	public String getSalesIdentifier(){
		return salesIdentifier;
	}

	@Override
 	public String toString(){
		return 
			"SalesContext{" + 
			"salesIdentifier = '" + salesIdentifier + '\'' + 
			"}";
		}
}