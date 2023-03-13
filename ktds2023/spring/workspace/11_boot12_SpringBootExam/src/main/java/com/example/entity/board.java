package com.example.entity;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.sql.Date;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.lang.NonNull;


public class board {

	@Id
	Long no;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid")
	private String userid;
	
	@Column
	@NonNull
	private String username;
	
	@Column
	@NonNull
	private String title;
	
	@Column
	private String content;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date writeday;
	
	@Column
	@ColumnDefault("0")
	private Integer readcnt;
	
	
	
}
