package com.hubspot.test.pojos;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class UnixTimestampDeserializer extends JsonDeserializer<Date> {
	
	@Override
    public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        long timestamp = p.getLongValue();
        return new Date(timestamp);  // Converts Unix timestamp to Date
    }

}
