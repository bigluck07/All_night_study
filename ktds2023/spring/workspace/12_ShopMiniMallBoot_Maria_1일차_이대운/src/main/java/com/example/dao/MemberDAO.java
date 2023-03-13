package com.example.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dto.MemberDTO;


@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate session;
	
	public MemberDTO login(Map<String, String> map) {
		session.selectList("MemberMapper.login");
		return null;
	}

	public int idCheck(String userid) {
		return session.selectOne("MemberMapper.idCheck", userid);
	}

	public int memberAdd(MemberDTO dto) {
		return session.insert("MemberMapper.memberAdd", dto);
	}

	public MemberDTO mypage(String userid) {
		session.selectList("MemberMapper.mypage");
		return null;
	}

	public int memberUpdate(MemberDTO dto) {
		return session.insert("MemberMapper.updateMember", dto);
	}
}
