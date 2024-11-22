package com.hubspot.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hubspot.test.pojos.CallRecordResponse;

@RestController
public class ConcurrentCallsController {
	
	String URL = "https://candidate.hubteam.com/candidateTest/v3/problem/dataset?userKey=fc411fba4ff2d51226a6a42632d9";
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/get-call-records")
	public CallRecordResponse getCallrecords(){
		
		 ResponseEntity<String> response = restTemplate.getForEntity(URL, String.class);
		
		System.out.println("Response entity is " + response.toString() );
		//CallRecord[] callRecords = restTemplate.getForObject("https://candidate.hubteam.com/candidateTest/v3/problem/dataset?userKey=fc411fba4ff2d51226a6a42632d9", CallRecord[].class);
		CallRecordResponse callRecordResponse = restTemplate.getForObject("https://candidate.hubteam.com/candidateTest/v3/problem/dataset?userKey=fc411fba4ff2d51226a6a42632d9", CallRecordResponse.class);
		return callRecordResponse;
		//return (String) restTemplate.getForObject("https://candidate.hubteam.com/candidateTest/v3/problem/dataset?userKey=fc411fba4ff2d51226a6a42632d9", String.class);
		
	}
	

}
