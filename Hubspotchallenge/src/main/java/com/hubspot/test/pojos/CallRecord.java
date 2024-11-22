package com.hubspot.test.pojos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class CallRecord {
	
	@JsonProperty("customerId")
	private int customerId;
	@JsonProperty("callId")
	private String callId;
	//private Date startDate;
	//private Date endDate;
	@JsonProperty("startTimestamp")
	@JsonDeserialize(using = UnixTimestampDeserializer.class)
	private Date startTimestamp;
	@JsonProperty("endTimestamp")
	@JsonDeserialize(using = UnixTimestampDeserializer.class)
	private Date endTimestamp;
	
	
	public CallRecord() {
		super();
	}
	

	public CallRecord(int customerId, String callId,/* Date startDate, Date endDate,*/ Date startTime,
			Date endTimeStamp) {
		super();
		this.customerId = customerId;
		this.callId = callId;
		//this.startDate = startDate;
		//this.endDate = endDate;
		this.startTimestamp = startTime;
		this.endTimestamp = endTimeStamp;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCallId() {
		return callId;
	}
	public void setCallId(String callId) {
		this.callId = callId;
	}
/*	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	} */
	public Date getStartTime() {
		return startTimestamp;
	}
	public void setStartTime(Date startTime) {
		this.startTimestamp = startTime;
	}
	public Date getEndTimeStamp() {
		return endTimestamp;
	}
	public void setEndTimeStamp(Date endTimeStamp) {
		this.endTimestamp = endTimeStamp;
	}
	
	@Override
	public String toString() {
		return "CallRecord [customerId=" + customerId + ", callId=" + callId + ", startDate=" /*+ startDate + ", endDate="
				+ endDate */+ ", startTime=" + startTimestamp + ", endTimeStamp=" + endTimestamp + "]";
	}
	
	

}
