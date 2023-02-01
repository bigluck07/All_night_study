package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BoardDAO;
import com.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardDAO dao;
	
	@Override
	public List<BoardDTO> list() throws Exception{
		return dao.list();
	}
	
	@Override
	public int write(BoardDTO dto) throws Exception{
		return dao.write(dto);
	}

}
