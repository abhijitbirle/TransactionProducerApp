package com.mywork.begin.transactiondataproducerapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SettlementContext{

	@JsonProperty("settlementBatchFileNumber")
	private String settlementBatchFileNumber;

	@JsonProperty("settledDate")
	private String settledDate;

	@JsonProperty("UUID")
	private String uUID;

	@JsonProperty("settledId")
	private String settledId;

	@JsonProperty("status")
	private String status;

	public void setSettlementBatchFileNumber(String settlementBatchFileNumber){
		this.settlementBatchFileNumber = settlementBatchFileNumber;
	}

	public String getSettlementBatchFileNumber(){
		return settlementBatchFileNumber;
	}

	public void setSettledDate(String settledDate){
		this.settledDate = settledDate;
	}

	public String getSettledDate(){
		return settledDate;
	}

	public void setUUID(String uUID){
		this.uUID = uUID;
	}

	public String getUUID(){
		return uUID;
	}

	public void setSettledId(String settledId){
		this.settledId = settledId;
	}

	public String getSettledId(){
		return settledId;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"SettlementContext{" + 
			"settlementBatchFileNumber = '" + settlementBatchFileNumber + '\'' + 
			",settledDate = '" + settledDate + '\'' + 
			",uUID = '" + uUID + '\'' + 
			",settledId = '" + settledId + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}