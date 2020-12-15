package com.mywork.begin.transactiondataproducerapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contract{

	@JsonProperty("poiId")
	private String poiId;

	public void setPoiId(String poiId){
		this.poiId = poiId;
	}

	public String getPoiId(){
		return poiId;
	}

	@Override
 	public String toString(){
		return 
			"Contract{" + 
			"poiId = '" + poiId + '\'' + 
			"}";
		}
}