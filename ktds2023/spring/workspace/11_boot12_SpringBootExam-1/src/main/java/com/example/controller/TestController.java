package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TestController {
	
	@GetMapping("/main")
	public String main() {
		return "main"; //  /WEB-INF/views/main.jsp
	}
}

