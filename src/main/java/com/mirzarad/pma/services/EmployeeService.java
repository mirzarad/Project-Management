package com.mirzarad.pma.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirzarad.pma.dao.EmployeeRepository;

@Service
public class EmployeeService {

//  Field Injection
//	@Autowired
	EmployeeRepository empRepo;
	
	// Construction Injection
	public EmployeeService(EmployeeRepository empRepo) {
		super();
		this.empRepo = empRepo;
	}
	
	// Setter Injection
//	@Autowired
//	public void setEmpRepo(EmployeeRepository empRepo) {
//		this.empRepo = empRepo;
//	}
	
}
