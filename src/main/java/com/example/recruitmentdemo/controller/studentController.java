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

import com.example.recruitmentdemo.model.student;
import com.example.recruitmentdemo.service.studentService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class studentController {
   @Autowired
   studentService as;
   
     @PostMapping("/student")
     public ResponseEntity<student> add(@RequestBody student ad)
      {
    	 student n=as.save(ad);
	    return new ResponseEntity<student>(n,HttpStatus.CREATED);
      }
     @GetMapping("/student/{email}/{password}")
     public ResponseEntity<student> login(@PathVariable("email")String em,@PathVariable("password")String password)
     {
    	 student n=as.login(em, password);
	   return new ResponseEntity<student>(n,HttpStatus.OK);
     }

}