package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.lang.NonNull;

@Entity
public class Board {

	@Id
	Long no;
	
	@Column(name = "userid")
	String userid;
	
	@Column(nullable = false)
	String username;
	
	@Column(nullable = false)
	String title;
	
	@Column
	String content;
	
	@Column
	@CreationTimestamp
	LocalDateTime writeday;
	
	@Column
	Integer readcnt = 0;

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Board(Long no, String userid, String username, String title, String content, LocalDateTime writeday,
			Integer readcnt) {
		super();
		this.no = no;
		this.userid = userid;
		this.username = username;
		this.title = title;
		this.content = content;
		this.writeday = writeday;
		this.readcnt = readcnt;
	}

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getWriteday() {
		return writeday;
	}

	public void setWriteday(LocalDateTime writeday) {
		this.writeday = writeday;
	}

	public Integer getReadcnt() {
		return readcnt;
	}

	public void setReadcnt(Integer readcnt) {
		this.readcnt = readcnt;
	}

	@Override
	public String toString() {
		return "board [no=" + no + ", userid=" + userid + ", username=" + username + ", title=" + title + ", content="
				+ content + ", writeday=" + writeday + ", readcnt=" + readcnt + "]";
	}

	
	
	
	
}
