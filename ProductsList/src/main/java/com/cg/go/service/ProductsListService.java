package com.cg.go.service;

import java.util.List;

import com.cg.go.dto.ProductsDTO;

public interface ProductsListService {

	
	List<Object[]> viewProduct();

	List<ProductsDTO> searchProduct(String productCatogery);

	List<Object[]> filterProduct(double minPrize, double maxPrize);


}
