package com.example.service;

import java.util.List;

import com.example.entity.DeptDTO;

public interface DeptService {
	
	public List<DeptDTO> list() throws Exception;
	
	public DeptDTO idCheck(Long deptno) throws Exception;
	
	public void write(DeptDTO dto) throws Exception;
	public void update(DeptDTO dto) throws Exception;
	public void delete(Long deptno) throws Exception;
	
	

}
