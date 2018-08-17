package com.dtmobile.spring;

import java.io.Serializable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application implements Serializable {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
