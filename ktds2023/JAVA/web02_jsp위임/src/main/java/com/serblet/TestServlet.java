package com.serblet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// http://localhost:8090/app2/xxx
// 서블릿 매핑 web.xml에서 설정
@WebServlet("/yyy")
public class TestServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("TestServlet>>"); // 서버 consol에 출력, 브라우저에 출력 안됨.
		
		// 포워드
		request.getRequestDispatcher("hello.jsp")
				.forward(request, response);
	
	}

}
