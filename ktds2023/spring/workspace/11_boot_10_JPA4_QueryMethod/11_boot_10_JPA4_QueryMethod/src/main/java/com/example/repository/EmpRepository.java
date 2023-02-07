package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Emp;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Long> {
  /*
   *   저장: save(entity)
   *   삭제: remove(entity)
   *   수정: entity 수정
   *   조회: findById(id)   
   *        findAll()
   *   
   *    위 메서드는 기본적으로 제공됨. 
   *    메서드 추가시  query methods 설정가능.
   *    https://docs.spring.io/spring-data/jpa/docs/2.7.7/reference/html/#jpa.query-methods    
   */
	public List<Emp> findByename(String ename);
	public List<Emp> findBydeptno(Long deptno);
	public List<Emp> findBydeptnoAndMgr(Long deptno, Long mgr);
	public List<Emp> findBydeptnoIn(List<Long> deptnoList);
	public List<Emp> findBysalBetween(Integer sal, Integer sal2);
	public List<Emp> findBysalLessThan(Integer sal);
	// %ename%
	public List<Emp> findByenameContaining(String ename);
	public List<Emp> findByenameContains(String ename);
	// ename%
	public List<Emp> findByenameStartingWith(String ename);
	// %ename
	public List<Emp> findByenameEndingWith(String ename);
	// null 값 찾기
	public List<Emp> findByCommNull();
	public List<Emp> findByCommNotNull();
}






