package com.cg.go.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.entity.UserDTO;
import com.cg.go.service.AddToWishListService;

@RestController
@RequestMapping("/AddToWishList")
@CrossOrigin(origins = "http://localhost:4200")
public class AddToWishListController {

	@Autowired
	private AddToWishListService service;
	
	/* Add the product details by reference of user id*/
	@PostMapping("/Add")
	public Object addProductToWishList(@RequestBody UserDTO user)
	{
	
		 return service.addProductToWishList(user);
		
	}
}	
