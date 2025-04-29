package com.app_budget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AppBudgetApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppBudgetApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/income").allowedOrigins("http://localhost:3306");
				registry.addMapping("/expenses").allowedOrigins("http://localhost:3306");
			}
		};
	}

}
