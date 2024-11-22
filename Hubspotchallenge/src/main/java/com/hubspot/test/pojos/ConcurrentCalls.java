package com.hubspot.test.pojos;

import java.util.Date;
import java.util.List;

public class ConcurrentCalls {
	
	private int customerId;
	
	private Date callDate;
	private int maxConcurrentCalls;
	private String timeStamp;
	private List<String> callIds;
	
	public ConcurrentCalls() {
		super();
	}
	
	public ConcurrentCalls(int customerId, Date callDate, int maxConcurrentCalls, String timeStamp,
			List<String> callIds) {
		super();
		this.customerId = customerId;
		this.callDate = callDate;
		this.maxConcurrentCalls = maxConcurrentCalls;
		this.timeStamp = timeStamp;
		this.callIds = callIds;
	}
	

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public Date getCallDate() {
		return callDate;
	}
	public void setCallDate(Date callDate) {
		this.callDate = callDate;
	}
	public int getMaxConcurrentCalls() {
		return maxConcurrentCalls;
	}
	public void setMaxConcurrentCalls(int maxConcurrentCalls) {
		this.maxConcurrentCalls = maxConcurrentCalls;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public List<String> getCallIds() {
		return callIds;
	}
	public void setCallIds(List<String> callIds) {
		this.callIds = callIds;
	}
	@Override
	public String toString() {
		return "ConcurrentCalls [customerId=" + customerId + ", callDate=" + callDate + ", maxConcurrentCalls="
				+ maxConcurrentCalls + ", timeStamp=" + timeStamp + ", callIds=" + callIds + "]";
	}

}
