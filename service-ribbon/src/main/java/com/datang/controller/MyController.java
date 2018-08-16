package com.datang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class MyController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/he")
	@HystrixCommand(fallbackMethod="fallback")
	public String hello(String name) {
		return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
	}

	
	public String fallback(String name) {
		
		return name+"fallback";
	}
}
