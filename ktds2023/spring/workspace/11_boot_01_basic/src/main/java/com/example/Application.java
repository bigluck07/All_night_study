package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.service.DeptService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	 ApplicationContext ctx=
			 SpringApplication.run(Application.class, args);
	 
	 DeptService service = ctx.getBean("xxx", DeptService.class);
	 List<String>  list = service.list();
	 System.out.println(list);
	}

}
