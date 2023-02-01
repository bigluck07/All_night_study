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
public class LoginController { 

	@RequestMapping("/b")
	public String b(@ModelAttribute("xxx") ArrayList<String> list) { // @ModelAttribute("") = key
		
//		list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		
		return "b";
	}
	
	@RequestMapping("/a1")
	public ModelAndView a2() { // model, view 둘다 알려줌
		
		ModelAndView mav = new ModelAndView();
		//모델 저장( view에서 보여줄 데이터 )
		mav.addObject("userid", "홍길동1");
		mav.addObject("passwd", "1234");
		
		//view 저장
		mav.setViewName("a1"); // 
		return mav; // /WEB-INF/View/a.jsp
	}
	
	@RequestMapping("/a2")
	public String a3(Model m) { // view만 알려줌, model은 따로 파라미터로 넣어줌
		m.addAttribute("userid", "홍길동2");
		m.addAttribute("passwd", 12345);
		
		return "a2";
	}
	
	@RequestMapping("/a3")
	public String a(Map<String, Object> m) { // view만 알려줌, model은 따로 파라미터로 넣어줌
		m.put("userid", "홍길동3");
		m.put("passwd", 123456);
		return "a3";
	}
}
