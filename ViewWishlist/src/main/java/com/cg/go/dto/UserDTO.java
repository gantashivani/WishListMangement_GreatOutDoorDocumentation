package com.cg.go.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="userdto")
public class UserDTO {
	
	@Id
	@GeneratedValue
	private int userId;
	private String password;
	private String userName;

	@OneToMany(cascade=CascadeType.ALL)
	private List<ProductsDTO> product=new ArrayList<ProductsDTO>();
	
	public List<ProductsDTO> getProduct() {
		return product;
	}
	
	public UserDTO(int userId, String password, String userName, List<ProductsDTO> product) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.product = product;
	}
	
	public UserDTO() {
		
	}
	
	public void setProduct(List<ProductsDTO> product) {
		this.product = product;
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
