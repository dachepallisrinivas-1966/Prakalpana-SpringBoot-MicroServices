package com.prak.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.prak.model.Product;
import com.prak.service.ProductRowMapper;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertProduct(Product product) {
		String sql = "INSERT INTO products (name, price) values (?,?)";
		int rowsInserted = jdbcTemplate.update(sql, product.getName(), product.getPrice());
		return rowsInserted;
	}

	@Override
	public List<Product> getAllProducts() {
		String sql = "SELECT * FROM products";
		List<Product> products = jdbcTemplate.query(sql,  new ProductRowMapper());
		return products;
	}

}
