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
@WebServlet("/CartLisrServlet")
public class CartLisrServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//B역할: 세션을 사용하는 역할.
		//1. 세션얻기
		HttpSession session = request.getSession();
		
		//2. A에서 저장된 값 여부 확인 ( cart/데이터 ==> user로 대체해서 일단 사용하겠음 )
		String data = (String)session.getAttribute("user");
		String nextPage = "";
		if(data==null) {
			// 로그인 안하고 직접 CartLisrServlet 요청
			nextPage = "LoginFormServlet";
		} else {
			// 로그인 한 경우
			nextPage = "cartList.jsp";
		}
		// 화면 처리
		response.sendRedirect(nextPage);
	}//end doGet
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}
}
