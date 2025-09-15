package com.example.spring_mvc_library;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class SpringMvcLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcLibraryApplication.class, args);
	}

}
