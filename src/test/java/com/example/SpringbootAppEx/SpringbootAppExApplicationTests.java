package com.example.SpringbootAppEx;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.SpringbootAppEx.entities.Employee;
import com.example.SpringbootAppEx.repository.EmpRepository;
import com.example.SpringbootAppEx.services.EmpService;


@SpringBootTest
class SpringbootAppExApplicationTests {
	@MockBean
	EmpRepository repo;
	@Autowired
	EmpService service;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void getAllEmpTest() {
		when(repo.getAllEmp()).thenReturn(Stream
		.of(new Employee(1,"IU","South Korea"),new Employee(2,"Drake","US")).collect(Collectors.toList()));
		assertEquals(2,service.getAllEmp());
	}
	
	@Test
	public void addEmpTest() {
		Employee e=new Employee(1,"IU","Korea");
		when(repo.addEmp(e)).thenReturn("successfully saved");
		assertEquals("successfully saved", service.addEmp(e));
	}
	@Test
	public void deleteEmpTest() {
		Employee e=new Employee(1,"IU","Korea");
		when(repo.deleteEmp(e.getEmpId())).thenReturn("deleted");
		assertEquals("deleted",service.deleteEmp(e.getEmpId()-1));
	}
	

}
