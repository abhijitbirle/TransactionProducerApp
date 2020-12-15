package com.mywork.begin.transactiondataproducerapp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentContext{

	@JsonProperty("fallbackReason")
	private String fallbackReason;

	@JsonProperty("authenticationMethod")
	private List<String> authenticationMethod;

	@JsonProperty("merchantPresent")
	private String merchantPresent;

	@JsonProperty("accountType")
	private String accountType;

	@JsonProperty("channel")
	private String channel;

	@JsonProperty("brandChoice")
	private String brandChoice;

	@JsonProperty("salesChannel")
	private String salesChannel;

	@JsonProperty("onlineReason")
	private String onlineReason;

	@JsonProperty("cardPresent")
	private boolean cardPresent;

	@JsonProperty("cardholderPresent")
	private boolean cardholderPresent;

	@JsonProperty("entryMode")
	private String entryMode;

	@JsonProperty("authentication")
	private List<String> authentication;

	public void setFallbackReason(String fallbackReason){
		this.fallbackReason = fallbackReason;
	}

	public String getFallbackReason(){
		return fallbackReason;
	}

	public void setAuthenticationMethod(List<String> authenticationMethod){
		this.authenticationMethod = authenticationMethod;
	}

	public List<String> getAuthenticationMethod(){
		return authenticationMethod;
	}

	public void setMerchantPresent(String merchantPresent){
		this.merchantPresent = merchantPresent;
	}

	public String getMerchantPresent(){
		return merchantPresent;
	}

	public void setAccountType(String accountType){
		this.accountType = accountType;
	}

	public String getAccountType(){
		return accountType;
	}

	public void setChannel(String channel){
		this.channel = channel;
	}

	public String getChannel(){
		return channel;
	}

	public void setBrandChoice(String brandChoice){
		this.brandChoice = brandChoice;
	}

	public String getBrandChoice(){
		return brandChoice;
	}

	public void setSalesChannel(String salesChannel){
		this.salesChannel = salesChannel;
	}

	public String getSalesChannel(){
		return salesChannel;
	}

	public void setOnlineReason(String onlineReason){
		this.onlineReason = onlineReason;
	}

	public String getOnlineReason(){
		return onlineReason;
	}

	public void setCardPresent(boolean cardPresent){
		this.cardPresent = cardPresent;
	}

	public boolean isCardPresent(){
		return cardPresent;
	}

	public void setCardholderPresent(boolean cardholderPresent){
		this.cardholderPresent = cardholderPresent;
	}

	public boolean isCardholderPresent(){
		return cardholderPresent;
	}

	public void setEntryMode(String entryMode){
		this.entryMode = entryMode;
	}

	public String getEntryMode(){
		return entryMode;
	}

	public void setAuthentication(List<String> authentication){
		this.authentication = authentication;
	}

	public List<String> getAuthentication(){
		return authentication;
	}

	@Override
 	public String toString(){
		return 
			"PaymentContext{" + 
			"fallbackReason = '" + fallbackReason + '\'' + 
			",authenticationMethod = '" + authenticationMethod + '\'' + 
			",merchantPresent = '" + merchantPresent + '\'' + 
			",accountType = '" + accountType + '\'' + 
			",channel = '" + channel + '\'' + 
			",brandChoice = '" + brandChoice + '\'' + 
			",salesChannel = '" + salesChannel + '\'' + 
			",onlineReason = '" + onlineReason + '\'' + 
			",cardPresent = '" + cardPresent + '\'' + 
			",cardholderPresent = '" + cardholderPresent + '\'' + 
			",entryMode = '" + entryMode + '\'' + 
			",authentication = '" + authentication + '\'' + 
			"}";
		}
}