package com.mywork.begin.TransactionDataProducerApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Source{

	@JsonProperty("sourceId")
	private String sourceId;

	@JsonProperty("pim")
	private String pim;

	@JsonProperty("userId")
	private String userId;

	public void setSourceId(String sourceId){
		this.sourceId = sourceId;
	}

	public String getSourceId(){
		return sourceId;
	}

	public void setPim(String pim){
		this.pim = pim;
	}

	public String getPim(){
		return pim;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return userId;
	}

	@Override
 	public String toString(){
		return 
			"Source{" + 
			"sourceId = '" + sourceId + '\'' + 
			",pim = '" + pim + '\'' + 
			",userId = '" + userId + '\'' + 
			"}";
		}
}