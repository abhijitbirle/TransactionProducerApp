package com.mywork.begin.TransactionDataProducerApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdditionalData{

	@JsonProperty("acsUrl")
	private String acsUrl;

	@JsonProperty("totalItems")
	private double totalItems;

	@JsonProperty("challengeIndicator")
	private String challengeIndicator;

	@JsonProperty("acsOperatorID")
	private String acsOperatorID;

	@JsonProperty("deviceChannel")
	private String deviceChannel;

	public void setAcsUrl(String acsUrl){
		this.acsUrl = acsUrl;
	}

	public String getAcsUrl(){
		return acsUrl;
	}

	public void setTotalItems(double totalItems){
		this.totalItems = totalItems;
	}

	public double getTotalItems(){
		return totalItems;
	}

	public void setChallengeIndicator(String challengeIndicator){
		this.challengeIndicator = challengeIndicator;
	}

	public String getChallengeIndicator(){
		return challengeIndicator;
	}

	public void setAcsOperatorID(String acsOperatorID){
		this.acsOperatorID = acsOperatorID;
	}

	public String getAcsOperatorID(){
		return acsOperatorID;
	}

	public void setDeviceChannel(String deviceChannel){
		this.deviceChannel = deviceChannel;
	}

	public String getDeviceChannel(){
		return deviceChannel;
	}

	@Override
 	public String toString(){
		return 
			"AdditionalData{" + 
			"acsUrl = '" + acsUrl + '\'' + 
			",totalItems = '" + totalItems + '\'' + 
			",challengeIndicator = '" + challengeIndicator + '\'' + 
			",acsOperatorID = '" + acsOperatorID + '\'' + 
			",deviceChannel = '" + deviceChannel + '\'' + 
			"}";
		}
}