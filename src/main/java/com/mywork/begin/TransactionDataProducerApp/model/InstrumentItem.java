package com.mywork.begin.TransactionDataProducerApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InstrumentItem{

	@JsonProperty("tokenExpiryDate")
	private String tokenExpiryDate;

	@JsonProperty("instrumentType")
	private String instrumentType;

	@JsonProperty("lossPreventionToken")
	private String lossPreventionToken;

	@JsonProperty("cardholderToken")
	private String cardholderToken;

	@JsonProperty("tokenEntityId")
	private String tokenEntityId;

	@JsonProperty("country")
	private String country;

	@JsonProperty("expiryMonth")
	private int expiryMonth;

	@JsonProperty("expiryYear")
	private int expiryYear;

	@JsonProperty("cardBrand")
	private String cardBrand;

	@JsonProperty("fundingSource")
	private String fundingSource;

	@JsonProperty("cardVerificationType")
	private String cardVerificationType;

	@JsonProperty("trackData")
	private List<Object> trackData;

	@JsonProperty("maskedCardNumber")
	private String maskedCardNumber;

	public void setTokenExpiryDate(String tokenExpiryDate){
		this.tokenExpiryDate = tokenExpiryDate;
	}

	public String getTokenExpiryDate(){
		return tokenExpiryDate;
	}

	public void setInstrumentType(String instrumentType){
		this.instrumentType = instrumentType;
	}

	public String getInstrumentType(){
		return instrumentType;
	}

	public void setLossPreventionToken(String lossPreventionToken){
		this.lossPreventionToken = lossPreventionToken;
	}

	public String getLossPreventionToken(){
		return lossPreventionToken;
	}

	public void setCardholderToken(String cardholderToken){
		this.cardholderToken = cardholderToken;
	}

	public String getCardholderToken(){
		return cardholderToken;
	}

	public void setTokenEntityId(String tokenEntityId){
		this.tokenEntityId = tokenEntityId;
	}

	public String getTokenEntityId(){
		return tokenEntityId;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setExpiryMonth(int expiryMonth){
		this.expiryMonth = expiryMonth;
	}

	public int getExpiryMonth(){
		return expiryMonth;
	}

	public void setExpiryYear(int expiryYear){
		this.expiryYear = expiryYear;
	}

	public int getExpiryYear(){
		return expiryYear;
	}

	public void setCardBrand(String cardBrand){
		this.cardBrand = cardBrand;
	}

	public String getCardBrand(){
		return cardBrand;
	}

	public void setFundingSource(String fundingSource){
		this.fundingSource = fundingSource;
	}

	public String getFundingSource(){
		return fundingSource;
	}

	public void setCardVerificationType(String cardVerificationType){
		this.cardVerificationType = cardVerificationType;
	}

	public String getCardVerificationType(){
		return cardVerificationType;
	}

	public void setTrackData(List<Object> trackData){
		this.trackData = trackData;
	}

	public List<Object> getTrackData(){
		return trackData;
	}

	public void setMaskedCardNumber(String maskedCardNumber){
		this.maskedCardNumber = maskedCardNumber;
	}

	public String getMaskedCardNumber(){
		return maskedCardNumber;
	}

	@Override
 	public String toString(){
		return 
			"InstrumentItem{" + 
			"tokenExpiryDate = '" + tokenExpiryDate + '\'' + 
			",instrumentType = '" + instrumentType + '\'' + 
			",lossPreventionToken = '" + lossPreventionToken + '\'' + 
			",cardholderToken = '" + cardholderToken + '\'' + 
			",tokenEntityId = '" + tokenEntityId + '\'' + 
			",country = '" + country + '\'' + 
			",expiryMonth = '" + expiryMonth + '\'' + 
			",expiryYear = '" + expiryYear + '\'' + 
			",cardBrand = '" + cardBrand + '\'' + 
			",fundingSource = '" + fundingSource + '\'' + 
			",cardVerificationType = '" + cardVerificationType + '\'' + 
			",trackData = '" + trackData + '\'' + 
			",maskedCardNumber = '" + maskedCardNumber + '\'' + 
			"}";
		}
}