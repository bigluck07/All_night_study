package com.kr.board.controller;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.kr.board.entity.Board;
import com.kr.board.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@Autowired
	ServletContext servletContext;
	
	@GetMapping("/")
	public String main() {
		return "main";
	}
	@GetMapping("/boardlist")
	public ModelAndView boardList() {
		ModelAndView mv = new ModelAndView();
		try {
			List<Board> boards = boardService.boardList();
			mv.addObject("boards", boards);
			mv.setViewName("boardlist");
		} catch(Exception e) {
			mv.addObject("err", "게시판 조회 오류");
			mv.setViewName("error");
		}
		return mv;
	}
	
	@GetMapping("/writeform")
	public String writeForm() {
		return "writeform";
	}
	
	@PostMapping("/boardwrite") 
	public ModelAndView boardwrite(@ModelAttribute Board board, 
			@RequestParam(name="file", required = false) MultipartFile file) {
		ModelAndView mv = new ModelAndView();
		try {
			boardService.boardWrite(board, file);
			mv.setViewName("redirect:/");
		} catch(Exception e) {
			e.printStackTrace();
			mv.addObject("err", "글쓰기 오류");
			mv.setViewName("error");
		}
		return mv;
	}
	
	@GetMapping("/detail/{num}")
	public ModelAndView boardDetail(@PathVariable Integer num) {
		ModelAndView mv = new ModelAndView();
		try {
			Board board = boardService.boardDetail(num);
			mv.addObject("article", board);
			mv.setViewName("detailform");
		} catch(Exception e) {
			e.printStackTrace();
			mv.addObject("err", "글 상세보기 오류");
			mv.setViewName("error");
		}
		return mv;
	}
	
	@GetMapping("/image/{filename}")
	public void imageView(@PathVariable String filename, HttpServletResponse response) {
		System.out.println(filename);
		try {
			String path = servletContext.getRealPath("/upload/");
			FileInputStream fis = new FileInputStream(path+filename);
			OutputStream out = response.getOutputStream();
			FileCopyUtils.copy(fis, out);
			fis.close();
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@GetMapping("/delete/{num}")
	public ModelAndView deleteBoard(@PathVariable Integer num) {
		ModelAndView mv = new ModelAndView();
		try {
			boardService.deleteBoard(num);
			mv.setViewName("redirect:/");
		} catch(Exception e) {
			e.printStackTrace();
			mv.addObject("err", "글 삭제 오류");
			mv.setViewName("error");
		}
		return mv;
	}
	
	@PostMapping("/search")
	public ModelAndView search(@RequestParam("type") String type, @RequestParam("word") String word) {
		ModelAndView mv = new ModelAndView();
		try {
			List<Board> boards = boardService.searchBoard(type, word);
			mv.addObject("boards", boards);
			mv.setViewName("boardlist");
		} catch(Exception e) {
			e.printStackTrace();
			mv.addObject("err","검색 오류");
			mv.setViewName("error");
		}
		return mv;
	}
	
	@PostMapping("/boardmoify")
	public ModelAndView boardModify(@RequestParam("writer") String writer,@RequestParam("subject") String subject,
			@RequestParam("content") String content, @RequestParam("num") Integer num) {
		ModelAndView mv = new ModelAndView();
		try {
			boardService.boardModify(writer, subject, content, num);
			mv.setViewName("redirect:/");
		}catch(Exception e) {
			e.printStackTrace();
			mv.addObject("err","검색 오류");
			mv.setViewName("error");
		}
		return mv;
	}
}
