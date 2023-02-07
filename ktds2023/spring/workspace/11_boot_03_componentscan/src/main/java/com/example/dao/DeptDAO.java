package com.example.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class DeptDAO {
	public DeptDAO() {
		System.out.println("DeptDAO 생성자");		
	}
	public List<String> list(){
		return Arrays.asList("A","B","C");
	}
}
