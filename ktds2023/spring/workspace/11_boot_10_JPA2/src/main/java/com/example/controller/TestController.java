package com.example.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entity.User;

@Controller
public class TestController {

	@Autowired
	EntityManagerFactory factory;
	
	@GetMapping("/insert")
	public String insert() {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		
		tx.begin();
		//////// 작업영역
		
		// 비영속성 객체
		User user = new User(10L, "홍길동", 20);
		User user2 = new User(11L, "이순신", 30);
		// 영속성 객체 만들기 위한 저장
		em.persist(user); // JPA가 자동으로 insert문을 생성
		em.persist(user2); // JPA가 자동으로 insert문을 생성
		
		
		////////
		tx.commit(); // tx.rollback
		
		
		return "main"; //  /WEB-INF/views/main.jsp
	}
	
	
	@GetMapping("/find/{id}")
	public String find(@PathVariable Long id) {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		
		tx.begin();
		//////// 작업영역
		User user = em.find(User.class, id);
		System.out.println(user);
		
		
		////////
		tx.commit(); // tx.rollback
		return "main";
	}
		
	@GetMapping("/delete/{id}") // find로 있는지 부터 확인 후 삭제
	public String delete(@PathVariable Long id) {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		
		tx.begin();
		//////// 작업영역
		
		User user = em.find(User.class, id); // 삭제할 entity 확인
		em.remove(user);
		
		////////
		tx.commit(); // tx.rollback
		return "main"; //  /WEB-INF/views/main.jsp
	}
	
	@GetMapping("/update/{id}/{name}/{age}") // find로 있는지 부터 확인 후 삭제
	public String update(@PathVariable Long id,
						 @PathVariable String name,
						 @PathVariable Integer age) {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		//////// 작업영역
		
		User user = em.find(User.class, id); // 삭제할 entity 확인
		user.setName(name);
		user.setAge(age);
		
		////////
		tx.commit(); // tx.rollback
		return "main"; //  /WEB-INF/views/main.jsp
	}
}
