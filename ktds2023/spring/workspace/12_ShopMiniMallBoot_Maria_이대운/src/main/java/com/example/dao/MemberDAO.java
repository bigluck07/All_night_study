package com.example.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dto.MemberDTO;


@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate template;
	
	public MemberDTO login(Map<String, String> map) {
		return template.selectOne("MemberMapper.login", map);
	}

	public int idCheck(String userid) {
		return template.selectOne("MemberMapper.idCheck", userid);
	}

	public int memberAdd(MemberDTO dto) {
		return template.insert("MemberMapper.memberAdd", dto);
	}

	public MemberDTO mypage(String userid) {
		return template.selectOne("MemberMapper.mypage", userid);
	}

	public int memberUpdate(MemberDTO dto) {
		return template.insert("MemberMapper.updateMember", dto);
	}
}
