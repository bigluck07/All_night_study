package com.example.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.entity.Member;

@Controller
public class BoardController {
	
	@Autowired
	EntityManagerFactory factory;

	@GetMapping("/home")
	public String home() throws Exception{
		return "index"; //  /WEB-INF/views/main.jsp
	}
	
	@GetMapping("/logined")
	public String logined() throws Exception{
		return "index2"; //  /WEB-INF/views/main.jsp
	}
	
	@GetMapping("/login")
	public String login() throws Exception{
		return "loginForm"; //  /WEB-INF/views/main.jsp
	}
	@RequestMapping("/login")
	public String login(@RequestParam String userid,
		    			@RequestParam String passwd,
		    			HttpSession session) {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		Member mem = em.find(Member.class, userid);
		tx.commit();
		if (mem.getPasswd().equals(passwd)) {
			session.setAttribute("mem", mem);
			return "redirect:logined";
		} else {
			return "error";
		}
		
		
		
		
	}
	
	@GetMapping("/memberAdd")
	public String memberAdd() throws Exception{
		return "memberForm"; //  /WEB-INF/views/main.jsp
	}
	
	@RequestMapping("/memberAdd")
	public String memberAdd(@RequestParam String userid,
		    			@RequestParam String passwd,
		    			@RequestParam String username,
		    			@RequestParam String email,
		    			@RequestParam String phone,
		    			HttpSession session) {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		Member mem = new Member(userid,email,passwd, phone, username);
		em.persist(mem);
		tx.commit();
		
		return "redirect:home";
		
	}
	
	
	
	@GetMapping("/list")
	public String list() throws Exception{
		return "list"; //  /WEB-INF/views/main.jsp
	}
	
	@GetMapping("/mypage")
	public String mypage() throws Exception{
		
		return "mypage"; //  /WEB-INF/views/main.jsp
	}
}
