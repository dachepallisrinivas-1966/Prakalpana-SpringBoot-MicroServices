package com.prak.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.prak.model.Product;

public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		int id = rs.getInt("prodid");
		String name = rs.getString("name");
		int price = rs.getInt("price");
		
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setPrice(price);
		
		if (rs.isLast())
			System.out.println("No. of products : " + (++rowNum));
		
		return product;

	}

}
