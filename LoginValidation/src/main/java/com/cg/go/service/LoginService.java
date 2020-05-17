package com.cg.go.service;

import com.cg.go.entity.UserDTO;

public interface LoginService {

	UserDTO validateUser(Integer userId,String password);
	
}
