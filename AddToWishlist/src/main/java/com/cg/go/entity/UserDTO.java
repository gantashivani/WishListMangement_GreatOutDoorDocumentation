package com.cg.go.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/*create table userdto(user_Id number(5) not null primary key,
 *  password varchar2(10), userName varchar2(10))*/
@Entity
@Table(name="userdto")
public class UserDTO {
	
	@Id
	@Column(length=5,unique = true,nullable=false) // @NotNull
	private int userId;
	
	@Column(length=10)
	private String password;
	
	@Column(length=10)
	private String userName;

	
	/* due to OneToMany relationship single user can add multiple products
	 * creates a seperate table with primary keys of userdto and productslist as
	 * userdto_product with  userdo_user_Id, product_product_id */
	@NotNull
	@OneToMany(cascade=CascadeType.ALL)
	private List<ProductDTO> product=new ArrayList<ProductDTO>();
	
	public List<ProductDTO> getProduct() {
		return product;
	}
	
	public UserDTO(int userId, String password, String userName, List<ProductDTO> product) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.product = product;
	}
	
	public UserDTO() {
		
	}
	
	public void setProduct(List<ProductDTO> product) {
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
