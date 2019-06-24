package com.carvalho.gustavo.starapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarApiApplication {
	public static final String BASE_URL = "/api/v1/";

	public static void main(String[] args) {
		SpringApplication.run(StarApiApplication.class, args);
	}

}
