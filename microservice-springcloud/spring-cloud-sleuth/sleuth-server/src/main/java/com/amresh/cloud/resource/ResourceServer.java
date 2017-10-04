package com.amresh.cloud.resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class ResourceServer {
	
	private static final Logger LOGGER =Logger.getLogger(ResourceServer.class);
	
	@GetMapping("/server")
	public String hello()
	{
		
		LOGGER.info("REACHED SERVER..");
		return "hello from server.";
	}

}
