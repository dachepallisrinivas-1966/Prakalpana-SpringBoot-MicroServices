package com.prak.config;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.prak")
public class MyBeanConfig {
    @Bean
    public Scanner kbinput() {
        return new Scanner(System.in);
    }
    
    @Bean
    public LocalDate today() {
        return LocalDate.now();
    }
} 