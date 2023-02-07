package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DeptDAO;
import com.example.dto.DeptDTO;


public interface DeptService {

	public List<DeptDTO> list() throws Exception;
	public void insertAndDelete(DeptDTO dto, int deptno)throws Exception;
}
