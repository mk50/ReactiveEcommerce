package com.microservice.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.ecommerce.model.Product;
import com.microservice.ecommerce.repository.ProductRepo;

import reactor.core.publisher.Flux;

@Service
public class ProductService {
	
	private final ProductRepo productRepository;

    @Autowired
    public ProductService(ProductRepo productRepository) {
        this.productRepository = productRepository;
    }
	
    public Flux<Product> findAllProducts() {
        return productRepository.findAll();
    }

}
