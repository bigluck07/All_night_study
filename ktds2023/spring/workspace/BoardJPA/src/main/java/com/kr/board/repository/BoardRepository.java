package com.kr.board.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kr.board.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("update Board b set b.readcnt=b.readcnt+1 where b.num=:num")
	public void readCntInc(@Param("num") Integer num);
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query("update Board b set b.writer=:writer, b.subject=:subject, b.content=:content where b.num=:num")
	public void updateBoard(@Param("writer") String writer, @Param("subject") String subject, 
			@Param("content") String content, @Param("num") Integer num);	
	
	public List<Board> findByWriterContainsOrderByNumDesc(String word);
	public List<Board> findBySubjectContainsOrderByNumDesc(String word);
	public List<Board> findByContentContainsOrderByNumDesc(String word);
}
