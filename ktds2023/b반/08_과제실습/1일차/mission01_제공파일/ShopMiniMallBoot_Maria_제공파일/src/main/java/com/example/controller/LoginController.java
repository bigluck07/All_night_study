package com.example.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;





public class LoginController {

	@RequestMapping("/login")
	public String login() {
		String page = "";
	
		/*
		 * 
		 * 
		 */
		
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





