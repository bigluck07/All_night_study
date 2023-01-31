package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.dao.DeptDAO;

public class DeptServiceImpl {
	@Autowired
	@Qualifier(value="y2")
	DeptDAO dao;
	
	public List<String> list() {
		return dao.list();
	}
}
