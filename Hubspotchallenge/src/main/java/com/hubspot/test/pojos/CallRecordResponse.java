package com.hubspot.test.pojos;

import java.util.List;

public class CallRecordResponse {
	
	private List<CallRecord> data;  // This matches the "data" field in your JSON response

    public List<CallRecord> getData() {
        return data;
    }

    public void setData(List<CallRecord> data) {
        this.data = data;
    }

}
