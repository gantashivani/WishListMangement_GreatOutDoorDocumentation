package com.cg.go.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="productslist")
public class ProductDTO {
	
	@Id
	@GeneratedValue
	@Column(length=5)
	private int productId;

	@NotNull
	@Column(length=10)
	private double prize;
	
	@Column(length=10)
	private String colour;
	
	@Column(length=20)
	private String dimensions;
	
	@Column(length=20)
	private String specifications;
	
	@NotNull
	@Column(length=10)
	private String manufacture;
	
	@Column(length=10)
	private int quantity;
	
	@NotNull
	@Column(length=20)
	private String  productCatogery;
	
	@NotNull
	@Column(length=20)
	private String productName;
	
	@NotNull
	@Column(length=5)
	private int retailerId;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductCatogery() {
		return productCatogery;
	}

	public void setProductCatogery(String productCatogery) {
		this.productCatogery = productCatogery;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

	public ProductDTO(int productId, @NotNull double prize, String colour, String dimensions, String specifications,
			@NotNull String manufacture, int quantity, @NotNull String productCatogery, @NotNull String productName,
			@NotNull int retailerId) {
		super();
		this.productId = productId;
		this.prize = prize;
		this.colour = colour;
		this.dimensions = dimensions;
		this.specifications = specifications;
		this.manufacture = manufacture;
		this.quantity = quantity;
		this.productCatogery = productCatogery;
		this.productName = productName;
		this.retailerId = retailerId;
	}
	
	public ProductDTO() {
		super();
		
	}
	
}
