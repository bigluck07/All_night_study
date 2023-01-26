package com.controller;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.DeptDTO;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("userid", "admin");
		
		List<String> list =  Arrays.asList("A","B","C");
		request.setAttribute("list", list);
		
		List<DeptDTO> dtoList = Arrays.asList(new DeptDTO(10, "개발1", "서울"),
											  new DeptDTO(20, "개발2", "서울"),
											  new DeptDTO(30, "개발3", "서울"));
		
		request.setAttribute("dtoList", dtoList);
		
		request.getRequestDispatcher("test.jsp").forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}
