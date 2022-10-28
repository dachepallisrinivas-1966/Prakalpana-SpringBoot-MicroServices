package com.prak.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = "com.prak")
public class AppConfig {

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate();
	}

}
