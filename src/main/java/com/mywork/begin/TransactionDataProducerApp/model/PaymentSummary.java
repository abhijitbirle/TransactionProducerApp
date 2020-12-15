package com.mywork.begin.TransactionDataProducerApp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentSummary{

	@JsonProperty("authState")
	private String authState;

	@JsonProperty("currentAmount")
	private CurrentAmount currentAmount;

	@JsonProperty("allowedOperations")
	private List<Object> allowedOperations;

	@JsonProperty("displayTransactionState")
	private String displayTransactionState;

	@JsonProperty("displayPartial")
	private boolean displayPartial;

	@JsonProperty("eventLog")
	private List<EventLogItem> eventLog;

	@JsonProperty("displayStateHumanReadable")
	private String displayStateHumanReadable;

	@JsonProperty("displayTransactionType")
	private String displayTransactionType;

	@JsonProperty("state")
	private String state;

	@JsonProperty("totalAuthorisedAmount")
	private TotalAuthorisedAmount totalAuthorisedAmount;

	@JsonProperty("amountAvailableForCapture")
	private AmountAvailableForCapture amountAvailableForCapture;

	@JsonProperty("amountAvailableForRefund")
	private AmountAvailableForRefund amountAvailableForRefund;

	@JsonProperty("expiry")
	private String expiry;

	@JsonProperty("captureAmountModifier")
	private int captureAmountModifier;

	public void setAuthState(String authState){
		this.authState = authState;
	}

	public String getAuthState(){
		return authState;
	}

	public void setCurrentAmount(CurrentAmount currentAmount){
		this.currentAmount = currentAmount;
	}

	public CurrentAmount getCurrentAmount(){
		return currentAmount;
	}

	public void setAllowedOperations(List<Object> allowedOperations){
		this.allowedOperations = allowedOperations;
	}

	public List<Object> getAllowedOperations(){
		return allowedOperations;
	}

	public void setDisplayTransactionState(String displayTransactionState){
		this.displayTransactionState = displayTransactionState;
	}

	public String getDisplayTransactionState(){
		return displayTransactionState;
	}

	public void setDisplayPartial(boolean displayPartial){
		this.displayPartial = displayPartial;
	}

	public boolean isDisplayPartial(){
		return displayPartial;
	}

	public void setEventLog(List<EventLogItem> eventLog){
		this.eventLog = eventLog;
	}

	public List<EventLogItem> getEventLog(){
		return eventLog;
	}

	public void setDisplayStateHumanReadable(String displayStateHumanReadable){
		this.displayStateHumanReadable = displayStateHumanReadable;
	}

	public String getDisplayStateHumanReadable(){
		return displayStateHumanReadable;
	}

	public void setDisplayTransactionType(String displayTransactionType){
		this.displayTransactionType = displayTransactionType;
	}

	public String getDisplayTransactionType(){
		return displayTransactionType;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setTotalAuthorisedAmount(TotalAuthorisedAmount totalAuthorisedAmount){
		this.totalAuthorisedAmount = totalAuthorisedAmount;
	}

	public TotalAuthorisedAmount getTotalAuthorisedAmount(){
		return totalAuthorisedAmount;
	}

	public void setAmountAvailableForCapture(AmountAvailableForCapture amountAvailableForCapture){
		this.amountAvailableForCapture = amountAvailableForCapture;
	}

	public AmountAvailableForCapture getAmountAvailableForCapture(){
		return amountAvailableForCapture;
	}

	public void setAmountAvailableForRefund(AmountAvailableForRefund amountAvailableForRefund){
		this.amountAvailableForRefund = amountAvailableForRefund;
	}

	public AmountAvailableForRefund getAmountAvailableForRefund(){
		return amountAvailableForRefund;
	}

	public void setExpiry(String expiry){
		this.expiry = expiry;
	}

	public String getExpiry(){
		return expiry;
	}

	public void setCaptureAmountModifier(int captureAmountModifier){
		this.captureAmountModifier = captureAmountModifier;
	}

	public int getCaptureAmountModifier(){
		return captureAmountModifier;
	}

	@Override
 	public String toString(){
		return 
			"PaymentSummary{" + 
			"authState = '" + authState + '\'' + 
			",currentAmount = '" + currentAmount + '\'' + 
			",allowedOperations = '" + allowedOperations + '\'' + 
			",displayTransactionState = '" + displayTransactionState + '\'' + 
			",displayPartial = '" + displayPartial + '\'' + 
			",eventLog = '" + eventLog + '\'' + 
			",displayStateHumanReadable = '" + displayStateHumanReadable + '\'' + 
			",displayTransactionType = '" + displayTransactionType + '\'' + 
			",state = '" + state + '\'' + 
			",totalAuthorisedAmount = '" + totalAuthorisedAmount + '\'' + 
			",amountAvailableForCapture = '" + amountAvailableForCapture + '\'' + 
			",amountAvailableForRefund = '" + amountAvailableForRefund + '\'' + 
			",expiry = '" + expiry + '\'' + 
			",captureAmountModifier = '" + captureAmountModifier + '\'' + 
			"}";
		}
}