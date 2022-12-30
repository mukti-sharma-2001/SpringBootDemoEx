package com.example.SpringbootAppEx.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringbootAppEx.entities.Employee;
import com.example.SpringbootAppEx.repository.EmpRepository;

@Service
public class EmpService {
	@Autowired
	EmpRepository repo;
	public List<Employee>getAllEmp(){
		return repo.getAllEmp();
	}
	public String addEmp(Employee e) {
		return repo.addEmp(e);
		
	}
	public String edit(Employee e) {
		return repo.editEmp(e);
	}
	public String deleteEmp(int empNo) {
		return repo.deleteEmp(empNo);
	}
}
