package com.example.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
public class TestController4 {
	@GetMapping("/x")
	public String x() {
		System.out.println("GET");
		return "main";    
	}
	@PostMapping("/x2")
	public String x2() {
		System.out.println("POST");
		return "main";    
	}
	@PutMapping("/x3")
	public String x3() {
		System.out.println("PUT");
		return "main";   
	}
	@DeleteMapping("/x4")
	public String x4() {
		System.out.println("Delete");
		return "main";    
	}
}





