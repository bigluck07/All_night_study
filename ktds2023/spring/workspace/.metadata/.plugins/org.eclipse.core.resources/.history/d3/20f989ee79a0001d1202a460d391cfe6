package com.service;

import java.util.Arrays;
import java.util.List;
import com.dao.DeptDAO;

public class DeptServiceImpl {
	
	DeptDAO dao;
	
	// 생성자 주입
	public DeptServiceImpl(DeptDAO dao) {
		// spring 전
//		 this.dao = new DeptDAO();
		
		// spring
		System.out.println("생성자 호출");
		this.dao = dao;
	}
	
	public List<String> list() {
		return dao.list();
	}
}
