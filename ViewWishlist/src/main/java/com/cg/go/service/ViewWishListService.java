package com.cg.go.service;

import java.util.List;

import com.cg.go.dto.ProductsDTO;

public interface ViewWishListService {

	List<ProductsDTO> viewWishList(Integer userId);

}
