package com.example.SpringbootAppEx;

import java.util.Arrays;

import org.junit.runners.model.RunnerScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringbootAppEx.entities.Employee;
import com.example.SpringbootAppEx.repository.EmpRepository;

@SpringBootApplication
public class SpringbootAppExApplication {
	
	@Autowired
	EmpRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppExApplication.class, args);
	}


}
