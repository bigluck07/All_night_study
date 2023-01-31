package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;

public class DeptServiceImpl {
	@Autowired
	DeptDAO dao;
	
	public List<String> list() {
		return dao.list();
		
		
//		// 생성자 주입
////	@Autowired
//	public DeptServiceImpl(DeptDAO dao) {// xml에 DeptDAO가 있으니 자동으로 주입받음
//		this.dao = dao;
//	}
//	
//	public DeptServiceImpl() { // xml에서 constructor 없으면 기본생성자 이용
//	}
//
//
//	// setter 주입
////	@Autowired
//	public void setDAO(DeptDAO dao) {
//		System.out.println("setDAO");
//		this.dao = dao;
//	}
	}
}


