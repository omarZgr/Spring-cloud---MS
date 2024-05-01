package com.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.application.entity.Product;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class OrderController {
	
 	
	
	@GetMapping("/orders/{oid}")
	public Product getAllProducts(@PathVariable("oid") long oid)
	{
		
		Product product = new Product()  ;
		
		product.setId(23) ;
		product.setDescription("test")  ;
		product.setName("TestName")  ;
		product.setPrice(55) ;
		product.setQuantity(4);
		return product  ;
		
	}

}
