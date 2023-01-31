package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;

import com.dto.DeptDTO;
import com.service.DeptService;
import com.service.DeptServiceImpl;

/**
 * Servlet implementation class DeptListSerblet
 */
@WebServlet("/DeptDeleteServlet")
public class DeptDeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 입력값 받아오기
		String deptno = request.getParameter("deptno");
		
		DeptService service = new DeptServiceImpl();
			try {
				int n = service.delete(Integer.parseInt(deptno));
			} catch (Exception e) {
				e.printStackTrace();
			}
		
			// 화면처리( 부서 작성 후 목록보기로 돌아감)
			response.sendRedirect("DeptListServlet"); // list.jsp 아님
			
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
