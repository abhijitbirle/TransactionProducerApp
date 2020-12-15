package com.mywork.begin.transactiondataproducerapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Context{

	@JsonProperty("salesContext")
	private SalesContext salesContext;

	@JsonProperty("paymentContext")
	private PaymentContext paymentContext;

	public void setSalesContext(SalesContext salesContext){
		this.salesContext = salesContext;
	}

	public SalesContext getSalesContext(){
		return salesContext;
	}

	public void setPaymentContext(PaymentContext paymentContext){
		this.paymentContext = paymentContext;
	}

	public PaymentContext getPaymentContext(){
		return paymentContext;
	}

	@Override
 	public String toString(){
		return 
			"Context{" + 
			"salesContext = '" + salesContext + '\'' + 
			",paymentContext = '" + paymentContext + '\'' + 
			"}";
		}
}