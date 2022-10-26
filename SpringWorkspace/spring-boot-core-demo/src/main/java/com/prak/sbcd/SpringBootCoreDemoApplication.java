package com.prak.sbcd;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCoreDemoApplication.class, args);
	}

	@Bean
	public Scanner kbinput() {
		return new Scanner(System.in);
	}

	@Bean
	public LocalDate today() {
		return LocalDate.now();
	}

}
