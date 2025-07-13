package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MyService;

@RestController
public class MyController {
	
	@Autowired
	private MyService myService;
	
	@GetMapping("/names")
	public List<String> retrieveNames() {
		return myService.getName();
		
	}
	
	@GetMapping("/namess")
	public List<String> retrieveNamess() {
		return myService.getName();
		
	}

}
