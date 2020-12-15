package com.mywork.begin.TransactionDataProducerApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metadata{

	@JsonProperty("transmissionDateTime")
	private String transmissionDateTime;

	@JsonProperty("applicationLocalDate")
	private String applicationLocalDate;

	@JsonProperty("registrationVerification3ds")
	private String registrationVerification3ds;

	@JsonProperty("acquirerResponseCode")
	private String acquirerResponseCode;

	@JsonProperty("applicationLocalTime")
	private String applicationLocalTime;

	@JsonProperty("cumulativeAmount")
	private String cumulativeAmount;

	@JsonProperty("fundingSource")
	private String fundingSource;

	public void setTransmissionDateTime(String transmissionDateTime){
		this.transmissionDateTime = transmissionDateTime;
	}

	public String getTransmissionDateTime(){
		return transmissionDateTime;
	}

	public void setApplicationLocalDate(String applicationLocalDate){
		this.applicationLocalDate = applicationLocalDate;
	}

	public String getApplicationLocalDate(){
		return applicationLocalDate;
	}

	public void setRegistrationVerification3ds(String registrationVerification3ds){
		this.registrationVerification3ds = registrationVerification3ds;
	}

	public String getRegistrationVerification3ds(){
		return registrationVerification3ds;
	}

	public void setAcquirerResponseCode(String acquirerResponseCode){
		this.acquirerResponseCode = acquirerResponseCode;
	}

	public String getAcquirerResponseCode(){
		return acquirerResponseCode;
	}

	public void setApplicationLocalTime(String applicationLocalTime){
		this.applicationLocalTime = applicationLocalTime;
	}

	public String getApplicationLocalTime(){
		return applicationLocalTime;
	}

	public void setCumulativeAmount(String cumulativeAmount){
		this.cumulativeAmount = cumulativeAmount;
	}

	public String getCumulativeAmount(){
		return cumulativeAmount;
	}

	public void setFundingSource(String fundingSource){
		this.fundingSource = fundingSource;
	}

	public String getFundingSource(){
		return fundingSource;
	}

	@Override
 	public String toString(){
		return 
			"Metadata{" + 
			"transmissionDateTime = '" + transmissionDateTime + '\'' + 
			",applicationLocalDate = '" + applicationLocalDate + '\'' + 
			",registrationVerification3ds = '" + registrationVerification3ds + '\'' + 
			",acquirerResponseCode = '" + acquirerResponseCode + '\'' + 
			",applicationLocalTime = '" + applicationLocalTime + '\'' + 
			",cumulativeAmount = '" + cumulativeAmount + '\'' + 
			",fundingSource = '" + fundingSource + '\'' + 
			"}";
		}
}