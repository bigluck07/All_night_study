package com.example.service;

import java.util.Arrays;
import java.util.List;

import com.example.dao.DeptDAO;

public class DeptService {

	DeptDAO dao;
	
	
	public DeptService() {
	}

	public DeptService(DeptDAO dao) {
		System.out.println("DeptService 생성자");
		this.dao = dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}



	public List<String> list(){
		return dao.list();
	}
}
