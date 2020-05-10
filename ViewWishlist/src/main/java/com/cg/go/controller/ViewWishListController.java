package com.cg.go.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.dto.ProductsDTO;
import com.cg.go.service.ViewWishListService;

@RestController
@RequestMapping("/WishList")
@CrossOrigin(origins = "http://localhost:4200")
public class ViewWishListController {

	@Autowired
	private ViewWishListService service;
	

	@GetMapping("/ViewWishList/{userId}")
	public List<ProductsDTO>  viewWishList(@PathVariable Integer userId)
	{
		return service.viewWishList(userId);
	}
	
}

