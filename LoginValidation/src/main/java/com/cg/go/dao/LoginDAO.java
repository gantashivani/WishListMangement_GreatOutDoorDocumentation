package com.cg.go.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.go.entity.UserDTO;

@Repository
public interface LoginDAO extends JpaRepository<UserDTO,Integer> {

	
	@Query("Select u from UserDTO u where userId=?1 and password=?2")
	UserDTO validateUser(Integer userId, String password);

}
