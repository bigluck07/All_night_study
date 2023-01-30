package com.service;

import java.util.Arrays;
import java.util.List;
import com.dao.DeptDAO;

public class DeptServiceImpl {
	
	DeptDAO dao;
	
	// setter 주입
	public void setDAO(DeptDAO dao) {
		System.out.println("setDAO");
		this.dao = dao;
	}
	
	public List<String> list() {
		return dao.list();
	}
}
