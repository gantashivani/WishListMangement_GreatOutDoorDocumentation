package com.cg.go.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/*create table userdto(user_Id number(5) not null primary key,
 *  password varchar2(10), userName varchar2(10))*/
@Entity
@Table(name="userdto")
public class UserDTO {
	

	@Id
	@Column(length=5,unique = true,nullable=false)
	private int userId;
	
	@Column(length=10)
	private String password;
	
	@Column(length=10)
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

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", password=" + password + ", userName=" + userName + "]";
	}
	
	
}
