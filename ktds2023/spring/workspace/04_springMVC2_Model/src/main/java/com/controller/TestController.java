package com.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

// POJO임 (Plain Old Java Object)

@Controller
public class TestController { 

	// return type 설명
	@RequestMapping("/c") // CoC로 requestMapping name을 가지고 view를 찾음
	public void c() {
	}
	
	
	@RequestMapping("/d") // CoC로 requestMapping name을 가지고 view를 찾음
	public @ModelAttribute("dto") LoginDTO d() { // Servlet에게 LoginDTO라는 모델정보만 보냄 view는 CoC
		return new LoginDTO("홍길동", "1234");
	}
	
	@RequestMapping("/e") // CoC로 requestMapping name을 가지고 view를 찾음
	@ModelAttribute("dto")
	public LoginDTO e() { // Servlet에게 LoginDTO라는 모델정보만 보냄 view는 CoC
		return new LoginDTO("홍길동", "1234");
	}
}
