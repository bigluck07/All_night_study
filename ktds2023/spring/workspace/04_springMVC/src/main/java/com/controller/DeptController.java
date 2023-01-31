package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// POJO임 (Plain Old Java Object)

@Controller
public class DeptController { // 비의존적인 class로 web이 아니어도 사용가능

//	@Autowired
	// http://localhost:8090/app/list 요청
	// 목록보기
	@RequestMapping("/list")
	public String list() {
		System.out.println("DetpController.list");
		return "list"; // 화면처리용의 논리적 이름 => InternalResourceViewResolver에 의해
					   // /WEB_INF/views/ + list + .jsp 조합해서 jsp를 찾음 ( 현재 설정이 jsp임 )
	}
	
	// http://localhost:8090/app/delete 요청
	@RequestMapping("/delete")
	public String delete() {
		System.out.println("DetpController.delete");
		return "delete";// /WEB_INF/views/ + delete + .jsp 조합해서 찾음
					   
	}
}
