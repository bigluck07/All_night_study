package com.serblet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// http://localhost:8090/app2/xxx
// 서블릿 매핑 web.xml에서 설정
public class LifrCycleServlet extends HttpServlet {
	
	int num = 0;
	List<String> list = new ArrayList<>();
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println(">> init"); 
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		num++;
		list.add("hello");
		System.out.println("LifrCycleServlet >>"+num+"\t"+list); // 서버 consol에 출력, 브라우저에 출력 안됨.
	}

}
