package com.dao;

import java.util.Arrays;
import java.util.List;


public class DeptDAO {
	
	String mesg;
	

	public void setMesg(String mesg) {
		this.mesg = mesg;
	}



	public List<String> list() {
		System.out.println("mesg: "+mesg);
		return Arrays.asList("A","B");
		
	}
}
