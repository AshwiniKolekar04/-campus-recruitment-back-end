package com.example.recruitmentdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.recruitmentdemo.model.upcomingcompany;
import com.example.recruitmentdemo.service.upcomingcompanyService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/upcomingcompany")  // <-- Prefix all endpoints in this controller
public class upcomingcompanyController {

    @Autowired
    upcomingcompanyService as;

    @GetMapping
    public List<upcomingcompany> getAll() {
        return as.getAll();
    }

    @PostMapping
    public ResponseEntity<upcomingcompany> company(@RequestBody upcomingcompany r) {
        upcomingcompany rn = as.save(r);
        return new ResponseEntity<>(rn, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<upcomingcompany> search(@PathVariable("id") int i) {
        upcomingcompany rn = as.search(i);
        return new ResponseEntity<>(rn, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int i) {
        as.delete(i);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<upcomingcompany> update(@PathVariable("id") int i, @RequestBody upcomingcompany r) {
        upcomingcompany rn = as.update(i, r);
        return new ResponseEntity<>(rn, HttpStatus.OK);
    }

    
}
