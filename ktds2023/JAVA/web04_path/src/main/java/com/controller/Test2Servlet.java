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
@WebServlet("/Test2Servlet")
public class Test2Servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		// Test2Servlet URL
		// http://localhost:8090/app4/Test2Servlet
		
		// test2.jsp
		// http://localhost:8090/app4/exam/test2.jsp
		
		request.getRequestDispatcher("exam/test2.jsp") // 상대경로
			   .forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
