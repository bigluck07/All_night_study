package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;

// POJO임 (Plain Old Java Object)

@Controller
public class LoginController { // 비의존적인 class로 web이 아니어도 사용가능

	// http://localhost:8090/app/loginform
	@RequestMapping("/loginform")
	public String loginform() {
		
		return "loginform";	//	/WEB_INF/views/loginform.jsp	   
	}
	
	@RequestMapping("/login")
	public String login(LoginDTO dto) {
		// post 한글처리
		
		
		System.out.println(dto);
		return "loginform";	 
	}
	
	@RequestMapping("/login2")
	public String login2(HttpServletRequest request) {
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		System.out.println(userid+" "+passwd);
		return "loginform";	//	/WEB_INF/views/loginform.jsp	
	}
	
	@RequestMapping("/login3")
	public String login3(@RequestParam("userid") String userid,
						@RequestParam("passwd") String passwd) { // = String userid = request.getParameter("userid");
		System.out.println(userid+" "+passwd);
		return "loginform";	//	/WEB_INF/views/loginform.jsp		   
	}
	
	@RequestMapping("/login4")
	public String login4(@RequestParam String userid, // 
						@RequestParam String passwd) { // = String userid = request.getParameter("userid");
		System.out.println(userid+" "+passwd);
		return "loginform";	//	/WEB_INF/views/loginform.jsp		   
	}
	
	@RequestMapping("/login5")
	public String login5(@RequestParam Map<String, String> map) {
		System.out.println(map);
		return "loginform";	//	/WEB_INF/views/loginform.jsp		   
	}
}
