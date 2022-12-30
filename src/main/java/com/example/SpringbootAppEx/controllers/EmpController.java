package com.example.SpringbootAppEx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringbootAppEx.entities.Employee;
import com.example.SpringbootAppEx.services.EmpService;

@RestController
@RequestMapping("emp/")
public class EmpController {
	@Autowired
	EmpService service;
	
	@GetMapping("get/all")
	public List<Employee> getAllEmp(){
		return service.getAllEmp();
	}
	@PostMapping("/add")
	public String addEmp(@RequestBody Employee e) {
		return service.addEmp(e);
	}
	@PutMapping("/edit")
	public String editEmp(@RequestBody Employee e) {
		return service.edit(e);
	}
	@DeleteMapping("/delete")
	public String deleteEmp(@RequestParam int empNo) {
		return service.deleteEmp(empNo);
	}
}
