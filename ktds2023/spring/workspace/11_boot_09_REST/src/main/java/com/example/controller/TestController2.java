package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dto.DeptDTO;

@Controller
public class TestController2 {

	//1.  기존: 응답이  html(JSP)
	@GetMapping("/aaa")
	public String soap() {
		return "main";    // 화면처리하는 jsp이다.
	}
	
	//2.  Restful: 응답이  JSON
	@GetMapping("/bbb")
	@ResponseBody
	public String rest() {
		return "main";    // 화면처리하는 jsp아니고 그냥 데이터이다.
	}
	@GetMapping("/ccc")
	@ResponseBody
	public DeptDTO rest2() {
		DeptDTO dto = new DeptDTO(10, "인사", "제주");
		return dto;    // 화면처리하는 jsp아니고 그냥 데이터이다.
	}
	@GetMapping("/ddd")
	@ResponseBody
	public List<DeptDTO> rest3() {
		List<DeptDTO> list = Arrays.asList(new DeptDTO(10, "인사", "제주"),
				new DeptDTO(20, "인사2", "제주2")); 
		return list;    // 화면처리하는 jsp아니고 그냥 데이터이다.
	}
}





