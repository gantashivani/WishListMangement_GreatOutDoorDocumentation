package com.cg.go.service;

import java.util.Optional;

import com.cg.go.entity.UserDTO;

public interface LoginService {

	Optional<UserDTO> validateUser(Integer user);
	
}
