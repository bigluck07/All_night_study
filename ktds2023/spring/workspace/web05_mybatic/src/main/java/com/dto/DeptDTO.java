package com.dto;

import org.apache.ibatis.type.Alias;

// dept 테이블의 하나의 행 저장용
public class DeptDTO {
	
	int deptno;
	String dname;
	String loc;
	
	
	public DeptDTO() {
		// TODO Auto-generated constructor stub
	}
	


	public DeptDTO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}



	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	

}