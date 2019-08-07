package com.poc.teamobjectiveservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TeamObjectiveServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamObjectiveServiceApplication.class, args);
	}

}
