package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.BoardDTO;

@Repository
public class BoardDAO {
	
	@Autowired
	SqlSessionTemplate session;
	
	// 목록보기
	public List<BoardDTO> list() throws Exception{
		return session.selectList("com.config.BoardMapper.list"); // id값
	}
	
	// 글저장
	public int write(BoardDTO dto) throws Exception{
		return session.insert("com.config.BoardMapper.write", dto);
	}
}
