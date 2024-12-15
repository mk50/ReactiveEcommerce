package com.microservice.ecommerce.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "PRODUCT")
public class Product {
	
	@Id
	private Long Id;
	private String name;

}
