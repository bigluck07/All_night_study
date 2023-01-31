package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.DeptDTO;

public interface DeptService{

	// 구현 작업을 추상 메서드로 만들기
	// DeptListServlet
	public List<DeptDTO> list() throws Exception; // SqlSession session 가 없음 -> 얘가 만들어저 넘겨줄거라
	
	// DeptSearchServlet
	public List<DeptDTO> list(HashMap<String, String> map) throws Exception;
	
	public int write(DeptDTO dto) throws Exception;
	
	public DeptDTO retrieve(int deptno) throws Exception;
	
	public int update(DeptDTO dto) throws Exception;
	
	public int delete(int deptno) throws Exception;
	
}
