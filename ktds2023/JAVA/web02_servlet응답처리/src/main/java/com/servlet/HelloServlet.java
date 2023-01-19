package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		// 요청처리(비즈니스 로직)
		
		// 응답처리
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("hello, 안녕하세요");
		out.print("</body>");
		out.print("</html>");
	}

}
