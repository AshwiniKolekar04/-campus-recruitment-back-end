package com.example.recruitmentdemo.service;

import com.example.recruitmentdemo.model.coordinator;

public interface coordinatorService {
   coordinator save (coordinator a);
   coordinator login(String em,String ps);
}
