package com.cg.go;

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
	
	/*validate userId if exists returns 1 else a 0*/
	@Test
	public void validateLogin() {
			
		UserDTO data=service.validateUser(1,"Shivani123");
		Assertions.assertNotEquals(0,data);
	}
	
	@Test
	public void validateLoginInValidCase() {
			
		UserDTO data=service.validateUser(1,"Shivani");
		
		Assertions.assertEquals(1,data);
	}

}
