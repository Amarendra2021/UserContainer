package com.poc.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.dao.UserDemographic;
import com.poc.service.UserService;

@RestController
public class UserController1 {

	@Autowired 
	UserService userservice;
	
	@GetMapping(value = "/hello1")
	public String SayHi() {
		return "helloooo123";
	}
	
	
	  @GetMapping(value = "/createUser") 
	  public String saveUser() {
		  userservice.createUser(); 
		  return "User creation successful"; 
		  
	  }
	  
	  @GetMapping(value = "/users") 
	  public List<UserDemographic> fetchUser() {
		  return userservice.getAllUsers(); 
		   
		  
	  }
		 

}
