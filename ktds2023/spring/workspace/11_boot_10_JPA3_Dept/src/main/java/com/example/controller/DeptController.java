package com.example.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.DeptDTO;
import com.example.entity.User;
import com.example.service.DeptService;

@Controller
public class DeptController {

	@Autowired
	DeptService service;
	
	@GetMapping("/list")
	@ModelAttribute("list")
	public List<DeptDTO> list() throws Exception{
		return service.list();
	}
	
	@GetMapping("/writeForm")
	public String writeForm() throws Exception {

		return "write";
	}
	
	
	@GetMapping("/idcheck")
	@ResponseBody // sting을 view가 아니라 그냥 데이터로 처리함
	public String idcheck(@RequestParam Long deptno) throws Exception {
		
		String mesg = "사용가능";
		DeptDTO dto = service.idCheck(deptno);
		if(dto != null) {
			mesg = "사용불가";
		}
		return mesg;
	}
	
	
	@GetMapping("/write")
	public String write(DeptDTO dto) throws Exception {
		service.write(dto);
		return "redirect:list";
	}
	
	@GetMapping("/retrieve/{deptno}")
	public ModelAndView retrieve(@PathVariable Long deptno) throws Exception {
		DeptDTO dto = service.idCheck(deptno);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("retrieve");
		mav.addObject("retrieve", dto);
		return mav;
	}

	@GetMapping("/update")
	public String update(DeptDTO dto) throws Exception {
		service.update(dto);
		return "redirect:list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam Long deptno) throws Exception {
		service.delete(deptno);
		return "redirect:list";
	}
	
	@ExceptionHandler({Exception.class})
	public String error() {
		return "error";
	}
}
