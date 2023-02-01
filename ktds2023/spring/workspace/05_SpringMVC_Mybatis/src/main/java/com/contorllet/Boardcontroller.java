package com.contorllet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.BoardDTO;
import com.service.BoardService;

@Controller
public class Boardcontroller {
	
	@Autowired
	BoardService service;
	
	@RequestMapping("/list") // 하나니까 얘만 쓰면 됨
	public ModelAndView list() throws Exception{
		// 모델
		List<BoardDTO> list = service.list();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", list);
		mav.setViewName("list"); // /WEB_INF/views/list.jsp
		
		return mav;
	}
	
	
////	@GetMapping("/writeForm")
//	@RequestMapping(value = "/writeForm", method = RequestMethod.GET) // 여러 개라 추가 작성, 아래랑 같음
//	public String writeForm() throws Exception{
//		return "write"; // /WEB_INF/views/write.jsp
//	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(BoardDTO dto) throws Exception{ // DAO까지 끌고 가야함
		int n = service.write(dto);
//		return "list"; // /WEB_INF/views/list.jsp
		return "redirect:list"; // @RequestMapping("/list") 
	}
}
