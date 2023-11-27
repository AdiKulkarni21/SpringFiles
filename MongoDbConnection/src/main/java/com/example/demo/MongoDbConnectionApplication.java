package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@EnableMongoRepositories
@SpringBootApplication
public class MongoDbConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbConnectionApplication.class, args);
	}

}
