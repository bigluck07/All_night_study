package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/main")
	public String main() {
		return "main"; //  /WEB-INF/views/main.jsp
	}
}
