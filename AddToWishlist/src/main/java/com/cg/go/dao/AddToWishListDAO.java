package com.cg.go.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.go.entity.UserDTO;

@Repository
public interface AddToWishListDAO extends JpaRepository<UserDTO,Integer>{

	
	@Query("select d from UserDTO d where d.userId=?1")
	public UserDTO fetch(int userid);

	
}
