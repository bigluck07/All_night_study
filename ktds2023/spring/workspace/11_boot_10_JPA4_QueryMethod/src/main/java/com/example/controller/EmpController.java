package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Emp;
import com.example.repository.EmpRepository;


@RestController
public class EmpController {
	@Autowired
	EmpRepository repository;
	
	@GetMapping("/findByename")
	public List<Emp> findByename() {
		return repository.findByename("SMITH");
		
	}
	
	@GetMapping("/findBydeptno")
	public List<Emp> findBydeptno() {
		return repository.findBydeptno(30L);
		
	}
	
	@GetMapping("/findBydeptnoAndMgr")
	public List<Emp> findBydeptnoAndMgr() {
		return repository.findBydeptnoAndMgr(30L, 7698L);
		
	}
	
	@GetMapping("/findBydeptnoIn")
	public List<Emp> findBydeptnoIn() {
		List<Long> deptlist = Arrays.asList(30L, 20L, 10L);
		return repository.findBydeptnoIn(deptlist);
	}
	
	@GetMapping("/findBysalBetween")
	public List<Emp> findBysalBetween() {
		return repository.findBysalBetween(1000, 2000);
	}
	
	@GetMapping("/findBysalLessThan")
	public List<Emp> findBysalLessThan() {
		return repository.findBysalLessThan(2000);
	}
	
	@GetMapping("/findByenameContaining")
	public List<Emp> findByenameContaining() {
		return repository.findByenameContaining("LA");
	}
	
	@GetMapping("/findByenameContains")
	public List<Emp> findByenameContains() {
		return repository.findByenameContains("LE");
	}
	
	@GetMapping("/findByenameStartingWith")
	public List<Emp> findByenameStartingWith() {
		return repository.findByenameStartingWith("A");
	}
	
	@GetMapping("/findByenameEndingWith")
	public List<Emp> findByenameEndingWith() {
		return repository.findByenameEndingWith("S");
	}
	
	@GetMapping("/findByCommNull")
	public List<Emp> findByCommNull() {
		return repository.findByCommNull();
	}
	@GetMapping("/findByCommNotNull")
	public List<Emp> findByCommNotNull() {
		return repository.findByCommNotNull();
	}
}
