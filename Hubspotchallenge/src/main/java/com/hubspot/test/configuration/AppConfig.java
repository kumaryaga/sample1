package com.hubspot.test.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	@Bean
    public RestTemplate restTemplate() {
RestTemplate restTemplate = new RestTemplate();
        
        // Add Jackson converter to handle JSON
        HttpMessageConverter<?> converter = new MappingJackson2HttpMessageConverter();
       restTemplate.getMessageConverters().add(converter);
        
       // restTemplate.setMessageConverters(Collections.singletonList(new MappingJackson2HttpMessageConverter()));
        
        return restTemplate;
    }

}
