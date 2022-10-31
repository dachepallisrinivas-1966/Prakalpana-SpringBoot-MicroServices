package com.prak.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.prak")
public class AppConfig {

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
	
	@Bean
	public DataSource getDataSource() {
		String url = "jdbc:mysql://localhost:3306/prakdb";
		String userName = "root";
		String password = "root";
		return new DriverManagerDataSource(url, userName, password);
	}

}
