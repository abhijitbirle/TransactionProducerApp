package com.mywork.begin.TransactionDataProducerApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AmountAvailableForRefund{

	@JsonProperty("currencyCode")
	private String currencyCode;

	@JsonProperty("value")
	private int value;

	public void setCurrencyCode(String currencyCode){
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}

	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"AmountAvailableForRefund{" + 
			"currencyCode = '" + currencyCode + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}