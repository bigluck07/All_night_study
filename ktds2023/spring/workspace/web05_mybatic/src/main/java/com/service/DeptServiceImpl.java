package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySQLSessionFactory;
import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptServiceImpl implements DeptService {
	
	// 구현하기 -> 추상 메서드로
	/*
	 * SqlSession session = MySQLSessionFactory.getsession();
	 * try {
			DeptDAO dao = new DeptDAO();

		
		} finally {
			session.close();
		}
	 */
	@Override
	public List<DeptDTO> list() throws Exception{
		List<DeptDTO> list = null;
		SqlSession session = MySQLSessionFactory.getsession();
		try {
			DeptDAO dao = new DeptDAO();
			list = dao.list(session);
		
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public int write(DeptDTO dto) throws Exception {
		SqlSession session = MySQLSessionFactory.getsession();
		int n = 0;
		try {
			DeptDAO dao = new DeptDAO();
			n = dao.write(session, dto); // auto commit 아님
			session.commit(); // 명시적으로 commit 필수
		} finally {
			session.close();
		}
		return n;
	}

	@Override
	public DeptDTO retrieve(int deptno) throws Exception {
		SqlSession session = MySQLSessionFactory.getsession();
		DeptDTO dto = null;
		try {
			DeptDAO dao = new DeptDAO();
			dto = dao.retrieve(session, deptno);
		} finally {
			session.close();
		}
		return dto;
	}

	@Override
	public int update(DeptDTO dto) throws Exception {
		SqlSession session = MySQLSessionFactory.getsession();
		int n = 0;
		try {
			DeptDAO dao = new DeptDAO();
			n = dao.update(session, dto); // DML -> auto commit 아님
			session.commit(); // 명시적으로 commit 필수
		} finally {
			session.close();
		}
		return n;
	}

	@Override
	public int delete(int deptno) throws Exception {
		int n = 0;
		SqlSession session = MySQLSessionFactory.getsession();
		try {
			DeptDAO dao = new DeptDAO();
			n = dao.delete(session, deptno);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	@Override
	public List<DeptDTO> list(HashMap<String, String> map) throws Exception {
		List<DeptDTO> list = null;
		SqlSession session = MySQLSessionFactory.getsession();
		try {
			DeptDAO dao = new DeptDAO();
			list = dao.list(session, map); // list에서 map만 더 넘김
		
		} finally {
			session.close();
		}
		return list;
	}
}
