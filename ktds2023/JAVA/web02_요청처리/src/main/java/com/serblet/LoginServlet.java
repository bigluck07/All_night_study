package com.serblet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// http://localhost:8090/app2/xxx
// 서블릿매핑 방법 중 어노테이션
@WebServlet("/xxx")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("LoginServlet: doGet");
		// 사용자 입력데이터 얻기 ( 폼데이터 얻기 )
		String id = request.getParameter("userid");
		String pw = request.getParameter("passwd");
		
		// 응답처리
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.print("아이디:"+id);
			out.print("비번:"+pw);
			out.print("</body>");
			out.print("</html>");
			
		
	}
	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("LoginServlet: doPost");
		// 사용자 입력데이터 얻기 ( 폼데이터 얻기 )
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("userid");
		String pw = request.getParameter("passwd");
		
		// 응답처리
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.print("아이디:"+id);
			out.print("비번:"+pw);
			out.print("</body>");
			out.print("</html>");
	}

}
