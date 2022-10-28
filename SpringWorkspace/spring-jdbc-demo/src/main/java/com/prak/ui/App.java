package com.prak.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.prak.config.AppConfig;
import com.prak.dao.ProductDAOImpl;
import com.prak.model.Product;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductDAOImpl productDAO = context.getBean(ProductDAOImpl.class);
		Product product = new Product();
		product.setName("mouse");
		product.setPrice(350);
		int rowsInserted = productDAO.insertProduct(product);
		if (rowsInserted == 1)
			System.out.println("product inserted");
		else
			System.out.println("could not insert");
		context.close();
	}

}
