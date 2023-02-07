package com.kr.board.service;

import java.io.File;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kr.board.entity.Board;
import com.kr.board.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	private final BoardRepository boardRepository;
	
	@Autowired
	ServletContext servletContxt;
	
	public List<Board> boardList() throws Exception {
		return boardRepository.findAll(Sort.by(Sort.Direction.DESC,"Num"));
	}
	
	public void boardWrite(Board board, MultipartFile file) throws Exception {
		if(file!=null && !file.isEmpty()) {
			String path = servletContxt.getRealPath("/upload/");
			File destFile = new File(path+file.getOriginalFilename());
			file.transferTo(destFile);
			board.setFilename(file.getOriginalFilename());
		}
		boardRepository.save(board);
	}
	
	public Board boardDetail(Integer num) throws Exception {
		Optional<Board> oboard = boardRepository.findById(num);
		if(oboard.isEmpty()) throw new Exception("글번호 오류");
		Board board = oboard.get();
		boardRepository.readCntInc(num);
		return board;
	}
	
	public void deleteBoard(Integer num) throws Exception {
		boardRepository.deleteById(num);
	}
	
	public List<Board> searchBoard(String type, String word) throws Exception {
		if(word.equals("")) {
			return boardList();
		} else if(type.equals("writer")) {
			return boardRepository.findByWriterContainsOrderByNumDesc(word);
		} else if(type.equals("subject")) {
			return boardRepository.findBySubjectContainsOrderByNumDesc(word);
		} else if(type.equals("content")) {
			return boardRepository.findByContentContainsOrderByNumDesc(word);
		} else return boardList();
	}
	
	public void boardModify(String writer, String subject, String content, Integer num) throws Exception {
		boardRepository.updateBoard(writer, subject, content, num);
	}
}
