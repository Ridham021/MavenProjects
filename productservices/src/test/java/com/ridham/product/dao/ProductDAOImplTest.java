package com.ridham.product.dao;

import static org.junit.Assert.*;

import java.net.Socket;

import org.junit.Test;

import com.ridham.product.dao.ProductDAO;
import com.ridham.product.dao.ProductDAOImpl;
import com.ridham.product.dto.Product;

public class ProductDAOImplTest {

	@SuppressWarnings("unused")
	@Test
	public void createShouldCreateAProduct() {
		
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("It's awesome product");
		product.setPrice(100);
		dao.create(product);
		
		
		
				
		Product result = dao.read(1);
		System.out.println(result.getName());
		System.out.println(result.toString());
		assertNotNull(result);
		
			assertEquals("Iphone", result.getName());
		
		
		
	}

}
