package com.cg.go.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.entity.UserDTO;
import com.cg.go.exceptions.UserIdNotFound;
import com.cg.go.service.LoginService;

@RestController
@RequestMapping("/Login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginPageController {
	
	@Autowired
	private LoginService loginservice;
	
	/* to validate the user id ad return an exception if the user id doesn't exist*/
	@GetMapping("/ValidateUser/{userId}/{password}")
	public ResponseEntity<String> validateUser(@PathVariable Integer userId,@PathVariable String password) throws UserIdNotFound
	{
		 UserDTO result=loginservice.validateUser(userId,password);
		 if(result == null) { 
				throw new UserIdNotFound("no user found");
				}
			else {
				return new ResponseEntity<String>("Login Sucessfull",new HttpHeaders(),HttpStatus.OK);
			}
	}
}