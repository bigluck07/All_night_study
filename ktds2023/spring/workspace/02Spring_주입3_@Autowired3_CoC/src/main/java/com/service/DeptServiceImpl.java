package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.dao.DeptDAO;

public class DeptServiceImpl {
	@Autowired
	DeptDAO y; // @Qualifier 없이 쓰려면 변수 명을 bean의 id값과 일치하게 주면 가능
			   // 권장하진 않음
	
	public List<String> list() {
		return y.list();
	}
}
