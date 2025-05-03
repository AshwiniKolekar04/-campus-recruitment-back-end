package com.example.recruitmentdemo.service;
import com.example.recruitmentdemo.model.student;

public interface studentService {
   student save (student a);
   student login(String em,String ps);
}
