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
			
		// TestServlet URL
		// http://localhost:8090/app4/TestServlet
		
		// test.jsp
		// http://localhost:8090/app4/test.jsp
		request.getRequestDispatcher("test.jsp") // 상대경로임 '/'가 없음
			   .forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
