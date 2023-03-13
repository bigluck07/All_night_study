package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Emp;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Long> {
	/*
	 *	저장: save(entity)
	 *	삭제: remove(entity)
	 *	수정: entity 수정
	 *	조회: findById(id)
	 *		 findAll()
	 *
	 *	메소드 기본제공
	 *	추가시 query methods설정 가능
	 *	https://docs.spring.io/spring-data/jpa/docs/2.7.7/reference/html/#jpa.query-methods.query-creation
	 */

	public List<Emp> findByename(String ename);
	public List<Emp> findBydeptno(Long deptno);
	public List<Emp> findBydeptnoAndMgr(Long deptno, Long mgr);
	public List<Emp> findBydeptnoIn(List<Long> deptnoList); // 배열안에 있는 조건
	public List<Emp> findBysalBetween(Integer sal, Integer sal2); // 조건보다 크거나 작은것
	public List<Emp> findBysalLessThan(Integer sal); // 조건보다 작은것
	
	// %ename%
	public List<Emp> findByenameContaining(String ename); // 지정값이 포함되는 전부
	public List<Emp> findByenameContains(String ename); // 지정값이 포함되는 전부
	
	// ename%
	public List<Emp> findByenameStartingWith(String ename); // 지정값 시작
	// %ename
	public List<Emp> findByenameEndingWith(String ename); // 지정값 끝
	
	// null값 찾기
	public List<Emp> findByCommNull();
	public List<Emp> findByCommNotNull();
}
