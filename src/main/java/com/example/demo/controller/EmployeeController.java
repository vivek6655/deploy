package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	
	   @RequestMapping("/hello")
		 public String getAllEmployees() {
		   return "hello.jsp";
		 }
	
  
}
