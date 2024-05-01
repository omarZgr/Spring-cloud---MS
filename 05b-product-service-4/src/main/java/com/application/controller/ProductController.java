package com.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.application.entity.Product;
import com.application.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductService productService  ;
	
	
	@GetMapping("/product/{oid}")
	public Product getAllProducts(@PathVariable("oid") long oid)
	{
		
		Product product =productService.getProductById(oid) ;
		
		product.setDescription("Instance------4")   ;
		
		return   product  ;
	}

}
