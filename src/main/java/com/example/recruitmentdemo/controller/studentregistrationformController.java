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
import org.springframework.web.bind.annotation.RestController;

import com.example.recruitmentdemo.model.studentregistrationform;
import com.example.recruitmentdemo.service.studentregistrationformService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class studentregistrationformController {
@Autowired
studentregistrationformService rs;
@GetMapping("/Registration")
public List<studentregistrationform> getAll()
{
  return rs.getAll();	
}
@PostMapping("/Registration")
public ResponseEntity<studentregistrationform> Register(@RequestBody studentregistrationform r)
{
	studentregistrationform rn=rs.save(r);
	return new ResponseEntity<> (rn,HttpStatus.CREATED);
}
@GetMapping("/Registration/{id}")
public ResponseEntity<studentregistrationform>search(@PathVariable("id")int i)
{
	studentregistrationform rn=rs.search(i);
	return new ResponseEntity<>(rn,HttpStatus.OK);
}
@DeleteMapping("/Registration/{id}")
public ResponseEntity<Void>delete(@PathVariable("id")int i)
{
   	rs.delete(i);
   	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
@PutMapping("/Registration/{id}")
public ResponseEntity<studentregistrationform>update(@PathVariable("id")int i,@RequestBody studentregistrationform r)
{
	studentregistrationform rn=rs.update(i,r);
	return new ResponseEntity<>(rn,HttpStatus.OK);
}
@GetMapping("/studentregistrationfrom/{email}/{password}")
public ResponseEntity<studentregistrationform> login(@PathVariable("email")String em,@PathVariable("password")String password)
{
	studentregistrationform r=rs.login(em, password);
  return new ResponseEntity<studentregistrationform>(r,HttpStatus.OK);
}
}




















