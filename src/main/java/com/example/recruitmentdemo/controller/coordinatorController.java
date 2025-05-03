package com.example.recruitmentdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.recruitmentdemo.model.coordinator;
import com.example.recruitmentdemo.service.coordinatorService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class coordinatorController {
   @Autowired
   coordinatorService as;
   
     @PostMapping("/coordinator")
     public ResponseEntity<coordinator> add(@RequestBody coordinator ad)
      {
	    coordinator n=as.save(ad);
	    return new ResponseEntity<coordinator>(n,HttpStatus.CREATED);
      }
     @GetMapping("/coordinator/{email}/{password}")
     public ResponseEntity<coordinator> login(@PathVariable("email")String em,@PathVariable("password")String password)
     {
	   coordinator n=as.login(em, password);
	   return new ResponseEntity<coordinator>(n,HttpStatus.OK);
     }

}