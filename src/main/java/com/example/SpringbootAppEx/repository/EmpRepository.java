package com.example.SpringbootAppEx.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.SpringbootAppEx.entities.Employee;

@Repository
public class EmpRepository {
	
	public List<Employee> employees=new ArrayList<Employee>();
	
	public List<Employee>getAllEmp(){
		return employees;
	}

	public String addEmp(Employee e) {
		employees.add(e);
		return "successfully added";
	}

	public String editEmp(Employee e) {
		employees.stream().filter(emp->emp.getEmpId()==e.getEmpId()).forEach(emp->{
			emp.setName(e.getName());
			emp.setAddress(e.getAddress());
		});
		return "successfully updated";
	}

	public String deleteEmp(int empNo) {
		employees.remove(empNo-1);
		return "deleted";
	}

}
