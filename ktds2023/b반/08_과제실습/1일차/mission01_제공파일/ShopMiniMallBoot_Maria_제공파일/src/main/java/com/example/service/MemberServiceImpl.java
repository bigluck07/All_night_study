package com.example.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MemberDAO;
import com.example.dto.MemberDTO;



public class MemberServiceImpl implements MemberService{

	public MemberDTO login(Map<String, String> map) {
		return null;
	}
	
	public int idCheck(String userid) {
		return 0;
	}

	public int memberAdd(MemberDTO dto) {
		return 0;
	}
	
	public MemberDTO mypage(String userid) {
		return null;
	}

	public int memberUpdate(MemberDTO dto) {
		return 0;
	}
}



