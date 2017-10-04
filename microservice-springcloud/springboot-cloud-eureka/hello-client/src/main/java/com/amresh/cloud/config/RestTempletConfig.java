package com.amresh.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTempletConfig {
	@LoadBalanced
	@Bean
	public RestTemplate restTemplet()
	{
		return new RestTemplate();
	}

}
