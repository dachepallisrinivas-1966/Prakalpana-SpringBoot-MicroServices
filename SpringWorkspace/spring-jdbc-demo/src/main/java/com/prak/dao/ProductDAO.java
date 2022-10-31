package com.prak.dao;

import java.util.List;

import com.prak.model.Product;

public interface ProductDAO {
	int insertProduct(Product product);
	List<Product> getAllProducts();
}
