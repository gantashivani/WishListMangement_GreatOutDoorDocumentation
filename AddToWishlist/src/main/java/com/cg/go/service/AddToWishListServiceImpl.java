package com.cg.go.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.go.dao.AddToWishListDAO;
import com.cg.go.entity.ProductDTO;
import com.cg.go.entity.UserDTO;

@Service
public class AddToWishListServiceImpl implements AddToWishListService{

	@Autowired
	private AddToWishListDAO dao;

	@Override
	public Object addProductToWishList(UserDTO user) {
		                      
		int userid=user.getUserId();
		UserDTO  dataprevious=dao.fetch(userid);
	
		/* checks whether user already has products or not*/ 
		if(dataprevious!=null) 
			{
			/* to fetch the previous products data*/
			List<ProductDTO> products = dataprevious.getProduct(); 
			
			/*if already product is present it will be updated to the previous list and set it to the previous data */
			if(products != null)
			{  
				products.addAll(user.getProduct());
				user.setProduct(products);
				return dao.save(user);
			}
			else 
				return  dao.save(user);
			}
		else
			return dao.save(user);
		}
	
}
