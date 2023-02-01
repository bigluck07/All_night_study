package com.service;

import java.util.List;

import com.dto.BoardDTO;

public interface BoardService {
	public List<BoardDTO> list() throws Exception;
	public int write(BoardDTO dto) throws Exception;

}
