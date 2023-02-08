package com.example.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dto.MemberDTO;
import com.example.service.MemberService;




@Controller
public class LoginController {

	@Autowired
	MemberService service;
	
	@RequestMapping("/login")
	public String login(@RequestParam Map<String, String> map, Model model, HttpSession sess) {
		String page = "memberResult";
		
		model.addAttribute("action", "로그인");
		try {
			MemberDTO dto = service.login(map);
			if (dto == null)
				throw new Exception();
			
			sess.setAttribute("user", dto.getUserid());
			page = "shopMain";
		} catch (Exception e) {
			model.addAttribute("message", "로그인 실패");
		}
		
		return page; 
	}//
	
	@RequestMapping("/logout")
	public String logout() {
		
		/*
		 * 
		 * 
		 */
				
		return "redirect:/";
	}
	
}





