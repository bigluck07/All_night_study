package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DeptDAO;

@Service("xxx")
public class DeptService {

	@Autowired
	DeptDAO dao;

	public List<String> list(){
		return dao.list();
	}
}
