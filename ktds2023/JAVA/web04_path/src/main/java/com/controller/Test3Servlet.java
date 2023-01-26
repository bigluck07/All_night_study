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
@WebServlet("/Test3Servlet")
public class Test3Servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		// Test3Servlet URL
		// http://localhost:8090/app4/Test3Servlet
		
		// test.jsp
		// http://localhost:8090/app4/test.jsp
		
		request.getRequestDispatcher("/app4/test.jsp") // 절대경로지만, getRequestDispatcher는 예외적으로 상대경로로 인식함. => 에러남
			   .forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
