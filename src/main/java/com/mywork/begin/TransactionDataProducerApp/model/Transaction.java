package com.mywork.begin.transactiondataproducerapp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction{

	@JsonProperty("additionalServices")
	private List<Object> additionalServices;

	@JsonProperty("amount")
	private Amount amount;

	@JsonProperty("transmittedDateTime")
	private String transmittedDateTime;

	@JsonProperty("gatewayTraceId")
	private String gatewayTraceId;

	@JsonProperty("createdDateTime")
	private String createdDateTime;

	@JsonProperty("capture")
	private boolean capture;

	@JsonProperty("merchant")
	private Merchant merchant;

	@JsonProperty("instrument")
	private List<InstrumentItem> instrument;

	@JsonProperty("POI")
	private POI pOI;

	@JsonProperty("paymentSummary")
	private PaymentSummary paymentSummary;

	@JsonProperty("transactionId")
	private String transactionId;

	@JsonProperty("referenceId")
	private String referenceId;

	@JsonProperty("transactionType")
	private String transactionType;

	@JsonProperty("initiatorTraceId")
	private String initiatorTraceId;

	@JsonProperty("context")
	private Context context;

	@JsonProperty("settlementContext")
	private SettlementContext settlementContext;

	@JsonProperty("UUID")
	private String uUID;

	@JsonProperty("capturedDateTime")
	private String capturedDateTime;

	@JsonProperty("outcome")
	private List<OutcomeItem> outcome;

	@JsonProperty("customer")
	private Customer customer;

	public void setAdditionalServices(List<Object> additionalServices){
		this.additionalServices = additionalServices;
	}

	public List<Object> getAdditionalServices(){
		return additionalServices;
	}

	public void setAmount(Amount amount){
		this.amount = amount;
	}

	public Amount getAmount(){
		return amount;
	}

	public void setTransmittedDateTime(String transmittedDateTime){
		this.transmittedDateTime = transmittedDateTime;
	}

	public String getTransmittedDateTime(){
		return transmittedDateTime;
	}

	public void setGatewayTraceId(String gatewayTraceId){
		this.gatewayTraceId = gatewayTraceId;
	}

	public String getGatewayTraceId(){
		return gatewayTraceId;
	}

	public void setCreatedDateTime(String createdDateTime){
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedDateTime(){
		return createdDateTime;
	}

	public void setCapture(boolean capture){
		this.capture = capture;
	}

	public boolean isCapture(){
		return capture;
	}

	public void setMerchant(Merchant merchant){
		this.merchant = merchant;
	}

	public Merchant getMerchant(){
		return merchant;
	}

	public void setInstrument(List<InstrumentItem> instrument){
		this.instrument = instrument;
	}

	public List<InstrumentItem> getInstrument(){
		return instrument;
	}

	public void setPOI(POI pOI){
		this.pOI = pOI;
	}

	public POI getPOI(){
		return pOI;
	}

	public void setPaymentSummary(PaymentSummary paymentSummary){
		this.paymentSummary = paymentSummary;
	}

	public PaymentSummary getPaymentSummary(){
		return paymentSummary;
	}

	public void setTransactionId(String transactionId){
		this.transactionId = transactionId;
	}

	public String getTransactionId(){
		return transactionId;
	}

	public void setReferenceId(String referenceId){
		this.referenceId = referenceId;
	}

	public String getReferenceId(){
		return referenceId;
	}

	public void setTransactionType(String transactionType){
		this.transactionType = transactionType;
	}

	public String getTransactionType(){
		return transactionType;
	}

	public void setInitiatorTraceId(String initiatorTraceId){
		this.initiatorTraceId = initiatorTraceId;
	}

	public String getInitiatorTraceId(){
		return initiatorTraceId;
	}

	public void setContext(Context context){
		this.context = context;
	}

	public Context getContext(){
		return context;
	}

	public void setSettlementContext(SettlementContext settlementContext){
		this.settlementContext = settlementContext;
	}

	public SettlementContext getSettlementContext(){
		return settlementContext;
	}

	public void setUUID(String uUID){
		this.uUID = uUID;
	}

	public String getUUID(){
		return uUID;
	}

	public void setCapturedDateTime(String capturedDateTime){
		this.capturedDateTime = capturedDateTime;
	}

	public String getCapturedDateTime(){
		return capturedDateTime;
	}

	public void setOutcome(List<OutcomeItem> outcome){
		this.outcome = outcome;
	}

	public List<OutcomeItem> getOutcome(){
		return outcome;
	}

	public void setCustomer(Customer customer){
		this.customer = customer;
	}

	public Customer getCustomer(){
		return customer;
	}

	@Override
 	public String toString(){
		return 
			"Transaction{" + 
			"additionalServices = '" + additionalServices + '\'' + 
			",amount = '" + amount + '\'' + 
			",transmittedDateTime = '" + transmittedDateTime + '\'' + 
			",gatewayTraceId = '" + gatewayTraceId + '\'' + 
			",createdDateTime = '" + createdDateTime + '\'' + 
			",capture = '" + capture + '\'' + 
			",merchant = '" + merchant + '\'' + 
			",instrument = '" + instrument + '\'' + 
			",pOI = '" + pOI + '\'' + 
			",paymentSummary = '" + paymentSummary + '\'' + 
			",transactionId = '" + transactionId + '\'' + 
			",referenceId = '" + referenceId + '\'' + 
			",transactionType = '" + transactionType + '\'' + 
			",initiatorTraceId = '" + initiatorTraceId + '\'' + 
			",context = '" + context + '\'' + 
			",settlementContext = '" + settlementContext + '\'' + 
			",uUID = '" + uUID + '\'' + 
			",capturedDateTime = '" + capturedDateTime + '\'' + 
			",outcome = '" + outcome + '\'' + 
			",customer = '" + customer + '\'' + 
			"}";
		}
}