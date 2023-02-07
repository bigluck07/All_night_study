package com.example.dao;

import java.util.Arrays;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dto.DeptDTO;

@Repository
public class DeptDAO {

	@Autowired
	SqlSessionTemplate session;
	
	public List<DeptDTO> list() throws Exception{
		return session.selectList("com.config.DeptMapper.deptAll");
	}
	
	public int insert(DeptDTO dto) throws Exception{
		return session.insert("com.config.DeptMapper.write", dto);
	}
	public int delete(int deptno) throws Exception{
		return session.delete("com.config.DeptMapper.delete", deptno);
	}
}

