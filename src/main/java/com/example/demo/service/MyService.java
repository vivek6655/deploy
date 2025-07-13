package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	
    public List<String> getName(){
		
		List<String> list=Arrays.asList("vivek","kumar","sagar","from","noida","and","aligarh");
		return list;	
	}
}
