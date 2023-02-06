package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Testcontroller {

//	@GetMapping("/main")
//	public String main() {
//		return "main";
//	}
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
	public String a2() {
		return "a2";
	}
	@GetMapping("/a3")
	public String a3(@RequestParam Long age, 
					 @RequestParam String addr) {
		System.out.println(age + "\t" + addr);
		return "a2";
	}
	@GetMapping("/a4")
//	public String a4(List<String> list) { // List 라서 객체형성 안된
	public List<String> a4() {
		List<String> list = Arrays.asList("A","B","C");
		return list;
	}
}
