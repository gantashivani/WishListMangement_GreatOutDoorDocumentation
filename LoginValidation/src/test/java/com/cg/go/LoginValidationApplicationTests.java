package com.cg.go;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.go.entity.UserDTO;
import com.cg.go.service.LoginService;

@SpringBootTest
class LoginValidationApplicationTests {

	@Autowired
	private LoginService service;
	
	@Test
	public void validateLogin() {
			
		Optional<UserDTO> data=service.validateUser(1);
		Assertions.assertNotEquals(0,data);
	}
	
	@Test
	public void validateLoginInValidCase() {
			
		Optional<UserDTO> data=service.validateUser(1);
		
		Assertions.assertEquals(1,data);
	}

}
