package com.microservice.ecommerce.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Product {
	
	@Id
	private Long Id;
	private String name;

}
