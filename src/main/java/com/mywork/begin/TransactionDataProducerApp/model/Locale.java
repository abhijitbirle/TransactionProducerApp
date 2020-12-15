package com.mywork.begin.transactiondataproducerapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Locale{

	@JsonProperty("countryCode")
	private String countryCode;

	@JsonProperty("timezone")
	private String timezone;

	@JsonProperty("language")
	private String language;

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public void setTimezone(String timezone){
		this.timezone = timezone;
	}

	public String getTimezone(){
		return timezone;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	@Override
 	public String toString(){
		return 
			"Locale{" + 
			"countryCode = '" + countryCode + '\'' + 
			",timezone = '" + timezone + '\'' + 
			",language = '" + language + '\'' + 
			"}";
		}
}