package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	
	   @GetMapping("/employees")
		 public List<String> getAllEmployees() {
		   
		   List<String> list= List.of("John Doe", "Jane Smith", "Alice Johnson");
		     return list;
		 }
	
  
}
