package com.example.service;

import java.util.Arrays;
import java.util.List;

public class DeptService {

	public DeptService() {
		System.out.println("DeptService 생성자");
	}
	
	public List<String> list(){
		return Arrays.asList("A","B","C");
	}
}
