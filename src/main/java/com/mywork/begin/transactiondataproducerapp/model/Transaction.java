package com.mywork.begin.transactiondataproducerapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Transaction{

    @JsonProperty("header")
    private Header header;

    @JsonProperty("id")
    private String id;

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

    @Override
    public String toString() {
        return
                "Transaction{" +
                        "header = '" + header + '\'' +
                        ",id = '" + id + '\'' +
                        ",additionalServices = '" + additionalServices + '\'' +
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