package com.amresh.cloud.sleuthclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.amresh.cloud")
public class SleuthClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthClientApplication.class, args);
	}
}
