package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.DeptDAO;
import com.example.dto.DeptDTO;

@Service("xxx")
public class DeptServiceImpl implements DeptService {

	@Autowired
	DeptDAO dao;

	public List<DeptDTO> list() throws Exception{
		return dao.list();
	}
	
	//트랜잭션: 여러작업을 하나처럼 동작하도록 하기 위해서 묶음
	@Transactional // 메서드내에서 RuntimeException이 발생되면 모든 작업을 롤백함.
	public void insertAndDelete(DeptDTO dto, int deptno)throws Exception{
		
		int n = dao.insert(dto);
		int n2 = dao.delete(deptno);
	}
	
}


