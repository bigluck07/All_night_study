package com.example.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class Member {
	
	@Id
	@Column(name = "userid")
	String userid;
	@Column(nullable = false)
	String passwd;
	@Column(nullable = false)
	String username;
	String email;
	String phone;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String userid, String passwd, String username, String email, String phone) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.username = username;
		this.email = email;
		this.phone = phone;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	@Override
	public String toString() {
		return "member [userid=" + userid + ", passwd=" + passwd + ", username=" + username + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	
	
	
}
