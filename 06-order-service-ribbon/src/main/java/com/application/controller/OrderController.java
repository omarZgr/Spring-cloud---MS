package com.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.application.entity.Product;
import com.application.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class OrderController {
	
	private final OrderService orderService  ;
	
	
	@GetMapping("/orders/{oid}")
	public Product getAllProducts(@PathVariable("oid") long oid)
	{
		Product product =orderService.getProductById(oid);
		
		product.setDescription(product.getDescription() + "   this from ribbon")  ;
		
		return product ;
	}

}
