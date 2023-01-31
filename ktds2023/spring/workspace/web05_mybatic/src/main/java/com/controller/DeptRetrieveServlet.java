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
@WebServlet("/DeptRetrieveServlet")
public class DeptRetrieveServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//db연동 필요
	
		// 입력값 받아오기
		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		
		DeptDTO dto = new DeptDTO(Integer.parseInt(deptno), dname, loc);
		
		DeptService service = new DeptServiceImpl();
			try {
				dto = service.retrieve(Integer.parseInt(deptno));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(dto.getDname());
			
			request.setAttribute("dto", dto);
			
			request.getRequestDispatcher("retrieve.jsp").forward(request, response);
			
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
