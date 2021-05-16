package com.poc.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repo;
	
	@GetMapping(value = "/hello")
	public String SayHi() {
		return "helloooo";
	}
	
	@GetMapping(value = "/emps")
	public List<EmployeeEntity> SayHello() {
				
		return repo.findAll();
	}
	
	@PostMapping(value = "/emp")
	public String saveEmployee(@RequestBody EmployeeEntity emp) {
		EmployeeEntity e1=repo.save(emp);
		/*
		 * EmployeeEntity emp= new EmployeeEntity(); emp.setName(name); emp.setAge(age);
		 * repo.save(emp);
		 */
		
		return "Hello "+e1.getName();
		
	}
}
