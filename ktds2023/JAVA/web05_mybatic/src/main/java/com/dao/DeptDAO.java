package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.DeptDTO;

public class DeptDAO {

	public List<DeptDTO> list(SqlSession session) throws Exception {
		// 1. 단일 행
//		DeptDTO dto1 = session.selectOne("mapper id");
//		DeptDTO dto2 = session.selectOne("mapper id", 값); // 값 = sql문으로 넘겨주는 데이터
		// 2. 다중 행
//		List<DeptDTO> list1 = session.selectList("mapper id");
//		List<DeptDTO> list2 = session.selectList("mapper id", 값);
//		List<DeptDTO> list3 = session.selectList("mapper id", 값, RowBounds);
		
		List<DeptDTO> list = session.selectList("com.config.DeptMapper.deptAll");
		return list;
	}
	public int write(SqlSession session, DeptDTO dto) throws Exception {
		int n = session.insert("com.config.DeptMapper.write", dto); // 영향받은 데이터 갯수
		return n;
	}
	
	public DeptDTO retrieve(SqlSession session, int deptno) throws Exception {
		DeptDTO dto = session.selectOne("com.config.DeptMapper.retrieve", deptno);
		return dto;	
	}
	
	public int update(SqlSession session, DeptDTO dto) throws Exception {
		int n = session.update("com.config.DeptMapper.update", dto);
		return n;
	}
	
	public int delete(SqlSession session, int deptno) throws Exception {
		int n = session.delete("com.config.DeptMapper.delete", deptno);
		return n;
	}
	
	public List<DeptDTO> list(SqlSession session, HashMap<String, String> map) throws Exception {
		List<DeptDTO> list = session.selectList("com.config.DeptMapper.list", map);
		return list;
	}
}
