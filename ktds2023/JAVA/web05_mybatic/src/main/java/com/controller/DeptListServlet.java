package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.DeptDTO;
import com.service.DeptService;
import com.service.DeptServiceImpl;

/**
 * Servlet implementation class DeptListSerblet
 */
@WebServlet("/DeptListServlet")
public class DeptListServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String deptno = request.getParameter("deptno");
		
		DeptService service = new DeptServiceImpl();
		DeptDTO dto = null;
		List<DeptDTO> list = null;
		try {
			list = service.list();
//					service.retrieve(Integer.parseInt(deptno));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("deptList", list);
		
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
