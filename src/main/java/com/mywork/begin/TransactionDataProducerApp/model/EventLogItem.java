package com.mywork.begin.transactiondataproducerapp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EventLogItem{

	@JsonProperty("transactionType")
	private String transactionType;

	@JsonProperty("amount")
	private Amount amount;

	@JsonProperty("datetime")
	private String datetime;

	@JsonProperty("eventTreeUUIDs")
	private List<String> eventTreeUUIDs;

	@JsonProperty("transactionPartial")
	private boolean transactionPartial;

	@JsonProperty("uuid")
	private String uuid;

	@JsonProperty("transactionState")
	private String transactionState;

	@JsonProperty("userId")
	private String userId;

	@JsonProperty("stateHumanReadable")
	private String stateHumanReadable;

	public void setTransactionType(String transactionType){
		this.transactionType = transactionType;
	}

	public String getTransactionType(){
		return transactionType;
	}

	public void setAmount(Amount amount){
		this.amount = amount;
	}

	public Amount getAmount(){
		return amount;
	}

	public void setDatetime(String datetime){
		this.datetime = datetime;
	}

	public String getDatetime(){
		return datetime;
	}

	public void setEventTreeUUIDs(List<String> eventTreeUUIDs){
		this.eventTreeUUIDs = eventTreeUUIDs;
	}

	public List<String> getEventTreeUUIDs(){
		return eventTreeUUIDs;
	}

	public void setTransactionPartial(boolean transactionPartial){
		this.transactionPartial = transactionPartial;
	}

	public boolean isTransactionPartial(){
		return transactionPartial;
	}

	public void setUuid(String uuid){
		this.uuid = uuid;
	}

	public String getUuid(){
		return uuid;
	}

	public void setTransactionState(String transactionState){
		this.transactionState = transactionState;
	}

	public String getTransactionState(){
		return transactionState;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setStateHumanReadable(String stateHumanReadable){
		this.stateHumanReadable = stateHumanReadable;
	}

	public String getStateHumanReadable(){
		return stateHumanReadable;
	}

	@Override
 	public String toString(){
		return 
			"EventLogItem{" + 
			"transactionType = '" + transactionType + '\'' + 
			",amount = '" + amount + '\'' + 
			",datetime = '" + datetime + '\'' + 
			",eventTreeUUIDs = '" + eventTreeUUIDs + '\'' + 
			",transactionPartial = '" + transactionPartial + '\'' + 
			",uuid = '" + uuid + '\'' + 
			",transactionState = '" + transactionState + '\'' + 
			",userId = '" + userId + '\'' + 
			",stateHumanReadable = '" + stateHumanReadable + '\'' + 
			"}";
		}
}