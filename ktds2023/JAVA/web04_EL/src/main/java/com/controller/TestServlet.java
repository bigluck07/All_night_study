package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.DeptDTO;

/**
 * Servlet implementation class AServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		// scope에 저장
		request.setAttribute("a", "홍길동");
		
		DeptDTO dto = new DeptDTO(10, "개발", "서울");
		request.setAttribute("dto", dto);
		
		
		// 여러개 값을 리스트로 만들때
		List<String> xxx = Arrays.asList("a","b","c");
				
		List<DeptDTO> list = Arrays.asList(new DeptDTO(10, "개발1", "서울"),
										   new DeptDTO(20, "개발2", "서울"),
										   new DeptDTO(30, "개발3", "서울"));
		request.setAttribute("list", list);
		
		
		// jsp 위임
		request.getRequestDispatcher("test.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
