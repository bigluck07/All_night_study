package com.example.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MemberDAO;
import com.example.dto.MemberDTO;


@Service("memberService")
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDAO dao;

	public MemberDTO login(Map<String, String> map) throws Exception{
		return null;
	}
	
	public int idCheck(String userid){
		return dao.idCheck(userid);
	}

	public int memberAdd(MemberDTO dto) throws Exception{
		return dao.memberAdd(dto);
	}
	
	public MemberDTO mypage(String userid) {
		return null;
	}

	public int memberUpdate(MemberDTO dto) {
		return 0;
	}
}



