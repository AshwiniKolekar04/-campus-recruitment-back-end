package com.example.recruitmentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.recruitmentdemo")
public class RecruitmentdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecruitmentdemoApplication.class, args);
	}

}
