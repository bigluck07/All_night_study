package com.example.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Application;
import com.example.dto.MemberDTO;
import com.example.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping("/signUp")
	public String loginUI() {
		
		return "signUpForm";		
	}
	
	@RequestMapping(value="/idCheck", produces = "text/plain;charset=UTF-8")
	@ResponseBody 
	public String idCheck(@RequestParam("id") String userid,
						  @RequestParam("pw") String pw) {

		String mesg = "사용가능";
		if(service.idCheck(userid) > 0) {// 중복확인한 값을 int로 받음
			mesg = "사용불가";
		}
		
		return mesg;		
	}
	
	
	@RequestMapping(value="/signUp", method = RequestMethod.POST)
	public String memberAdd(MemberDTO dto, Model model){
		model.addAttribute("action", "회원가입");
		try {
			if (service.memberAdd(dto) != 0) {
				model.addAttribute("message", "회원가입 성공");
			} else {
				throw new Exception();
			}
		} catch(Exception e) {
			model.addAttribute("message", "회원가입 실패");
		}
		return "memberResult";
	}

	@RequestMapping(value = "/updateMember", method = RequestMethod.POST)
	public String memberUpdate() {
		
		/* 
		 * 
		 */
		
		return "memberResult";
	}
	
	@RequestMapping("/mypage")
	public String mypage() {		
		
		/* 
		 * 
		 */
		
		return "mypage";  
	}		
	

}