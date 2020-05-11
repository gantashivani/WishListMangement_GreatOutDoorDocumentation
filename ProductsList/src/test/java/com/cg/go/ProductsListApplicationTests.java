package com.cg.go;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.go.service.ProductsListService;


@SpringBootTest
public class ProductsListApplicationTests {

	
	@Autowired
	private ProductsListService service;
	
	@Test
	public void  testProductsList() throws Exception {
		
		List<Object[]> data=service.viewProduct();
		Assertions.assertSame(null,data);
	
	}
	
	@Test
	public void  testProductsListValid() throws Exception {
		
		List<Object[]> data=service.viewProduct();
		Assertions.assertNotNull(data);
	
	}
}
