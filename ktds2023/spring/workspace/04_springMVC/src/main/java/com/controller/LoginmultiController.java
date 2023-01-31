package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;
import com.dto.LoginMultiDTO;

// POJO임 (Plain Old Java Object)

@Controller
public class LoginmultiController { // 비의존적인 class로 web이 아니어도 사용가능

	// http://localhost:8090/app/loginform
	@RequestMapping("/loginform2")
	public String loginform() {
		
		return "loginform";	//	/WEB_INF/views/loginform.jsp	   
	}
	
	@RequestMapping("/loginMulti")
	public String login(LoginMultiDTO mdto) {
		System.out.println(mdto);
		
		return "loginform";	 
	}
}
