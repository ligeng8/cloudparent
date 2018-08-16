package com.datang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datang.rm.UrekaCllientR;

@RestController
public class MyController {

	@Autowired
	private UrekaCllientR urekaCllientR;

	@RequestMapping("/hi")
	public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
		return urekaCllientR.home(name);
	};
	

}
