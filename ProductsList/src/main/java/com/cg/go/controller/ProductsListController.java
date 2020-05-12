package com.cg.go.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.dto.ProductsDTO;
import com.cg.go.service.ProductsListService;

@RestController
@RequestMapping("/WishList")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductsListController {

	@Autowired
	private ProductsListService service;
	
	
	@GetMapping("/ViewProducts")
	public List<Object[]>  viewProduct()
	{
		return service.viewProduct();
	}
	
	@GetMapping("/SearchProducts/{productCatogery}")
	public List<ProductsDTO>  searchProduct(@PathVariable String productCatogery)
	{
		return service.searchProduct(productCatogery);
	}
	
	@GetMapping("/FilterProducts/{minPrize}/{maxPrize}")
	public List<Object[]>  filterProduct(@PathVariable double minPrize,@PathVariable double maxPrize)
	{
		return service.filterProduct(minPrize,maxPrize);
	}
	
}

