package com.prak.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.prak.model.Product;

public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertProduct(Product product) {
		String sql = "INSERT INTO products (name, price) values (?,?)";
		int rowsInserted = jdbcTemplate.update(sql, product.getName(), product.getPrice());
		return rowsInserted;
	}

}
