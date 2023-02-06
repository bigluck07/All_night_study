package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Testcontroller {

	@GetMapping("/main")
	public String main() {
		return "main";
	}
	
	@GetMapping("/a")
	public String a(Model m) {
		m.addAttribute("userid", "홍길동");
		m.addAttribute("passwd", 1234);
		return "a";
	}
	@GetMapping("/a2")
	public String a2(Model m) {

		return "a2";
	}
}
