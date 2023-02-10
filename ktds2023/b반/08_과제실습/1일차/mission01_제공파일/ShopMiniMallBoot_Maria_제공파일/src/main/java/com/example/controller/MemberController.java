package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dto.MemberDTO;
import com.example.service.MemberService;


public class MemberController {

	
	@RequestMapping("/signUp")
	public String loginUI() {
		
		return "signUpForm";		
	}
	
	@RequestMapping(value="/idCheck", produces = "text/plain;charset=UTF-8")
	@ResponseBody 
	public String idCheck(@RequestParam("id") String userid,
			@RequestParam("pw") String pw) {
		String mesg = "사용가능";

		/* 
		 * 
		 */
		
		return mesg;		
	}
	
	
	@RequestMapping(value="/signUp", method = RequestMethod.POST)
	public String memberAdd(){
		
		 /* 
		  * 
		  */
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