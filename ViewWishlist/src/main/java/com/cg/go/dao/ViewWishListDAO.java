package com.cg.go.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.go.dto.UserDTO;

@Repository
public interface ViewWishListDAO extends JpaRepository<UserDTO, Integer> {

	@Query("Select d from UserDTO d where d.userId=?1")
	public UserDTO fetch(int userid);


}