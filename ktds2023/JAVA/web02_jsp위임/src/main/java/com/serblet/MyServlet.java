package com.serblet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// http://localhost:8090/app2/xxx
// 서블릿매핑 방법 중 어노테이션
@WebServlet("/xxx")
public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("MyServlet>>"); 
		
		// 리다이렉트(redirect)
		response.sendRedirect("hello.jsp");
	}

}
