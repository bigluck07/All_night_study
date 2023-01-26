package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.DeptDTO;

/**
 * Servlet implementation class AServlet
 */
@WebServlet("/ScopeServlet")
public class ScopeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// request scope에 저장
		request.setAttribute("a", "홍길동");
		
		// session scope에 저장
		HttpSession session = request.getSession();
		session.setAttribute("a", "이순신");
		
		// application scope
		ServletContext application = getServletContext();
		application.setAttribute("a", "유관순");
		
		request.getRequestDispatcher("scope.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

