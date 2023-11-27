package com.aditya.first;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query; 

public interface Repository extends MongoRepository<Employee,Integer>{ 

	
	
}
