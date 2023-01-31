package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dto.DeptDTO;


public interface DeptService {
	
	public List<DeptDTO> list();

}
