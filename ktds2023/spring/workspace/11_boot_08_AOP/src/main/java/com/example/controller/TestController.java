package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/echo")
	public String sayEcho() {
		//부가기능
		// 로그처리 기능이라고 가정
		
		//핵심기능
		System.out.println("sayEcho 메서드 >>>>>>>>>>>>>>>>>");
		return "info";
	}
}
