package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.service.DeptService;

// Spring Framework 의 configuration.xml 역할

@Configuration
public class JavaConfig {

	@Bean("xxx")
	public DeptService a() {
		return new DeptService();
	}
}
