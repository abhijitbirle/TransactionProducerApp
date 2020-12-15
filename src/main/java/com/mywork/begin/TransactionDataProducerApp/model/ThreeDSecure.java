package com.mywork.begin.transactiondataproducerapp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ThreeDSecure{

	@JsonProperty("errorNo")
	private String errorNo;

	@JsonProperty("signatureVerification")
	private String signatureVerification;

	@JsonProperty("enrollmentStatus")
	private String enrollmentStatus;

	@JsonProperty("eci")
	private String eci;

	@JsonProperty("authenticationType")
	private String authenticationType;

	@JsonProperty("additionalData")
	private AdditionalData additionalData;

	@JsonProperty("authenticationValue")
	private String authenticationValue;

	@JsonProperty("version")
	private String version;

	@JsonProperty("authenticationStatus")
	private String authenticationStatus;

	@JsonProperty("verification")
	private List<Object> verification;

	@JsonProperty("authenticationValueAlgorithm")
	private String authenticationValueAlgorithm;

	public void setErrorNo(String errorNo){
		this.errorNo = errorNo;
	}

	public String getErrorNo(){
		return errorNo;
	}

	public void setSignatureVerification(String signatureVerification){
		this.signatureVerification = signatureVerification;
	}

	public String getSignatureVerification(){
		return signatureVerification;
	}

	public void setEnrollmentStatus(String enrollmentStatus){
		this.enrollmentStatus = enrollmentStatus;
	}

	public String getEnrollmentStatus(){
		return enrollmentStatus;
	}

	public void setEci(String eci){
		this.eci = eci;
	}

	public String getEci(){
		return eci;
	}

	public void setAuthenticationType(String authenticationType){
		this.authenticationType = authenticationType;
	}

	public String getAuthenticationType(){
		return authenticationType;
	}

	public void setAdditionalData(AdditionalData additionalData){
		this.additionalData = additionalData;
	}

	public AdditionalData getAdditionalData(){
		return additionalData;
	}

	public void setAuthenticationValue(String authenticationValue){
		this.authenticationValue = authenticationValue;
	}

	public String getAuthenticationValue(){
		return authenticationValue;
	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	public void setAuthenticationStatus(String authenticationStatus){
		this.authenticationStatus = authenticationStatus;
	}

	public String getAuthenticationStatus(){
		return authenticationStatus;
	}

	public void setVerification(List<Object> verification){
		this.verification = verification;
	}

	public List<Object> getVerification(){
		return verification;
	}

	public void setAuthenticationValueAlgorithm(String authenticationValueAlgorithm){
		this.authenticationValueAlgorithm = authenticationValueAlgorithm;
	}

	public String getAuthenticationValueAlgorithm(){
		return authenticationValueAlgorithm;
	}

	@Override
 	public String toString(){
		return 
			"ThreeDSecure{" + 
			"errorNo = '" + errorNo + '\'' + 
			",signatureVerification = '" + signatureVerification + '\'' + 
			",enrollmentStatus = '" + enrollmentStatus + '\'' + 
			",eci = '" + eci + '\'' + 
			",authenticationType = '" + authenticationType + '\'' + 
			",additionalData = '" + additionalData + '\'' + 
			",authenticationValue = '" + authenticationValue + '\'' + 
			",version = '" + version + '\'' + 
			",authenticationStatus = '" + authenticationStatus + '\'' + 
			",verification = '" + verification + '\'' + 
			",authenticationValueAlgorithm = '" + authenticationValueAlgorithm + '\'' + 
			"}";
		}
}