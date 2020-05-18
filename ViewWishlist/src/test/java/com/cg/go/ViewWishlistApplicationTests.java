package com.cg.go;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import com.cg.go.dto.ProductsDTO;
import com.cg.go.dto.UserDTO;
import com.cg.go.service.ViewWishListService;


@SpringBootTest
public class ViewWishlistApplicationTests {

	@Autowired
	TestRestTemplate testRestTemplate;
	public void setTestRestTemplate(TestRestTemplate testRestTemplate)
	{
		this.testRestTemplate=testRestTemplate;
	}
	
	@LocalServerPort
	int localServerPort;

	@Autowired
	private ViewWishListService service;
	
	@Test
	public void  testViewWishList() {
		
		List<ProductsDTO> data=service.viewWishList(5);
		List<ProductsDTO> result=new ArrayList<ProductsDTO>();
		
		result.add(new ProductsDTO(68,200.00,"brown","3mts","Reliance","MountaineerEquipment",10,"SurvivalRope","EmergencyRope",104));
		
		Assertions.assertSame(result,data);
	}
	
	@Test
	public void  testViewWishListInvalid() throws Exception{
		
		List<ProductsDTO> data=service.viewWishList(5);
		Assertions.assertNotEquals(null,data);
	}	
	
	@Test 
	public void testUrlViewPositive() throws Exception{

		String url="http://localhost:"+localServerPort+"WishList/ViewWishList/1";
		ResponseEntity<UserDTO> result = testRestTemplate.getForEntity(url,UserDTO.class);
		Assertions.assertEquals(200,result.getStatusCodeValue());
	}
	
	@Test 
	public void testUrlViewNegative() throws Exception{

		String url="http://localhost:"+localServerPort+"WishList/ViewWishList/100";
		ResponseEntity<UserDTO> result = testRestTemplate.getForEntity(url,UserDTO.class);
		Assertions.assertEquals(400,result.getStatusCodeValue());
	}
	
}
