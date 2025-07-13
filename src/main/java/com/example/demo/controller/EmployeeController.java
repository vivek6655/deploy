package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	
	   @GetMapping("/employees")
		 public String getAllEmployees() {
		   
		   return "vivek kumar sagar from noida and aligarh";
		 }
	
  
}
