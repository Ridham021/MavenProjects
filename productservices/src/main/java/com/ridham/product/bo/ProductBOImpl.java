package com.ridham.product.bo;

import com.ridham.product.dao.ProductDAO;
import com.ridham.product.dao.ProductDAOImpl;
import com.ridham.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

}
