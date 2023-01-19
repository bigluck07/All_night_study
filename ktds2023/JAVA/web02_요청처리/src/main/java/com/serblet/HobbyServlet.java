package com.serblet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// http://localhost:8090/app2/xxx
// 서블릿 매핑 web.xml에서 설정
@WebServlet("/yyy")
public class HobbyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("HobbyServlet>>"); // 서버 consol에 출력, 브라우저에 출력 안됨.
		
		// checkbox 선택값 얻기 html name이 같아서 request 하면 마지막 하나만 들고옴
		String[] hobbies = request.getParameterValues("hobby");
		
		System.out.println(Arrays.toString(hobbies));
	}

}
