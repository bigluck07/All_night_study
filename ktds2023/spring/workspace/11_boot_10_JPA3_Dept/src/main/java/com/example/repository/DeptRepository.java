package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Dept;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Long> {
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

	
}
