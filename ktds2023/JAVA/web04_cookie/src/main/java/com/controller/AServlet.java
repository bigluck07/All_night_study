package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AServlet
 */
@WebServlet("/AServlet")
public class AServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		// 쿠키 생성
		//1. Cookie 객체 생성
		Cookie c = new Cookie("ktds", "servlet");
		
		// 파일에 저장
		c.setMaxAge(3600);
		
		//2. Cookie 브라우저에 전송
		response.addCookie(c);
		
		//3. 화면처리(jsp에게 위임 혹은 직접 처리)
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
