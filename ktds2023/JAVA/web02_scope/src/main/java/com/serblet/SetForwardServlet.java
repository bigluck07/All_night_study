package com.serblet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


// http://localhost:8090/app2/xxx
// 서블릿매핑 방법 중 어노테이션
@WebServlet("/setforward")
public class SetForwardServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		// scope에 데이터 저장 (기본형 및 참조형 모두 가능)
		// 1. request scope ( HttpServletRequest ), 요청~응답
		request.setAttribute("request", "request"); // 로컬변수라 저장시 사라짐 근데 forward하면 확장됨
	
		// 2. seeeion scope( HttpSession ) 로그인처리 ==> 나주엥 심화 학습 예정, 브라우저 시작~종료
		HttpSession session = request.getSession();
		session.setAttribute("session", "session");
		
		// 3. application scope ( ServletContext ), 서버 시작~종료
		ServletContext application = getServletContext();
		application.setAttribute("application", "application");
		
		
		// 포워드
		RequestDispatcher dis = request.getRequestDispatcher("get");
		dis.forward(request, response);
	
	}

}
