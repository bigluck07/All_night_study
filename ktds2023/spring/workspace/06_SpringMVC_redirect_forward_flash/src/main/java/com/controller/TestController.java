package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/redirect") // main으로 변경, model 값 못 가져옴
	public String redirect(Model m) {
		m.addAttribute("mesg", "hello");
		return "redirect:main";
	}
	
	
	/*
	 *  flash scope : redirect해서 값 한번 가져올 수 있다.
	 *  <mvc:annotation-driven />
	 *	<mvc:default-servlet-handler/>
	 */
	@RequestMapping("/flash") // main으로 변경, model 값 못 가져옴
	public String flash(RedirectAttributes m) {
		m.addFlashAttribute("mesg", "hello");
		return "redirect:main";
	}
	

	@RequestMapping("/forward") // main으로 변경x, model 값 가져옴
	public String forward(Model m) {
		m.addAttribute("mesg", "hello");
		return "forward:main";
	}

}
