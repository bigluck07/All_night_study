package com.ex2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Product;


@WebServlet("/productReg")
public class ProductRegistrationServlet extends HttpServlet {

	private HashMap<String, Product> products = new HashMap<String, Product>();

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 사용자 입력값 얻기
		String name = request.getParameter("name");	
		String id = request.getParameter("id");
		int amount = Integer.parseInt(request.getParameter("amount"));
		
		if (products.containsKey(id)) {
			System.out.println(products.get(id).getAmount());
			int new_amt = products.get(id).getAmount()+amount;
			products.replace(id, new Product(name, id, new_amt));
		} else {
			products.put(id, new Product(name, id, amount));
		}
		
		Set<String> keys = products.keySet();
		System.out.println(keys);
		for (String string : keys) {
			System.out.println(products.get(string).getName());
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("products", products);
		session.setAttribute("productKeys", keys);
		
		response.sendRedirect("ex2/productInfo.jsp");
	}
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ex2/productForm.jsp").forward(request, response);
			
	}
}
