package com.cg.go.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.go.dto.ProductsDTO;

public interface ProductDAO extends JpaRepository<ProductsDTO, Integer>{
	
	@Query("Select distinct p.productName,p.productCatogery from ProductsDTO p")
	List<Object[]> fetch();

}
