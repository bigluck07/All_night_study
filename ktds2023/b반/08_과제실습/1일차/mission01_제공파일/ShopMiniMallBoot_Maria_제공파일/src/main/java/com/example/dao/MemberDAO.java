package com.example.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dto.MemberDTO;



public class MemberDAO {

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
