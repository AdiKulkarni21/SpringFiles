package com.aditya.example;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlienRepo extends MongoRepository<Alien,Integer> {

}
