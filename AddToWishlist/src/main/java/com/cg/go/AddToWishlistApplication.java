package com.cg.go;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AddToWishlistApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddToWishlistApplication.class, args);
	}

}
