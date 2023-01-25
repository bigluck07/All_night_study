package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * servlet implementation class LoginformServlet
 * 
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 사용자 입력값 얻기
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		// id, pw이용해서 DB연동해서 존재여부 확인
		
		// DB에서 가져온 사용자 데이터 세션에 저장 후 다른 페이지에서 사용자 정보를 조회 및 사용
		// 1. 빨간박스 얻기
		// request.getSession(): 빨간 박스 있음 재사용, 없음 생성
		HttpSession session = request.getSession();
		
		// 2. 데이터 저장
		session.setAttribute("user", userid);
	
		// 3. 로그인 이후 화면 처리
		response.sendRedirect("info.jsp");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}
}
