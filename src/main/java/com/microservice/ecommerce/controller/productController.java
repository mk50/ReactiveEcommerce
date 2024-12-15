package com.microservice.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.ecommerce.model.Product;
import com.microservice.ecommerce.service.ProductService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

@RestController
public class productController {
	
	@Autowired
	private ProductService productService;
	@GetMapping(value = "/products", produces = MediaType.APPLICATION_NDJSON_VALUE)
    public Flux<Product> getAllProducts() {
        return productService.findAllProducts(); 
    }

}
