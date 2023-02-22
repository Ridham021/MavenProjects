package com.ridham.product.bo;

import com.ridham.product.dao.ProductDAO;
import com.ridham.product.dao.ProductDAOImpl;
import com.ridham.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.create(product);

	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		Product product = dao.read(id);
//		System.out.println(product.toString());
		return product;
	}

}
