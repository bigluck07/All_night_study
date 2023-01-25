package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.DeptDTO;
import com.service.DeptServiceImpl;


@WebServlet("/DeptSelectServlet")
public class DeptSelectServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		// service 연동
		DeptServiceImpl service = new DeptServiceImpl();
		List<DeptDTO> list = service.select(null);

		//1. JSP에서 보여줄 데이터 저장 ( scope )
		request.setAttribute("list", list);
//		response.setContentType("text/html;charset=utf-8"); // 서버의 한글데이터를 브라우저에서 보여주기 위해 한글 처리

		//2. JSP 위임( redirect, forward )
		RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
		dis.forward(request, response);
		
		// 응답처리 ==>  나중에 jsp로 처리
//		response.setContentType("text/html;charset=utf-8"); // 서버의 한글데이터를 브라우저에서 보여주기 위해 한글 처리
//		PrintWriter out = response.getWriter();
//		out.print("<html><body>");
//		for (DeptDTO dto : list) {
//			out.print(dto+"<br>");
//		}
//		out.print("<html><body>");
//	}

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 한글처리
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
