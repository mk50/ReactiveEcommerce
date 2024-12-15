package com.microservice.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.ecommerce.model.Product;
import com.microservice.ecommerce.repository.ProductRepository;

import reactor.core.publisher.Flux;

@Service
public class ProductService {
	
	@Autowired
	private  ProductRepository productRepository;
    public Flux<Product> findAllProducts() {
        return productRepository.findAll();
    }

}
