package com.ex1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/reserveTicket")
public class ReserveTicketServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자 입력값 얻기
		String birthday = request.getParameter("birthday");
		String type = request.getParameter("type");
		
		// 나이계산 및 출력
		StringTokenizer st = new StringTokenizer(birthday, "/");
		Calendar now = Calendar.getInstance(); // 오늘 날짜
		Integer currentYear = now.get(Calendar.YEAR); // 연도
		Integer birthYear = Integer.parseInt(st.nextToken());
		int age = (currentYear - birthYear +1);
		int type2 = Integer.parseInt(type);
//		String outputAge = Integer.toString(age);

		
		HttpSession session = request.getSession();
		session.setAttribute("birthday", birthday);
		session.setAttribute("type", type2);
		session.setAttribute("userage", age);
		
		
		response.sendRedirect("ex1/reservationInfo.jsp");
		
	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ex1/ticket.jsp").forward(request, response);
		
	}

}
