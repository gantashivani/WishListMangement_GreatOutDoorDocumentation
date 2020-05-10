package com.cg.go.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.go.dao.ProductDAO;
import com.cg.go.dto.ProductsDTO;


@Service
public class ProductsListServiceImpl implements ProductsListService {
	
	
	@Autowired 
	private ProductDAO productdao;

	@Override
	public List<ProductsDTO> viewProduct() {
		return productdao.fetch(); 
	}
}
