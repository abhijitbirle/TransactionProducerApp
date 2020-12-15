package com.mywork.begin.transactiondataproducerapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionEvent{

	@JsonProperty("header")
	private Header header;

	@JsonProperty("transaction")
	private Transaction transaction;

	@Override
 	public String toString(){
		return 
			"TransactionEvent{" + 
			"header = '" + header + '\'' + 
			",transaction = '" + transaction + '\'' + 
			"}";
		}
}