package com.aditya.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienController {
//One Error i got while recieving data was because my alien class did not have setters and getter method
	// 2nd Error : we know request body accepts data in json format so earlier i had given a parameter of int aid but the error was that it was not able to convert JSON format to integer format , so i used a object to take values from the user
@Autowired
	AlienRepo repo ;

@RequestMapping("/")
public String welcomepage() {
return "index.jsp";
}
@GetMapping("aliens")
@ResponseBody
public List<Alien> getAlien() {
List<Alien> alien = repo.findAll();
	return alien;
}


@PostMapping("aliens")
@ResponseBody
public Alien insertAlien(Alien alien) {
	repo.save(alien);
	return alien;
	}


@PostMapping("alien")
public Alien getAlien(@RequestBody Alien aid) {
	
	Alien alien = repo.findById(aid.getAid()).orElse(new Alien(0,""));
	return alien;
	}
}
