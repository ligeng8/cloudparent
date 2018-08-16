package com.datang.rm;

import org.springframework.stereotype.Component;

@Component
public class FallBackEurekaClient implements UrekaCllientR {

	@Override
	public String home(String name) {
		// TODO Auto-generated method stub
		return name +" fuck you ";
	}

}
