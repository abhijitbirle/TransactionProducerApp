package com.mywork.begin.transactiondataproducerapp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OutcomeItem{

	@JsonProperty("outcomeType")
	private String outcomeType;

	@JsonProperty("authorisationOnline")
	private boolean authorisationOnline;

	@JsonProperty("response")
	private String response;

	@JsonProperty("errorMessage")
	private String errorMessage;

	@JsonProperty("errorCode")
	private String errorCode;

	@JsonProperty("authorisationCode")
	private String authorisationCode;

	@JsonProperty("responseMessage")
	private String responseMessage;

	@JsonProperty("actions")
	private List<Object> actions;

	@JsonProperty("responseCode")
	private String responseCode;

	@JsonProperty("transactionTraceId")
	private String transactionTraceId;

	@JsonProperty("metadata")
	private Metadata metadata;

	@JsonProperty("acquirerResponseCode")
	private String acquirerResponseCode;

	@JsonProperty("acquirerResponseMessage")
	private String acquirerResponseMessage;

	@JsonProperty("processorSTAN")
	private String processorSTAN;

	public void setOutcomeType(String outcomeType){
		this.outcomeType = outcomeType;
	}

	public String getOutcomeType(){
		return outcomeType;
	}

	public void setAuthorisationOnline(boolean authorisationOnline){
		this.authorisationOnline = authorisationOnline;
	}

	public boolean isAuthorisationOnline(){
		return authorisationOnline;
	}

	public void setResponse(String response){
		this.response = response;
	}

	public String getResponse(){
		return response;
	}

	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage(){
		return errorMessage;
	}

	public void setErrorCode(String errorCode){
		this.errorCode = errorCode;
	}

	public String getErrorCode(){
		return errorCode;
	}

	public void setAuthorisationCode(String authorisationCode){
		this.authorisationCode = authorisationCode;
	}

	public String getAuthorisationCode(){
		return authorisationCode;
	}

	public void setResponseMessage(String responseMessage){
		this.responseMessage = responseMessage;
	}

	public String getResponseMessage(){
		return responseMessage;
	}

	public void setActions(List<Object> actions){
		this.actions = actions;
	}

	public List<Object> getActions(){
		return actions;
	}

	public void setResponseCode(String responseCode){
		this.responseCode = responseCode;
	}

	public String getResponseCode(){
		return responseCode;
	}

	public void setTransactionTraceId(String transactionTraceId){
		this.transactionTraceId = transactionTraceId;
	}

	public String getTransactionTraceId(){
		return transactionTraceId;
	}

	public void setMetadata(Metadata metadata){
		this.metadata = metadata;
	}

	public Metadata getMetadata(){
		return metadata;
	}

	public void setAcquirerResponseCode(String acquirerResponseCode){
		this.acquirerResponseCode = acquirerResponseCode;
	}

	public String getAcquirerResponseCode(){
		return acquirerResponseCode;
	}

	public void setAcquirerResponseMessage(String acquirerResponseMessage){
		this.acquirerResponseMessage = acquirerResponseMessage;
	}

	public String getAcquirerResponseMessage(){
		return acquirerResponseMessage;
	}

	public void setProcessorSTAN(String processorSTAN){
		this.processorSTAN = processorSTAN;
	}

	public String getProcessorSTAN(){
		return processorSTAN;
	}

	@Override
 	public String toString(){
		return 
			"OutcomeItem{" + 
			"outcomeType = '" + outcomeType + '\'' + 
			",authorisationOnline = '" + authorisationOnline + '\'' + 
			",response = '" + response + '\'' + 
			",errorMessage = '" + errorMessage + '\'' + 
			",errorCode = '" + errorCode + '\'' + 
			",authorisationCode = '" + authorisationCode + '\'' + 
			",responseMessage = '" + responseMessage + '\'' + 
			",actions = '" + actions + '\'' + 
			",responseCode = '" + responseCode + '\'' + 
			",transactionTraceId = '" + transactionTraceId + '\'' + 
			",metadata = '" + metadata + '\'' + 
			",acquirerResponseCode = '" + acquirerResponseCode + '\'' + 
			",acquirerResponseMessage = '" + acquirerResponseMessage + '\'' + 
			",processorSTAN = '" + processorSTAN + '\'' + 
			"}";
		}
}