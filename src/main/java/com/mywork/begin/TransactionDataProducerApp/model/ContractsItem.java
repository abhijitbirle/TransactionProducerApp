package com.mywork.begin.TransactionDataProducerApp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ContractsItem{

	@JsonProperty("otherParty")
	private OtherParty otherParty;

	@JsonProperty("merchantId")
	private String merchantId;

	@JsonProperty("contractId")
	private String contractId;

	@JsonProperty("paymentType")
	private List<Object> paymentType;

	public void setOtherParty(OtherParty otherParty){
		this.otherParty = otherParty;
	}

	public OtherParty getOtherParty(){
		return otherParty;
	}

	public void setMerchantId(String merchantId){
		this.merchantId = merchantId;
	}

	public String getMerchantId(){
		return merchantId;
	}

	public void setContractId(String contractId){
		this.contractId = contractId;
	}

	public String getContractId(){
		return contractId;
	}

	public void setPaymentType(List<Object> paymentType){
		this.paymentType = paymentType;
	}

	public List<Object> getPaymentType(){
		return paymentType;
	}

	@Override
 	public String toString(){
		return 
			"ContractsItem{" + 
			"otherParty = '" + otherParty + '\'' + 
			",merchantId = '" + merchantId + '\'' + 
			",contractId = '" + contractId + '\'' + 
			",paymentType = '" + paymentType + '\'' + 
			"}";
		}
}