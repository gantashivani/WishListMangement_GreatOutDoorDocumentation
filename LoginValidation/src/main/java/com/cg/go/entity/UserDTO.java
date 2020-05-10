package com.cg.go.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="userdto")
public class UserDTO {
	
	@Id
	@GeneratedValue
	private int userId;
	private String password;
	private String userName;
	
	public UserDTO(int userId, String password, String userName) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
	}
	
	public UserDTO() {
		
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
