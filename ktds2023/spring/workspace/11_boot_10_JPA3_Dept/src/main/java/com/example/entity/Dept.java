package com.example.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dept {
	
	@Id
	Long deptno;
	String dname;
	String loc;
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(Long deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	public Long getDeptno() {
		return deptno;
	}
	public void setDeptno(Long deptno) {
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
	
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
}
