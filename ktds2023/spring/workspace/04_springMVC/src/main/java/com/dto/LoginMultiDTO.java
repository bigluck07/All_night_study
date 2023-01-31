package com.dto;

import java.util.List;

public class LoginMultiDTO {
	
	String userid;
	String passwd;
	
	List<String> hobby;
	
	public LoginMultiDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginMultiDTO(String userid, String passwd) {
		super();
		this.userid = userid;
		this.passwd = passwd;
	}

	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	
	@Override
	public String toString() {
		return "LoginMultiDTO [userid=" + userid + ", passwd=" + passwd + ", hobby=" + hobby + "]";
	}

	
	
	
	
	

}
