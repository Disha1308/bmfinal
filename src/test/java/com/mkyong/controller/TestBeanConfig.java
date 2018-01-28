package com.mkyong.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

@Configuration
@ComponentScan(basePackages = "com.mkyong.controller")
public class TestBeanConfig {
	
	@Bean
	MultiplicationService multiplicationservice() {
	return new MultiplicationService();
	}
	
	@Bean
	NumberDAO numberDao() {
	NumberDAO numberdao =new NumberDAO();
	return numberdao;
	}
}
