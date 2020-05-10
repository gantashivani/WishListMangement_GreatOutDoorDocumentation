package com.cg.go.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.go.dao.LoginDAO;
import com.cg.go.entity.UserDTO;

@Service
public class LoginServiceImpl  implements LoginService{
	
	@Autowired
	private LoginDAO dao;

	@Override
	public Optional<UserDTO> validateUser(Integer user) {
		return 	dao.findById(user);
	}
}
