package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.dao.DeptDAO;
import com.example.service.DeptService;

// Spring Framework 의 configuration.xml 역할

@Configuration
public class JavaConfig {

	@Bean
	public DeptDAO dao() {
		return new DeptDAO();
	}
	@Bean("xxx")
	public DeptService b2(DeptDAO dao) {
		DeptService service = new DeptService();
		service.setDao(dao);
		return service;
	}
	
	@Bean("xxx3")
	public DeptService b() {
		DeptService service = new DeptService();
		service.setDao(dao());
		return service;
	}
	
	@Bean("xxx2")
	public DeptService a() {
		return new DeptService(dao());
	}
	
	@Bean("xxx1")
	public DeptService a2(DeptDAO dao) {
		return new DeptService(dao);
	}

}
