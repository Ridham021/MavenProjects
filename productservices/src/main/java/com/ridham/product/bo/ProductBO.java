package com.ridham.product.bo;


import com.ridham.product.dao.*;
import com.ridham.product.dto.*;



public interface ProductBO {
	
	

		void create(Product product);
		
		Product findProduct(int id);
	
	

}
