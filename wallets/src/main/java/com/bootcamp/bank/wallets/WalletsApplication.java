package com.bootcamp.bank.wallets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class WalletsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletsApplication.class, args);
	}

}
