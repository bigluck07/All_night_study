package com.dao;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository
public class DeptDAO {

	public List<String> list() {
		return Arrays.asList("A","B");
		
	}
}
