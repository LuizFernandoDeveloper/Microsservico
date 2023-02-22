package com.example.discoverieurecaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveriEurecaServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(DiscoveriEurecaServiceApplication.class, args);
	}

}
