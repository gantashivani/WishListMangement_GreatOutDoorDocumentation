package com.cg.go.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.exceptions.UserIdNotFound;
import com.cg.go.service.LoginService;

@RestController
@RequestMapping("/Login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginPageController {
	
	@Autowired
	private LoginService loginservice;
	
	
	@GetMapping("/ValidateUser/{user}")
	public String validateUser(@PathVariable Integer user) throws UserIdNotFound
	{
		if(loginservice.validateUser(user) == null)
			 throw new UserIdNotFound("no user found");
		else
			return "Login Sucessfull";		
	}
}
