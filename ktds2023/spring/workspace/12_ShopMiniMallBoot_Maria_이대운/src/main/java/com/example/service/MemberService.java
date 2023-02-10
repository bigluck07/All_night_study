package com.example.service;

import java.util.Map;

import com.example.dto.MemberDTO;


public interface MemberService {


	public MemberDTO login(Map<String, String> map);
	public int idCheck(String userid);
	public int memberAdd(MemberDTO dto);
	public MemberDTO mypage(String userid);
	public int memberUpdate(MemberDTO dto);
	
}// end class



