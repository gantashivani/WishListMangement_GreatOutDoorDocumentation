package com.cg.go;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.go.dto.ProductsDTO;
import com.cg.go.service.ViewWishListService;


@SpringBootTest
public class ViewWishlistApplicationTests {

	
	@Autowired
	private ViewWishListService service;
	
	
	/*false case */
	@Test
	public void  testViewWishList() {
		
		List<ProductsDTO> data=service.viewWishList(5);
		
		List<ProductsDTO> result=new ArrayList<ProductsDTO>();
		
		result.add(new ProductsDTO(68,"Food","Banana"));
		result.add(new ProductsDTO(69,"Food","Banana"));
		
		Assertions.assertSame(data,result);
	}
	
	
	/*true case */
	@Test
	public void  testViewWishListInvalid() throws Exception{
		
		List<ProductsDTO> data=service.viewWishList(5);
		Assertions.assertNotEquals(data,null);
	}	
}
