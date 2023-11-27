package com.aditya.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.HttpStatus;

@SpringBootApplication
@EnableMongoRepositories

public class RestControllerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestControllerExampleApplication.class, args);
	}

}
