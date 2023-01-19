package com.serblet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


// http://localhost:8090/app2/xxx
// 서블릿매핑 방법 중 어노테이션
@WebServlet("/get")
public class GetServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// 형변환이 필수!
		// 1. request scope
		String s  = (String)request.getAttribute("request");
		
		// 2. session scope( HttpSession )
		HttpSession session = request.getSession();
		String s2 = (String)session.getAttribute("session");
		System.out.println(s2);
		// 3. application scope ( ServletContext )
		ServletContext application = getServletContext();
		String s3= (String)application.getAttribute("application");
		
		// 응답처리
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("request scope" + s);
		out.print("seeeion scope" + s2);
		out.print("application scope" + s3);
		out.print("</body>");
		out.print("</html>");
		
	}
}		
