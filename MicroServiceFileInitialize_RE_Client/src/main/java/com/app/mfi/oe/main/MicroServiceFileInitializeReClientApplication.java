package com.app.mfi.oe.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories
@EntityScan
public class MicroServiceFileInitializeReClientApplication {

	public static void main(String[] args) {
		System.out.println("OE Client");
		SpringApplication.run(MicroServiceFileInitializeReClientApplication.class, args);
	}

}
