package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.DeptDTO;

@Repository("dao")
public class DeptDAO {
	
	@Autowired
	SqlSessionTemplate session; // JSP버전의 SqlSeesion과 동일
	
	// Dept 목록보기
	public List<DeptDTO> list() {
		return session.selectList("com.config.DeptMapper.deptAll");
	}
}
