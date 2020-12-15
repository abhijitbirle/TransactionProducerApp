package com.mywork.begin.TransactionDataProducerApp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Header{

	@JsonProperty("eventType")
	private String eventType;

	@JsonProperty("state")
	private String state;

	@JsonProperty("source")
	private Source source;

	@JsonProperty("repeatCount")
	private int repeatCount;

	@JsonProperty("tags")
	private List<Object> tags;

	public void setEventType(String eventType){
		this.eventType = eventType;
	}

	public String getEventType(){
		return eventType;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setSource(Source source){
		this.source = source;
	}

	public Source getSource(){
		return source;
	}

	public void setRepeatCount(int repeatCount){
		this.repeatCount = repeatCount;
	}

	public int getRepeatCount(){
		return repeatCount;
	}

	public void setTags(List<Object> tags){
		this.tags = tags;
	}

	public List<Object> getTags(){
		return tags;
	}

	@Override
 	public String toString(){
		return 
			"Header{" + 
			"eventType = '" + eventType + '\'' + 
			",state = '" + state + '\'' + 
			",source = '" + source + '\'' + 
			",repeatCount = '" + repeatCount + '\'' + 
			",tags = '" + tags + '\'' + 
			"}";
		}
}