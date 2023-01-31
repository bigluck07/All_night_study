package com.controller;

import java.io.IOException;
import java.util.HashMap;
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
@WebServlet("/DeptSearchServlet")
public class DeptSearchServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//db연동 필요
	
		// 입력값 받아오기
		String searchName = request.getParameter("searchName"); // 부서명 or 부서위치
		String searchValue = request.getParameter("searchValue");
		
		HashMap<String, String> map = new HashMap<>();
		map.put("searchName", searchName);
		map.put("searchValue", searchValue);
		

		DeptService service = new DeptServiceImpl();
		List<DeptDTO> list = null; // 여러개를 찾을 수 있으니 list
			try {
				list = service.list(map); // 찾을 키워드를 보냄
			} catch (Exception e) {
				e.printStackTrace();
			}
		
			
			request.setAttribute("deptList", list);
			
			request.getRequestDispatcher("search.jsp")
				   .forward(request, response);
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
