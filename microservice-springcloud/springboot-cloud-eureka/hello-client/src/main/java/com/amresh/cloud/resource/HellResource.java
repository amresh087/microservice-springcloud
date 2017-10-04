package com.amresh.cloud.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/rest/hello/client")
public class HellResource {

	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@HystrixCommand(fallbackMethod = "fallback", groupKey = "Hello",
            commandKey = "hello",
            threadPoolKey = "helloThread"
            )
	@GetMapping
	public String hello()
	{
		
		String response=restTemplate.getForObject("http://hello-server/rest/hello/server", String.class);
		
		return response;
	}
	
	
	
	public String fallback()
	{
		return "Fall Back Hello world.";
	}
	
}
