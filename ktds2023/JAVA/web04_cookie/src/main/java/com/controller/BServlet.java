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
@WebServlet("/BServlet")
public class BServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		// 쿠키 사용
		//1. 요청시 저장된 쿠키 정보 얻기
		Cookie [] cookies = request.getCookies();
		for (Cookie c : cookies) {
			System.out.println(c.getName()+"\t"+c.getValue());
		}
		
		//3. 화면처리(jsp에게 위임 혹은 직접 처리)
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
