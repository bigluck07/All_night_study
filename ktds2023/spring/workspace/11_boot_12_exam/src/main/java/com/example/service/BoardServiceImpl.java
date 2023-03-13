/**
 * 
 */
package com.example.service;

@Service("boardservice")
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Reposit
import org.springframework.stereotype.Service;ory;

import com.example.entity.Board;
import com.example.entity.Member;
import com.example.repository.MemberRepository;


public class BoardServiceImpl implements BoardService {

	@Autowired
	MemberRepository mbreposigory;
	
	@Override
	public List<Board> list() throws Exception {

		return null;
	}

}
