package com.cg.go.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
}

