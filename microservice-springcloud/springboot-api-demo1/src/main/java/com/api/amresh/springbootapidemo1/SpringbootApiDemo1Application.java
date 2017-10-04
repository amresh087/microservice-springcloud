package com.api.amresh.springbootapidemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.api.amresh")
@EnableAutoConfiguration
public class SpringbootApiDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApiDemo1Application.class, args);
	}
}
