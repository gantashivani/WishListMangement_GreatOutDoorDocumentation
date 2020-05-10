package com.cg.go.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.go.dao.ViewWishListDAO;
import com.cg.go.dto.ProductsDTO;
import com.cg.go.dto.UserDTO;


@Service
public class ViewWishListServiceImpl implements ViewWishListService {
	
	@Autowired 
	private ViewWishListDAO dao;
	
	@Override
	public List<ProductsDTO> viewWishList(Integer userId) {
		
		UserDTO data=dao.fetch(userId);	
		List<ProductsDTO> products=data.getProduct();
		return products;
	}

}
