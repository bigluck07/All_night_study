package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dto.DeptDTO;
import com.example.service.DeptService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	 ApplicationContext ctx=
			 SpringApplication.run(Application.class, args);
	 
	 DeptService service = ctx.getBean("xxx", DeptService.class);
	 
	 
	 
	 List<DeptDTO> list=null;
	try {
		
		//트랜잭션 처리 시작
		DeptDTO dto = new DeptDTO(70, "aaa", "aaa");
		service.insertAndDelete(dto, 99);
		
		//트랜잭션 처리 끝
		
		
		list = service.list();
	} catch (Exception e) {
		e.printStackTrace();
	}
	 System.out.println(list);
	}

}
