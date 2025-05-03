package com.example.recruitmentdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.recruitmentdemo.model.updatedata;
import com.example.recruitmentdemo.service.updatedataService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/updatedata")  // <-- Prefix all endpoints in this controller
public class updatedatacontroller {
	

	    @Autowired
	    updatedataService as;

	    @GetMapping
	    public List<updatedata> getAll() {
	        return as.getAll();
	    }

	    @PostMapping
	    public ResponseEntity<updatedata> company(@RequestBody updatedata r) {
	    	updatedata rn = as.save(r);
	        return new ResponseEntity<>(rn, HttpStatus.CREATED);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<updatedata> search(@PathVariable("id") int i) {
	    	updatedata rn = as.search(i);
	        return new ResponseEntity<>(rn, HttpStatus.OK);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> delete(@PathVariable("id") int i) {
	        as.delete(i);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<updatedata> update(@PathVariable("id") int i, @RequestBody updatedata r) {
	    	updatedata rn = as.update(i, r);
	        return new ResponseEntity<>(rn, HttpStatus.OK);
	    }

	    
	}


