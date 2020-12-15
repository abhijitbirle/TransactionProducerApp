package com.mywork.begin.transactiondataproducerapp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class POI{

	@JsonProperty("software")
	private List<Object> software;

	@JsonProperty("contract")
	private Contract contract;

	@JsonProperty("verificationCapabilities")
	private List<Object> verificationCapabilities;

	@JsonProperty("type")
	private String type;

	public void setSoftware(List<Object> software){
		this.software = software;
	}

	public List<Object> getSoftware(){
		return software;
	}

	public void setContract(Contract contract){
		this.contract = contract;
	}

	public Contract getContract(){
		return contract;
	}

	public void setVerificationCapabilities(List<Object> verificationCapabilities){
		this.verificationCapabilities = verificationCapabilities;
	}

	public List<Object> getVerificationCapabilities(){
		return verificationCapabilities;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"POI{" + 
			"software = '" + software + '\'' + 
			",contract = '" + contract + '\'' + 
			",verificationCapabilities = '" + verificationCapabilities + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}