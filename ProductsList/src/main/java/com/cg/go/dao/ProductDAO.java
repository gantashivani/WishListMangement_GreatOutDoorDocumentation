package com.cg.go.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.go.dto.ProductsDTO;

public interface ProductDAO extends JpaRepository<ProductsDTO, Integer>{
	
	@Query("Select distinct p.productName,p.productCatogery,p.prize,p.dimensions,p.specifications,p.manufacture,p.colour,p.quantity,p.retailerId from ProductsDTO p")
	List<Object[]> fetch();

	@Query("Select p from ProductsDTO p where p.productCatogery=?1")
	List<ProductsDTO> searchProduct(String productCatogery);

	
	@Query("Select p from ProductsDTO p where p.prize >=?1 and p.prize<=?2")
	List<Object[]> filterProduct(double minPrize, double maxPrize);

}
