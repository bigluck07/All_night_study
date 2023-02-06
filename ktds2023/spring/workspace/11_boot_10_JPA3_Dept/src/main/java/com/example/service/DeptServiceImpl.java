package com.example.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Dept;
import com.example.entity.DeptDTO;
import com.example.repository.DeptRepository;

@Service
//@Transactional
public class DeptServiceImpl implements DeptService {

	@Autowired
	DeptRepository repository;
	
	@Override
	public List<DeptDTO> list() throws Exception {
		
		List<Dept> list = repository.findAll();
		
		// Dept -> DeptDTO 변환이 필요
		List<DeptDTO> listDTO = new ArrayList<>();
		for (Dept dept : list) {
			DeptDTO dto = new DeptDTO();
			dto.setDeptno(dept.getDeptno());
			dto.setDname(dept.getDname());
			dto.setLoc(dept.getLoc());
			listDTO.add(dto);
		}
		return listDTO;
	}

	@Override
	public DeptDTO idCheck(Long deptno) throws Exception {
		Dept dept = repository.findById(deptno).orElse(null);
		DeptDTO deptDTO = null;
		if(dept != null) {
			deptDTO = new DeptDTO();
			deptDTO.setDeptno(dept.getDeptno());
			deptDTO.setDname(dept.getDname());
			deptDTO.setLoc(dept.getLoc());
		}
		return deptDTO;
	}

	
	@Override
	@Transactional // 안서도 되지만 DML은 적어주자
	public void write(DeptDTO dto) throws Exception {
		//DeptDTO -> Dept 변환
		Dept dept = new Dept();
		dept.setDeptno(dto.getDeptno());
		dept.setDname(dto.getDname());
		dept.setLoc(dto.getLoc());
		repository.save(dept);
	}

	@Override
	@Transactional
	public void update(DeptDTO dto) throws Exception {
		// Entity를 먼저 겁색 및 변경 후 자동으로 update문 실행
		Dept dept = repository.findById(dto.getDeptno()).orElse(null);
		if(dept != null) {
			dept.setDname(dto.getDname());
			dept.setLoc(dto.getLoc());
		}
		
	}

	@Override
	@Transactional
	public void delete(Long deptno) throws Exception {
		Dept dept = repository.findById(deptno).orElse(null);
		repository.delete(dept);
		
	}
	
	
	
	


}
