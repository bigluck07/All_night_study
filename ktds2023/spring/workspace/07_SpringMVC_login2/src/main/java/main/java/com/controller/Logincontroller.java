package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.MemberDTO;

@Controller
public class Logincontroller {
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam String userid,
					    @RequestParam String passwd, HttpSession session) {
		
		// userid, passwd 이용해서 DB연동 후 체크
		// 모두 값이 일치한다고 가정, 따라서 HttpSession에 저장
		MemberDTO mem = new MemberDTO(userid, passwd, "홍길동", "서울");
		session.setAttribute("mem", mem);
		return "login"; // jsp 파일명
	}
	
	@RequestMapping("/mypage")
	public String mypage(HttpSession session) { // null인지 확인해야함
		//  사용여부 확인 후 세션 만료 시 재로그인 유도
		MemberDTO mem = (MemberDTO)session.getAttribute("mem");
		if(mem == null) {
			// 로그인을 안했거나 또는 로그인 했지만 time-out된 경우
			return "redirect:loginForm";
		}
		
		return "mypage";
	}

}
